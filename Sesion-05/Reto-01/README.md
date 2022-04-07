# Reto 1 - Pruebas con stubs

## :dart: Objetivo

- Generar un servicio básico que utilizaremos como base para realizar pruebas con mocks
- Realizar pruebas utilizando stubs

## ⚙ Requisitos

- IntelliJ IDEA
- Java
- Gradle
- JUnit
- Spring boot

## Desarrollo

En este reto desarrollaremos las pruebas para el método `calculateSumWithADataService`, debemos probar dos casos:

- Cuando nuestro `DataService` regresa un arreglo vació
- Cuando nuestro `DataService` regresa un arreglo con un único valor

Tip: una propuesta de solución es utilizar dos Stubs de nuestro `DataService` para controlar el valor de retorno

`SomeBusinessLogicStubTest.java`
<details>
  <summary>Solución</summary>

1. Generamos nuestros stubs de la clase `SomeDataService`
2. Cada stub cumplirá con una función específica dependiendo del caso de uso
3. En cada caso de prueba inyectamos nuestro stub correspondiente

```java
package com.example.demo.business;

import com.example.demo.data.SomeDataService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class SomeDataServiceStub implements SomeDataService {
    @Override
    public int[] retrieveAllData() {
        return new int[]{1, 2, 3};
    }
}

class SomeDataServiceEmptyStub implements SomeDataService {
    @Override
    public int[] retrieveAllData() {
        return new int[]{};
    }
}

class SomeDataServiceOneElementStub implements SomeDataService {
    @Override
    public int[] retrieveAllData() {
        return new int[]{5};
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

```

</details>