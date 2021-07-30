# Step 3 - Refactoring for decoupling responsibilities

In the second step we've added a couple of lines for understanding if a number is a multiple of three.
The part of code where we've injected that logic is actually dedicated to provide the list of number, so we need a refactoring for extracting that part of logic in an another testable component.

## TODO List:
- [ ] 1 - Write a test
- [ ] 2 - Run the test. (The test won't pass)
- [ ] 3 - Move a responsibility to the new component
- [ ] 4 - Run the test. (The test will pass)
- [ ] 5 - Commit

### 1 - Write a test

The new responsibility we've added in step 2 is actually providing a number if the input is not multiple of three or else the word "Fizz".

Since the logic has two behaviour we're going to write two tests:
- The first is when the input is multiple of three: `returnFizzIfEvaluatingThree`
    - Asserting `assertEquals("Fizz", evaluateNumber(3))`
- The second test is for not multiples of three: `returnFourIfEvaluatingFour`
    - Asserting `assertEquals("4", evaluateNumber(4))`

In order to avoid building errors we create a dummy function: `private String evaluateNumber(int number){ return "" }"`

### 3 - Move a responsibility to the new component

The new component we've created is the function `evaluateNumber`, 
in order to pass the test we have to move the logic of choosing which string return inside the new function.

The function will be:
```
private String evaluateNumber(int number){
    if(number % 3 == 0){
        return "Fizz";
    }else{
        return Integer.toString(number);
    }
}
```

Note: `evaluateNumber` function can be considered a collaborator because we can eventually refactor it without changing the `writeLines` that 
has the responsibility of creating the list of lines.
