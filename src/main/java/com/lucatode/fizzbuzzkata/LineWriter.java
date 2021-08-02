package com.lucatode.fizzbuzzkata;

import java.util.ArrayList;
import java.util.List;

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
