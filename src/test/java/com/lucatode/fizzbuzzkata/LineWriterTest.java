package com.lucatode.fizzbuzzkata;

import org.junit.jupiter.api.Test;

import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LineWriterTest {

    NumberEvaluator numberEvaluator = new NumberEvaluator();
    LineWriter lineWriter = new LineWriter(numberEvaluator);

    @Test
    void write15Lines(){
        var expectedResult = asList("1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz");

        var result = lineWriter.writeLines(15);

        assertEquals(expectedResult, result);
    }
}
