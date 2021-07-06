package com.crio.qcalc;

public class StandardCalculator {

    private double result;

    public double getResult() {
        return result;
    }

    public void SetResult(double value) {
        if (this.result == 0)
            this.result = value;
    }

    public void add(double d, double e) {
        result = d + e;
    }

    public void substract(int a, int b) {
        result = a - b;
    }
}
