
A **pure function** is a function that always returns the same output for the same input and does not modify any external state or cause any side effects. This means that a pure function, given the same input, will always produce the same output. Pure functions rely only on the input provided to them and do not affect any other part of the system [Source 0](https://www.geeksforgeeks.org/functional-programming-paradigm/), [Source 1](https://geekflare.com/functional-programming/), [Source 2](https://www.freecodecamp.org/news/pure-function-vs-impure-function/).

```javascript
// A pure function
function add(a, b) {
  return a + b;
}

// Calling it with the same values always gives the same result
console.log(add(2, 3)); // Always logs 5
```

**Side effects** are any changes in the system that occur during the calculation of a function that are not related to producing the function's output. This can include modifying a global variable, changing the value of a parameter, making an HTTP request, altering the DOM, and so on. If a function produces side effects, it is considered impure. Pure functions do not produce side effects [Source 2](https://www.freecodecamp.org/news/pure-function-vs-impure-function/), [Source 3](https://www.geeksforgeeks.org/functional-programming-pure-and-impure-functions/).

```javascript
let x = 1;

// An impure function
function addY(y) {
  x += y;
}

addY(2); // Alters the global variable x, so it's impure
```

Pure functions cannot use global state as that would make them impure. Using global state would mean the function is relying on data outside of its parameters to produce a result, which violates the rules of a pure function. Therefore, using global state would be considered a side effect [Source 2](https://www.freecodecamp.org/news/pure-function-vs-impure-function/).

Here are some examples of pure and impure functions:

```javascript
// Pure function
function squareNumber(n) {
  return n * n;
}

// Impure function
let outsideVariable = 2;
function multiplyWithOutsideVariable(n) {
  return n * outsideVariable; // Depends on a variable outside of its scope
}
```

In terms of when to use pure or impure functions, it generally depends on the context:

- **Pure functions** are generally used when you want to transform data. They take some input and return a new output without modifying the input or anything else in the system. This makes them predictable and easy to test.

- **Impure functions** are generally used when you need to interact with the outside world (like reading/writing to a database, making network requests, etc.), or when you need to change the state of your application.

Functional programming has several benefits such as easier debugging and testing, better reusability, and improved code readability. However, it also has its downsides such as a steep learning curve for those used to imperative or object-oriented programming, and it might not be suitable for all types of problems [Source 0](https://www.geeksforgeeks.org/functional-programming-paradigm/), [Source 1](https://geekflare.com/functional-programming/), [Source 2](https://www.freecodecamp.org/news/pure-function-vs-impure-function/), [Source 3](https://www.geeksforgeeks.org/functional-programming-pure-and-impure-functions/), [Source 6](https://www.freecodecamp.org/news/an-introduction-to-the


