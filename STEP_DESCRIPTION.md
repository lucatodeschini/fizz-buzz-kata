# Step 4 - Multiples of five

In this step we're going to evaluate if a number is multiple of five

## TODO List:
- [ ] 1 - Write a new test and refactor the current
- [ ] 2 - Run the test. (The test won't pass)
- [ ] 3 - Fix the test with the minimum amount of code
- [ ] 4 - Run the test. (The test will pass)
- [ ] 5 - Commit

### 1 - Write a test

In the previous step we've delegate the responsibility of evaluation to the `evaluateNumber` function.

We need to create another test `returnBuzzIfEvaluatingFive` because we want to adapt the evaluation function for returning `Buzz` when a multiple of `five` is provided.

We also need to modify the `write10Lines`, our expectation is now:
`"1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz"`

### 3 - Fix the test with the minimum amount of code

Fix the function to evaluate multiples of five:
```
private String evaluateNumber(int number){
    if(number % 3 == 0){
        return "Fizz";
    }else if(number % 5 == 0){
        return "Buzz";
    } else{
        return Integer.toString(number);
    }
}
```
