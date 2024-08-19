package com.example.demo123.entity;

public class MathService {

    private Calculator calculator;

    public MathService(Calculator calculator) {
        this.calculator = calculator;
    }
    public int add(int a, int b) {
        return calculator.add(a, (b) );
    }

}
