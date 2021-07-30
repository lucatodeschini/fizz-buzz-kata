package com.lucatode.fizzbuzzkata;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LineWriterTest {

    @Test
    void write10Lines(){
        var expectedResult = asList("1", "2", "Fizz", "4", "5", "Fizz", "7", "8", "Fizz", "10");

        var result = writeLines(10);

        assertEquals(expectedResult, result);
    }

    @Test
    void returnFizzIfEvaluatingThree(){
        assertEquals("Fizz", evaluateNumber(3));
    }

    @Test
    void returnFourIfEvaluatingFour(){
        assertEquals("4", evaluateNumber(4));
    }

    private List<String> writeLines(int n) {
        List<String> lines = new ArrayList<>();
        for (int i = 1; i <= n; i++ ) {
            lines.add(evaluateNumber(i));
        }
        return lines;
    }

    private String evaluateNumber(int number){
        if(number % 3 == 0){
            return "Fizz";
        }else{
            return Integer.toString(number);
        }
    }
}
