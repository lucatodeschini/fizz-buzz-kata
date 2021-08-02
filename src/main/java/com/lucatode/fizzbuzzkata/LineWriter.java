package com.lucatode.fizzbuzzkata;

import java.util.ArrayList;
import java.util.List;

public class LineWriter {
    public List<String> writeLines(int n) {
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
