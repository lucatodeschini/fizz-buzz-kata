package com.lucatode.fizzbuzzkata;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LineWriterTest {

    LineWriter lineWriter = new LineWriter();

    @Test
    void write15Lines(){
        var expectedResult = asList("1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz");

        var result = lineWriter.writeLines(15);

        assertEquals(expectedResult, result);
    }

    @Test
    void returnFizzIfEvaluatingThree(){
        assertEquals("Fizz", evaluateNumber(3));
    }

    @Test
    void returnBuzzIfEvaluatingFive(){
        assertEquals("Buzz", evaluateNumber(5));
    }

    @Test
    void returnFizzBuzzIfEvaluatingFiveteen(){
        assertEquals("FizzBuzz", evaluateNumber(15));
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
