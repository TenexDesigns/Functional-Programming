
Is this a pure function

----------------------------------------
  const globalVar = 10;

function pureFunctionUsingGlobal() {
  return globalVar * 2; // Reading, not modifying
}

------------------------------------------




No, the function pureFunctionUsingGlobal is not a pure function. Even though it doesnt directly modify the global variable `globalVar`, it still depends on the global variable's value. This means that the function's output can change based on the global variable's value, which violates the principle of pure functions that their output should only depend on their input.

A pure function should be self-contained and not rely on any external state, such as global variables. This ensures that the function's behavior is predictable and consistent, making it easier to understand, test, and debug.

In this case, the function pureFunctionUsingGlobal could produce different outputs depending on the value of the global variable `globalVar`, which makes it an impure function. To make the function pure, you should either eliminate the dependency on the global variable or make sure the global variable is immutable (cannot be changed).
  
