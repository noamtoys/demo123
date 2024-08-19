package com.example.demo123.entity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class MathServiceTest {

    @Test
    void testPerformAddition() {

        Calculator calculator = mock(Calculator.class);
        when(calculator.add(2,2)).thenReturn(8);

        MathService mathService = new MathService(calculator);

        int res = mathService.add(2,2);
        assertEquals(8,res);


    }

    @Test
    void testPerformAddition1() {

        Calculator calculator = mock(Calculator.class);
        when(calculator.add(2,2)).thenReturn(1);

        MathService mathService = new MathService(calculator);

        int res = mathService.add(2,2);
        assertEquals(1,res);


    }
}