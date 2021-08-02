# Step 5 - Using classes instead of functions

All the logic is still encapsulated in functions inside the tests.
We need to create classes and use them in our application.

Given that we're using two functions we need to iterate twice on the following steps:
- Iteration A for `writeLines`
- Iteration B for `evaluateNumbers`

## TODO List:
1. - [ ] Refactor the tests for instantiate objects and calling methods instead of calling functions.
2. - [ ] Make sure the tests are not compiling
3. - [ ] Make sure it compiles, but the tests are still failing
4. - [ ] Move the logic in classes
5. - [ ] The tests should pass
6. - [ ] Commit


### Iteration A - Refactor the tests for instantiate objects and calling methods instead of calling functions.

In this part of the first step we are going to create a new instance of the `LineWriter` class:

```
public class LineWriterTest {

    LineWriter lineWriter = new LineWriter();
    ...
```

And we have to replace the `writeLines` function invocation with the class method invocation:

```
var result = lineWriter.writeLines(15);
```

Because the class is not existing the application won't compile, but using the IDE we can build the class and the method and be sure it compiles:

```
package com.lucatode.fizzbuzzkata;

import java.util.List;

public class LineWriter {
    public List<String> writeLines(int lines) {
        return null;
    }
}
```

Now the test `write15Lines` is failing, but we just need a couple of adjustment in order to make it pass:

- Add the logic for printing adding numbers to the list:
```
    public List<String> writeLines(int n) {
        List<String> lines = new ArrayList<>();
        for (int i = 1; i <= n; i++ ) {
            lines.add(evaluateNumber(i));
        }
        return lines;
    }
```

- Copy/Past the `evaluateNumber` function in `LineWriter` class:
```
public class LineWriter {
    public List<String> writeLines(int n) {
        ...
    }

    private String evaluateNumber(int number){
        ...
    }
}
```

At this point the test `write15Lines` should pass and we're ready for commit.
Now you can remove the `writeLines` function in the tests.

Note: make sure all tests are passing.

We still have the same `evaluateNumber` function written in two places, clear example of useless duplication.
We're going to remove this duplication in a new iteration of the same todo list `Iteration B`.

### Iteration B - Refactor the tests for instantiate objects and calling methods instead of calling functions.

As we did before, we have to create a new instance of the class `NumberEvaluator`:

```
public class LineWriterTest {

    LineWriter lineWriter = new LineWriter();
    NumberEvaluator numberEvaluator = new NumberEvaluator();
    ...
```

Refactor all the tests containing the `evaluateNumber` function, like this:
```
@Test
void returnFizzIfEvaluatingThree(){
    assertEquals("Fizz", numberEvaluator.evaluateNumber(3));
}
```

Make sure the test compiles, create the new class with a dummy method:
```
public class NumberEvaluator {
    public String evaluateNumber(int number) {
        return null;
    }
}
```

If you run all the refactored tests are red, like:
```
Expected :FizzBuzz
Actual   :null
```

We're going to add the minimum amount of logic to make them pass, copy/pasting the existing logic:
```
public class NumberEvaluator {
    public String evaluateNumber(int number) {
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
}
```

Running the tests, all of them should be green.

Now we can remove the previous `evaluateNumber` function.

The logic is for evaluating a number is still duplicated in `NumberEvaluator` class and `LineWriter` class: we need to inject the behaviour of inside `LineWriter`.

## Iteration C - Inject the duplicated behaviour

```
public class LineWriter {
    private NumberEvaluator numberEvaluator;

    public LineWriter(NumberEvaluator numberEvaluator) {
        this.numberEvaluator = numberEvaluator;
    }

    public List<String> writeLines(int n) {
        List<String> lines = new ArrayList<>();
        for (int i = 1; i <= n; i++ ) {
            lines.add(numberEvaluator.evaluateNumber(i));
        }
        return lines;
    }
}
```

Make sure after this change the tests are still green.
