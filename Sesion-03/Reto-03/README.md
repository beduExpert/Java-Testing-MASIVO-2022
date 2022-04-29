# Reto 3 - Pruebas TestNG con Selenium

## :dart: Objetivos

- Crear prueba con Selenium y TestNG para automatización.

## ⚙ Requisitos

- IntelliJ IDEA
- Java
- Gradle
- TestNG
- Selenium

>**¡Nota para experto(a)!**
>
> A lo largo de este curso los alumnos estarán trabajando en equipos de dos integrantes, por ello como primera actividad el experto definirá las parejas, en caso de ser un grupo con un número impar podría haber equipos de tres personas.

> Los retos buscan emular un entorno real de trabajo, en los mismos habrá descripciones vagas de los requerimientos y el experto fungirá como stakeholder para clarificar dudas o añadir detalles a los requerimientos.

## Desarrollo


Utilizando como base el siguiente código de la calculadora realiza las siguientes pruebas con TestNG

* Una prueba que solo se ejecute cuado nos encontramos en nuestro sistema operativo actual
* Una prueba que solo se ejecute en algún sistema operativo diferente a nuestro sistema operativo actual
* Una prueba que solo se ejecute en el ambiente de desarrollo y configurar nuestras variables de entorno para indicar que estamos en el ambiente de desarrollo
* Una prueba parametrizada para la suma
* Una prueba parametrizada para la multiplicación
* Una prueba con un display name distinto al nombre de la función

Calculator.java

```java
public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int multiply(int a, int b) {
        int result = 0;
        for (int i = 0; i < b; i++) {
            result += add(result, a);
        }
        return result;
    }
}
```


<details>
  <summary>Solución</summary>

Con los conceptos aprendidos en el work, podemos realizar los cambios correspondientes para migrar nuestras pruebas de JUnit 4 a JUnit 5 
  
  CalculatorTest.java
  
  ```java
class CalculatorTest {
    private int a, b;
    private Calculator calculator;

    @BeforeTest
    void setUp() {
        calculator = new Calculator();

        a = ThreadLocalRandom.current().nextInt();
        b = ThreadLocalRandom.current().nextInt();
    }

    @Test
    void testAdd() {
        int result = calculator.add(a, b);

        assertEquals( a + b, result, "Resultado incorrecto de la suma");
    }

    @Test
    void testAddThrowsExceptionWhenIsCalledWithInvalidParams() {
        String c = "hello";

        assertThrows(Exception.class, () -> {
            int result = calculator.add(a, c);

            assertEquals( a + b, result, "Resultado incorrecto de la suma");
        });
    }

    @Test
    void testMultiply() {
        int additionResult = calculator.add(a, b);

        assumeTrue(additionResult == a+b);

        int multiplicationResult = calculator.multiply(a, b);

        Assertions.assertEquals(a * b, multiplicationResult, "Resultado incorrecto de la multiplicación");
    }
}
```
</details>
