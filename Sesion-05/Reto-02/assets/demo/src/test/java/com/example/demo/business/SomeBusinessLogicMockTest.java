package com.example.demo.business;

import com.example.demo.data.SomeDataService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


class SomeBusinessLogicMockTest {

//    @InjectMocks
//    SomeBusinessLogic business;

//    @Mock
//    SomeDataService dataServiceMock;

    @Test
    public void calculateSumUsingDataService_basic() {
        // Arrange
        SomeBusinessLogic business = new SomeBusinessLogic();
        SomeDataService dataServiceMock = mock(SomeDataService.class);
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[]{1, 2, 3});
        business.setSomeDataService(dataServiceMock);
        int expectedResult = 6;

        // Act
        int actualResult = business.calculateSumWithADataService();

        // Assert
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void calculateSumUsingDataService_empty() {

        // Arrange
        SomeBusinessLogic business = new SomeBusinessLogic();
        SomeDataService dataServiceMock = mock(SomeDataService.class);
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[]{});
        business.setSomeDataService(dataServiceMock);
        int expectedResult = 0;

        // Act
        int actualResult = business.calculateSumWithADataService();

        // Assert
        assertEquals(expectedResult, actualResult);

        when(dataServiceMock.retrieveAllData()).thenReturn(new int[]{});
        assertEquals(0, business.calculateSumWithADataService());
    }

    @Test
    public void calculateSumUsingDataService_oneValue() {
        // Arrange
        SomeBusinessLogic business = new SomeBusinessLogic();
        SomeDataService dataServiceMock = mock(SomeDataService.class);
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[]{5});
        business.setSomeDataService(dataServiceMock);
        int expectedResult = 5;

        // Act
        int actualResult = business.calculateSumWithADataService();

        // Assert
        assertEquals(expectedResult, actualResult);
    }


//    @Test
//    public void calculateSumUsingDataService_empty() {
//        when(dataServiceMock.retrieveAllData()).thenReturn(new int[]{});
//        assertEquals(0, business.calculateSumWithADataService());
//    }
//
//    @Test
//    public void calculateSumUsingDataService_oneValue() {
//        when(dataServiceMock.retrieveAllData()).thenReturn(new int[]{5});
//        assertEquals(5, business.calculateSumWithADataService());
//    }
}