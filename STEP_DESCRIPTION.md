# Step 7 - Splitting test classes

In the current environment we've a single test class with tests for the NumberEvaluator component and the for the LineWriter component.

In this step we want to refactor the `LineWriterTest` test class and move the tests in an another class.

## TODO List:
1. - [ ] Refactor: split test class in two classes, one for NumberEvaluator, one for LineWriter
2. - [ ] The tests in both classes should pass
3. - [ ] Commit
    
### 1 - Split test classes

As first step, we want to create a new test class called `NumberEvaluatorTest`.
Paste the four tests for the `NumberEvaluator` class in this new test, without removing them from the original test.

The tests in both classes should pass.


### 2 - The tests in both classes should pass

Now remove the tests from `LineWriterTest` class and run the tests again.


## What's next?

1. - [ ] Repackage the project using the hexagonal architecture.
2. - [ ] Move the tests using the same structure we've used for the production code.
3. - [ ] Run all tests.
4. - [ ] Commit