# Step 1 - Write lines

In this step we want to be sure that our application is actually able to write 100 lines in the console.

For simplicity, we're going to assume that is fine write the lines in a list, because interacting with the console would be a bit more complex.
So we can postpone using the real console for now.

## TODO List:
- [ ] 1 - Create a new test
- [ ] 2 - Write the expectation
- [ ] 3 - Run the test. (The test won't pass)
- [ ] 4 - Fix with the minimum amount of code
- [ ] 5 - Run the test. (The test will pass)
- [ ] 6 - Commit

### 1 - Create a new test

- New file `src/test/java/com/lucatode/fizzbuzzkata/LineWriterTest.java`
- New test case inside `LineWriterTest` called `write10Lines`
    - Note that for simplicity we're reducing the scope, 10 instead of 100.

### 2 - Write the expectation

- Inside `write10Lines` we need an expectation, the simplest acceptation ever.
    - `assertEquals(expectedResult, result)`
    - defining `expectedResult` as a list from 1 to 10.
  
### 4 - Fix with the minimum amount of code

- Create a function called `writeLines(int i)` that given a number return a list of strings from "1" to `"i"`.
- Add the minimum amount of logic:
```
List<String> lines = new ArrayList<>();
for (int i = 1; i <= n; i++ ) {
    lines.add(Integer.toString(i));
}
return lines;
```