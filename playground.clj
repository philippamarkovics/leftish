(ns playground
  (:require [clojure.string :as str]))

(defn subtract-vec [[x0 y0] [x1 y1]]
  [(- x0 x1) (- y0 y1)])

(defn magnitude [[x y]]
  (Math/sqrt (+ (* x x) (* y y))))

(defn normalize-vec [v]
  (let [[x y] v
        m (magnitude v)]
    [(/ x m) (/ y m)]))

(defn dot-product [[a b] [c d]]
  (+ (* a c) (* b d)))

(defn ->angle [v w]
  (let [dot (dot-product (normalize-vec v) (normalize-vec w))]
    (if (> dot 1) 0 (Math/acos dot))))

(defn hull-points [points]
  (loop [prev [0 1] ;; start with a helper point that’s definitly outside of the hull
         current [0 0]
         hull-points []]
    (let [[_ next] (->> points
                        (filter #(not= current %))
                        (map (fn [point]
                               [(->angle (subtract-vec prev current)
                                         (subtract-vec point current)) point]))
                        (sort (comp - compare))
                        first)]
      (if (= next (first hull-points))
        hull-points
        (recur current next (conj hull-points next))))))

(defn colinear? [a b c]
  (let [ba (mapv - a b)
        bc (mapv - c b)]
    (zero? (dot-product ba bc))))

(defn remove-colinears [points]
  (let [indices (zipmap points (range (count points)))
        triples (partition 3 1 (concat points (take 2 points)))
        colinear-points (set (map second (filter #(apply colinear? %) triples)))
        valid-indices (vals (apply dissoc indices colinear-points))]
    (println "valid indices" valid-indices)
    (map #(get points %) valid-indices)))

(str/join " → " (-> (hull-points [[1 2] [2 9] [9 30]]) remove-colinears))
