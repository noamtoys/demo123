package com.example.demo123.entity;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CalculatorTest {

   @Test
   public void addTest()
   {
       Calculator calculator = new Calculator();
       int res = calculator.add(22,4);
       assertEquals(26 , res);
   }



}