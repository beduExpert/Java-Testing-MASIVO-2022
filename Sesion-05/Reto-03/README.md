# Reto 3 - Inyección de mocks

## :dart: Objetivo

- Realizar pruebas utilizando mocks
- Utilizar mockito
- Analizar las características de la inversión decontrol e inyección de dependencias.

## ⚙ Requisitos

- IntelliJ IDEA
- Java
- Gradle
- JUnit
- Spring boot
- Mockito

## Desarrollo

En este reto desarrollaremos las pruebas para el método `calculateSumWithADataService`, en lugar de setear manualmente
nuestros mocks, los inyectaremos tomando ventaja de las anotaciones de mockito como lo vimos en el ejemplo anterior,
debemos probar dos casos:

- Cuando nuestro `DataService` regresa un arreglo vació
- Cuando nuestro `DataService` regresa un arreglo con un único valor

`SomeBusinessLogicMockTest.java`
<details>
  <summary>Solución</summary>

1. En este ejercicio inyectamos los mocks utilizando las anotaciones de mockito.

```java
package com.example.demo.business;

import com.example.demo.data.SomeDataService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


@ExtendWith(MockitoExtension.class)
class SomeBusinessLogicMockTest {

    @InjectMocks
    SomeBusinessLogic business;

    @Mock
    SomeDataService dataServiceMock;

    @Test
    public void calculateSumUsingDataService_basic() {
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[]{1, 2, 3});
        assertEquals(6, business.calculateSumWithADataService());
    }

    @Test
    public void calculateSumUsingDataService_empty() {
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[]{});
        assertEquals(0, business.calculateSumWithADataService());
    }

    @Test
    public void calculateSumUsingDataService_oneValue() {
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[]{5});
        assertEquals(5, business.calculateSumWithADataService());
    }
}

```

</details>


