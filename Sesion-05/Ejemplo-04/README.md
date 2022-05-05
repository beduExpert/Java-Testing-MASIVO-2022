# Ejemplo 4 - Inyección de Mocks

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


### ¿Qué es la inyección de dependencias?

La inyección de dependencia es un patrón de diseño que podemos usar para implementar IoC, donde el control que se
invierte establece las dependencias de un objeto.

La conexión de objetos con otros objetos, o la “inyección” de objetos en otros objetos, la realiza un ensamblador en
lugar de los objetos mismos.

Así es como crearíamos un nuevo objeto en la programación tradicional:

```java

public class Store {
    private Item item;

    public Store() {
        item = new ItemImpl1();
    }
}
```

En el ejemplo anterior, necesitamos instanciar una implementación de la interfaz Item dentro de la propia clase Store.

Al usar DI, podemos reescribir el ejemplo sin especificar la implementación del Item que queremos:

```java

public class Store {
    private Item item;

    public Store(Item item) {
        this.item = item;
    }
}
```

En nuestro caso podríamos eliminar el setter de nuestra clase e implementar este patron de diseño, sin embargo también
podemos tomar ventajas de las funcionalidades que nos provee mockito para realizar la inyección de mocks.

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
}

```

### Nota

La anotación `@RunWith` se utilizaba para integrar el contexto de prueba con otros frameworks o para cambiar el flujo de
ejecución general en los casos de prueba en JUnit 4.

Con JUnit 5, ahora podemos usar la anotación `@ExtendWith` para proporcionar una funcionalidad similar.

Como ejemplo, para usar las funciones de Spring en JUnit 4:

```
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
{"/app-config.xml", "/test-data-access-config.xml"})
public class SpringExtensionTest {
/*...*/
}
```

Mientras que su equivalente en JUnit 5 sería:

```
@ExtendWith(SpringExtension.class)
@ContextConfiguration(
  { "/app-config.xml", "/test-data-access-config.xml" })
public class SpringExtensionTest {
    /*...*/
}
```
