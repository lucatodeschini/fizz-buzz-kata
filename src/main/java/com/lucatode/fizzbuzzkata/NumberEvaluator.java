package com.lucatode.fizzbuzzkata;

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
