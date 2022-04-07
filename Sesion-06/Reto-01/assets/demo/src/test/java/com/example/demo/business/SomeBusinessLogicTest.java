package com.example.demo.business;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SomeBusinessLogicTest {

    @Test
    public void calculateSum_basic() {
        SomeBusinessLogic business = new SomeBusinessLogic();
        int actualResult = business.calculateSum(new int[]{1, 2, 3});
        int expectedResult = 6;
        assertEquals(expectedResult, actualResult);
    }


    @Test
    public void calculateSum_empty() {
        SomeBusinessLogic business = new SomeBusinessLogic();
        int actualResult = business.calculateSum(new int[] { });
        int expectedResult = 0;
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void calculateSum_oneValue() {
        SomeBusinessLogic business = new SomeBusinessLogic();
        int actualResult = business.calculateSum(new int[] { 5});
        int expectedResult = 5;
        assertEquals(expectedResult, actualResult);
    }
}