package com.lucatode.fizzbuzzkata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberEvaluatorTest {

    NumberEvaluator numberEvaluator = new NumberEvaluator();

    @Test
    void returnFizzIfEvaluatingThree(){
        assertEquals("Fizz", numberEvaluator.evaluateNumber(3));
    }

    @Test
    void returnBuzzIfEvaluatingFive(){
        assertEquals("Buzz", numberEvaluator.evaluateNumber(5));
    }

    @Test
    void returnFizzBuzzIfEvaluatingFiveteen(){
        assertEquals("FizzBuzz", numberEvaluator.evaluateNumber(15));
    }

    @Test
    void returnFourIfEvaluatingFour(){
        assertEquals("4", numberEvaluator.evaluateNumber(4));
    }
}
