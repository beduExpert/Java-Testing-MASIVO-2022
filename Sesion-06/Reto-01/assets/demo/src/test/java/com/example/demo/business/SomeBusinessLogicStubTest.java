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

class SomeBusinessLogicStubTest {

    @Test
    public void calculateSumUsingDataService_basic() {
        SomeBusinessLogic business = new SomeBusinessLogic();
        business.setSomeDataService(new SomeDataServiceStub());
        int actualResult = business.calculateSumWithADataService();
        int expectedResult = 6;
        assertEquals(expectedResult, actualResult);
    }

}