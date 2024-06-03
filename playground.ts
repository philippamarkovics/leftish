let isDone: boolean = false;
let age: number = 25;
let list: number[] = [1, 2, 3];
let tuple: [string, number] = ["hello", 10];

// Defining an interface for a person

interface Person {
  name: string;
  age?: number; // Optional property
  sayHello(): string; // Method
}

const user: Person = {
  name: "Rhababer Rhababer",
  age: 30,
  sayHello: function (): string {
      return `Hello, my name is ${this.name}`;
  },
};

function add(x: number, y: number): number {
  return x + y;
}

const subtract = (x: number, y: number): number => {
  return x - y;
}

// Look I don’t know any Typescript, okay?

const answers: string[] = [
  "It is certain",
  "It is decidedly so",
  "Without a doubt",
  "Yes, definitely",
  "You may rely on it",
  "As I see it, yes",
  "Most likely",
  "Outlook good",
  "Yes",
  "Signs point to yes",
  "Reply hazy, try again",
  "Ask again later",
  "Better not tell you now",
  "Cannot predict now",
  "Concentrate and ask again",
  "Don't count on it",
  "My reply is no",
  "My sources say no",
  "Outlook not so good",
  "Very doubtful"
];

// Shake the damn thing

function shake(): string {
  const randomIndex = Math.floor(Math.random() * answers.length);
  return answers[randomIndex];
}
