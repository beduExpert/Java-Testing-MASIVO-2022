# Ejemplo 3 - Pruebas con mockito

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

Como puedes ver realizar pruebas con stubs es sencillo y nos permite tener un amplio control sobre nuestras clases, sin
embargo pequeños cambios como añadir un método adicional en la interfaz o cambios en los parámetros de los métodos
provocara múltiples cambios en cascada en nuestros stubs. Adicionalmente no es un método escalable, en nuestro ejemplo 3
casos de prueba requirieron 3 stubs distintos, por lo que mantener todo el código podría ser un problema. Es cierto que
podríamos refactorizar nuestro código para tener una clase stub más general, con la ventaja de no tener que añadir
dependencias adicionales a nuestro proyecto, sin embargo existen librerías más robustas que nos proveen de esta y otras
funcionalidades, como mockito, la cual exploraremos a continuación.

`SomeBusinessLogicMockTest.java`
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
}

```