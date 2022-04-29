# Reto 1 - Migración de pruebas de JUnit4 a JUnit5

## :dart: Objetivos

- Migrar pruebas de JUnit4 a JUnit5 para actualización de código.

## ⚙ Requisitos

- IntelliJ IDEA
- Java
- Gradle
- JUnit
- JUnit 5
- Code with me
- Una cuenta de GitHub

>**¡Nota para experto(a)!**
>
> A lo largo de este curso los alumnos estarán trabajando en equipos de dos integrantes, por ello como primera actividad el experto definirá las parejas, en caso de ser un grupo con un número impar podría haber equipos de tres personas.

> Los retos buscan emular un entorno real de trabajo, en los mismos habrá descripciones vagas de los requerimientos y el experto fungirá como stakeholder para clarificar dudas o añadir detalles a los requerimientos.

## Desarrollo

Dado el siguiente código de una calculadora básica con pruebas en JUnit 4 migrar las pruebas a JUnit 5.

Calculator.java

```java
public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int multiply(int a, int b) {
        int result = 0;
        for (int i = 0; i < b; i++) {
            result += add(result,a);
        }
        return result;
    }
}
```

CalculatorTest.java

```java
public class CalculatorTest {
    private int a,b;
    
    
    @Before
    public void setUp(){
        a = ThreadLocalRandom.current().nextInt();
        b = ThreadLocalRandom.current().nextInt();
    }

    @Test
    public void testAdd() {       
        int result = calculator.add(a, b);

        assertEquals("Resultado incorrecto de la suma", a + b, result);
    }

    @Test(expected = Exception.class)
    public void testAddThrowsExceptionWhenIsCalledWithInvalidParams() {
        String c = "hello";
        int result = calculator.add(a, c);

        assertEquals("Resultado incorrecto de la suma", a + b, result);
    }

    @Test
    public void testMultiply() {
        int additionResult = calculator.add(a, b);

        assumeNotNull(additionResult);

        int multiplicationResult = calculator.multiply(a, b);

        Assertions.assertEquals("Resultado incorrecto de la multiplicación",a * b, multiplicationResult);
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

    @BeforeEach
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
