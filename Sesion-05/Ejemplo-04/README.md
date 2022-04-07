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

### ¿Qué es la inversión de control?

La inversión de control (Inversion of Control - IOC) es un principio en la ingeniería de software que transfiere el
control de objetos o partes de un programa a un contenedor o marco. Lo usamos con mayor frecuencia en el contexto de la
programación orientada a objetos.

A diferencia de la programación tradicional, en la que nuestro código personalizado realiza llamadas a una biblioteca,
IoC habilita un marco para tomar el control del flujo de un programa y realizar llamadas a nuestro código personalizado.
Para habilitar esto, los marcos usan abstracciones con comportamiento adicional incorporado. Si queremos agregar nuestro
propio comportamiento, necesitamos extender las clases del marco o agregar nuestras propias clases.

Las ventajas de esta arquitectura son:

    desvincular la ejecución de una tarea de su implementación
    facilitando el cambio entre diferentes implementaciones
    mayor modularidad de un programa
    Mayor facilidad para probar un programa al aislar un componente o burlarse de sus dependencias y permitir que los componentes se comuniquen a través de contratos.

Podemos lograr la Inversión de Control a través de varios mecanismos tales como: patrón de diseño de estrategia, patrón
de localizador de servicios, patrón de fábrica e inyección de dependencia (Dependency Injection - DI).

A continuación, veremos DI.

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
