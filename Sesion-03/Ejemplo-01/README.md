# Ejemplo # 1 - Diferencias entre JUnit 4 y 5

## :dart: Objetivos

- Comparar las herramientas JUnit 4 y JUnit 5

## ⚙ Requisitos

- IntelliJ IDEA
- Java
- Gradle
- JUnit 5


## Desarrollo

### Diferencias entre JUnit 4 y JUnit 5

### Importaciones

JUnit 5 usa el nuevo org.JUnit.jupiter paquete para sus anotaciones y clases. Por ejemplo, org.JUnit.Test se convierte en org.JUnit.jupiter.api.Test.

### Anotaciones

![anotaciones junit 4 y 5](Java-Testing-2021/Sesion-03/Ejemplo-01/assets/anotaciones junit 4 y 5.png)

### Arquitectura

JUnit 4 tiene todo incluido en un solo archivo jar.

Junit 5 se compone de 3 subproyectos, es decir, JUnit Platform, JUnit Jupiter y JUnit Vintage.

- JUnit Platform
 
    Define la API TestEngine para desarrollar nuevos marcos de prueba que se ejecutan en la plataforma.

    
- JUnit Júpiter

    Tiene todas las nuevas anotaciones JUnit y la implementación de TestEngine para ejecutar pruebas escritas con estas anotaciones.
    

- JUnit Vintage

    Para admitir la ejecución de pruebas escritas JUnit 3 y JUnit 4 en la plataforma JUnit 5.

### Aserciones (Assertions)

En Junit 4, org.junit.Assert tiene todos los métodos de aserción para validar los resultados esperados y resultantes.
Aceptan un parámetro adicional para el mensaje de error como PRIMER argumento en la firma del método.

```java
public static void assertEquals(long expected, long actual)
public static void assertEquals(String message, long expected, long actual)
```

En JUnit 5, org.junit.jupiter.Assertions contiene la mayoría de los métodos de aserción, incluidos los métodos adicionales de assertThrows () y assertAll (). assertAll () está en estado experimental a partir de hoy y se usa para aserciones agrupadas.
Los métodos de aserciones de JUnit 5 también tienen métodos sobrecargados para admitir que se imprima un mensaje de error en caso de que la prueba falle

```java
public static void assertEquals(long expected, long actual)
public static void assertEquals(long expected, long actual, String message)
public static void assertEquals(long expected, long actual, Supplier messageSupplier)
```

### Suposiciones (Assumptions)

En Junit 4, org.junit.Assume contiene métodos para establecer suposiciones sobre las condiciones en las que una prueba es significativa. Tiene los siguientes cinco métodos:

- assumeFalse()
- assumeNoException()
- assumeNotNull()
- assumeThat()
- assumeTrue()

En Junit 5, org.junit.jupiter.api.Assumptions contiene métodos para establecer suposiciones sobre las condiciones en las que una prueba es significativa. Tiene los siguientes tres métodos:

- assumeFalse()
- assumingThat()
- assumeTrue()


### Aserciones vs. Suposiciones

Al asumir, verificas los prerrequisitos de la prueba, si no están disponibles o no tienen el valor esperado, no tiene sentido continuar con la prueba.

Por ejemplo, si estuviéramos probando el método borrar de un entrevistador, no tendría sentido ejecutar dicha prueba si el añadir un nuevo entrevistador fallo, entonces podríamos hacer uso de las suposiciones de la siguiente forma:

```java
@Test
public void deletesAnExistentInterviewer() {
    Interviewer interviewer = Interviewer.add(...);

    Assumptions.assumeTrue(interviewer);

    Assertions.assertEquals(interviewer.delete());
}

```

¿Por qué no simplemente usar aserciones? La diferencia es que si la aserción falla, la prueba fallará, pero si la suposición falla, la prueba se ignorará. Aunque en muchas pruebas se utilizan las aserciones, no es así como debería ser. **No queremos probar las funcionalidades de otros métodos**, pero queremos estar seguros de que funcionan correctamente.

Si las pruebas están bien escritas para todas las partes del código, la parte que hace fallar la suposición tendría las pruebas adecuadas que fallarían.

Por ejemplo, si nuestro método add no funciona correctamente, su prueba fallará y deletesAnExistentInterviewer se ignorará.



