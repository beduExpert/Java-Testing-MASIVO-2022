# Ejemplo 2 - Añadir un data service

## :dart: Objetivo

- Generar un servicio básico que utilizaremos como base para realizar pruebas con mocks

## ⚙ Requisitos

- IntelliJ IDEA
- Java
- Gradle
- JUnit
- Spring boot

## Desarrollo

En el mundo de las aplicaciones web es común que nuestra logica de negocio (servicio, caso de uso, etc.) obtenga la
información que necesita de alguna fuente externa: archivos, bases de datos, APIs, etc. Por ello en este ejemplo
añadiremos un nuevo método a nuestra clase de `SomeBusinessLogic` el cual obtendrá la información necesaria de un _data
service_

`SomeBusinessLogic.java`

```java
package com.example.demo.business;

public class SomeBusinessLogic {

    private SomeDataService someDataService;

    public int calculateSum(int[] data) {
        int sum = 0;
        for(int value:data) {
            sum += value;
        }
        return sum;
    }

    public int calculateSumWithADataService() {
        int sum = 0;
        int[] data = someDataService.retrieveAllData();
        for(int value:data) {
            sum += value;
        }

        return sum;
    }
}

```

Ahora procederemos a crear la interfaz de nuestro DataService


`SomeDataService.java`
```java
package com.example.demo.data;

public interface SomeDataService {

    int[] retrieveAllData();
}
```

> **💡 Nota para experto(a)**
>
> Generar la reflexión general del grupo alrededor de ¿cómo podríamos probar este nuevo método? ¿Qué problemas nos encontraríamos?


Si queremos probar nuestro nuevo método `calculateSumWithADataService`, necesitamos algún mecanismo que nos permita
controlar la respuesta de nuestro _DataService._ Como primer paso añadiremos un setter para la
propiedad `someDataService`

```
public void setSomeDataService(SomeDataService someDataService) {
        this.someDataService = someDataService;
    }
```

Cuando nuestra logica se comunica con servicios externos, no queremos que nuestro test presente fallas debido al estado
de tests servicios, adicionalmente queremos que nuestros tests sean rapidos y hacer llamadas a servicios externos añade
tiempo a la ejecución, por ello crearemos un Stub de nuestro `DataService`

`SomeBusinessLogicStubTest.java`
```java
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
```
