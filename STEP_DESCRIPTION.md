# Step 5 - FizzBuzz

Third rule of the game: `For numbers which are multiples of both three and five print FizzBuzz instead of the number`.

## TODO List:
- [ ] Refactor the `write10Lines`, no multiples of both three and five is in the first 10 lines.
- [ ] Be sure the new test `write15Lines` is passing.
- [ ] Create a new test to cover the rule "multiples of both three and five".
- [ ] Run the test, be sure they're not passing.
- [ ] Add the minimum logic for making the test pass
- [ ] Run the tests, they should be green
- [ ] Commit

### 1 - Refactor the `write10Lines` in `write15Lines`, no multiples of both three and five is in the first 10 lines.

Extending the number of lines to `15`, the current implementation should return: `"1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "Fizz"`

Before adding FizzBuzz:
- expected result: `"1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "Fizz"`
- `writeLines(15)` as SUT
- Make sure the test is passing 

Note: we're just extending the first test with the current logic, we should be sure the logic is applicable to the first 15 numbers.

### 3 - Create a new test to cover the rule "multiples of both three and five"

Add a new test to cover the expected result:
```
@Test
void returnFizzBuzzIfEvaluatingFiveteen(){
    assertEquals("FizzBuzz", evaluateNumber(15));
}
```

Modify the expected result of `write15Lines` to:
- `"1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz"`

Run the tests, both of them should be red.

### 4 - Add the minimum logic for making the test pass

Adding the new condition in the `if`:
```
private String evaluateNumber(int number){
        if((number % 3 == 0) && (number % 5 == 0)){
            return "FizzBuzz";
        }else if(number % 3 == 0){
            return "Fizz";
        }else if(number % 5 == 0){
            return "Buzz";
        } else{
            return Integer.toString(number);
        }
    }
```



