# Step 2 - Check for multiples of three

The second rule: `For multiples of three print Fizz instead of the number` means we have to check for multiples of three and replace them with Fizz.

## TODO List:
- [ ] 1 - Refactoring the current test
- [ ] 2 - Run the test. (The test won't pass)
- [ ] 3 - Fix with the minimum amount of code
- [ ] 4 - Run the test. (The test will pass)
- [ ] 5 - Commit

### 1 - Refactoring the current test

Since we want to have a different output and the first test won't be valid anymore, we have to change the expectation.

From:
`"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"`
The expectation become:
`"1", "2", "Fizz", "4", "5", "Fizz", "7", "8", "Fizz", "10"`

### 3 - Fix with the minimum amount of code

Adding the following code inside the `for` loop actually makes the function meeting out expectation. 
```
if(i % 3 == 0){
    lines.add("Fizz");
}else{
    lines.add(Integer.toString(i));
}
```

Note: another responsibility is added, the check of the multiples of three, we need probably to decouple it in the next iterations.
