# 🌘 Leftish

A VS Code color theme with minimal highlighting inspired by [Left](https://100r.co/site/left.html). Dark version coming soon.

## Motivation

* Most VS Code themes look like fireworks making it hard to discern any meaning from the colors. This one aims to be easy on the eyes and reserves colors for meaningful things.
* Emphasize: comments, selections, matches, definitions (what you search for and what you communicate about)
* De-emphasize: control flow statements (if, else, loops, etc) — those are usually the most obvious and least interesting parts of the program

Leftish is heavily inspired by [Left](https://100r.co/site/left.html), [Alabaster](https://github.com/tonsky/sublime-scheme-alabaster) and [brutalist-theme](https://asylum.madhouse-project.org/blog/2018/09/06/the-brutalist-path/).

## How can I use it?

* In VS Code, go to `View` → `Extensions`
* Search for "Leftish" and click "Install"
* After it’s installed, click "Set Color Theme"

## Recommendations

For a calmer editing experience, I recommend the following settings:

* Hide the activity bar: `View` → `Appearance` → `Activity Bar Position` → `Hidden`
* Hide the sidebar: `⌘ B` or `Ctrl B`
* Use the Commands Palette instead: `⇧ ⌘ P` or `⇧ Ctrl P`
* Disable icons, rainbow parens, indentation guides, breadcrumbs, lightbulbs *sigh*, and line numbers (use `Ctrl G` instead) by adding this to your User Settings JSON file (`⇧ ⌘ P` → `Open User Settings (JSON)`):

```JSON
"workbench.editor.showIcons": false,
"workbench.layoutControl.enabled": false,
"workbench.iconTheme": null,
"editor.bracketPairColorization.enabled": false,
"editor.guides.indentation": false,
"editor.lightbulb.enabled": "off",
"editor.lineNumbers": "off",
"editor.renderWhitespace": "selection",
```

## Disclaimer

I’m mostly using Clojure/LISP in my day-to-day work so the theme might be heavily biased towards this. I also checked it against various JS, TS, HTML and CSS files but you might run into cases where things look weird … which brings us to the next section.

## But it doesn’t support…

Feel free to open a PR with whatever you need. If it fits the theme, I’ll probably merge it.

◇