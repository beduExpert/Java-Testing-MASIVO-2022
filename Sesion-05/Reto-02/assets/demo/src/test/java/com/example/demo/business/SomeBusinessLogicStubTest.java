package com.example.demo.business;

import com.example.demo.data.SomeDataService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class SomeDataServiceStub implements SomeDataService {
    @Override
    public int[] retrieveAllData() {
        return new int[] { 1, 2, 3 };
    }
}

class SomeDataServiceEmptyStub implements SomeDataService {
    @Override
    public int[] retrieveAllData() {
        return new int[] { };
    }
}

class SomeDataServiceOneElementStub implements SomeDataService {
    @Override
    public int[] retrieveAllData() {
        return new int[] { 5 };
    }
}

class SomeBusinessLogicStubTest {

    @Test
    public void calculateSumUsingDataService_basic() {
        SomeBusinessLogic business = new SomeBusinessLogic();
        business.setSomeDataService(new SomeDataServiceStub());
        int actualResult = business.calculateSumWithADataService();
        int expectedResult = 6;
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void calculateSumUsingDataService_empty() {
        SomeBusinessLogic business = new SomeBusinessLogic();
        business.setSomeDataService(new SomeDataServiceEmptyStub());
        int actualResult = business.calculateSumWithADataService();//new int[] {}
        int expectedResult = 0;
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void calculateSumUsingDataService_oneValue() {
        SomeBusinessLogic business = new SomeBusinessLogic();
        business.setSomeDataService(new SomeDataServiceOneElementStub());
        int actualResult = business.calculateSumWithADataService();//new int[] { 5 }
        int expectedResult = 5;
        assertEquals(expectedResult, actualResult);
    }
}