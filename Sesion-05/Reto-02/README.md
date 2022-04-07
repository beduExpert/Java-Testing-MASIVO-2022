# Reto 1 - Pruebas con mockito

## :dart: Objetivo

- Realizar pruebas utilizando mocks
- Utilizar mockito

## ⚙ Requisitos

- IntelliJ IDEA
- Java
- Gradle
- JUnit
- Spring boot
- Mockito

## Desarrollo

En este reto desarrollaremos las pruebas para el método `calculateSumWithADataService`, en lugar de stubs utilizaremos
mocks de mockito como lo vimos en el ejemplo anterior, debemos probar dos casos:

- Cuando nuestro `DataService` regresa un arreglo vació
- Cuando nuestro `DataService` regresa un arreglo con un único valor

`SomeBusinessLogicMockTest.java`
<details>
  <summary>Solución</summary>

1. En este ejercicio remplazamos los stubs por mocks de mockito

```java
package com.example.demo.business;

import com.example.demo.data.SomeDataService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


class SomeBusinessLogicMockTest {

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


}

```

</details>


