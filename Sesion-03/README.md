# Sesión #3: JUnit & TestNG

## :dart: Objetivos

* Ejecutar pruebas con el framework de pruebas de JUnit y de TestNG.
* Crear anotaciones a las pruebas para validación de casos.

## ⚙ Requisitos

- Editor de código
  - IntelliJ IDEA
- Programación colaborativa
  - Code with me
- Control de versiones.
  - Git
  - Tener una cuenta de GitHub
- Entorno de desarrollo de Java.
  - Java JDK 8+
  - Gradle 7+

## 📂 Contenido

### <ins> Razones para migrar de JUnit 4 a JUnit 5 </ins>

Entre las múltiples razones que podemos encontrar para utilizar JUnit 5 podemos encontrar: 
- JUnit 5 aprovecha las características de Java 8 o posterior, como las funciones lambda, lo que hace que las pruebas sean más potentes y fáciles de mantener.
- JUnit 5 ha agregado algunas características nuevas muy útiles para describir, organizar y ejecutar pruebas. Por ejemplo, las pruebas obtienen mejores nombres para mostrar y se pueden organizar jerárquicamente.
- JUnit 5 está organizado en varias bibliotecas, por lo que solo se importan a su proyecto las funciones que necesita. Con sistemas de compilación como Maven y Gradle, incluir las bibliotecas adecuadas es fácil.
- JUnit 5 puede usar más de una extensión a la vez, lo que JUnit 4 no podría (solo se puede usar un corredor a la vez). Esto significa que puede combinar fácilmente la extensión Spring con otras extensiones (como su propia extensión personalizada).

El siguiente ejemplo muestra las diferencias entre JUnit 4 y 5 a nivel de arquitectura, aserciones, entre otros [Ejemplo 01: Diferencias entre JUnit 4 y JUnit 5](./Ejemplo-01)

Con base en el ejemplo anterior, vamos a desarrollar el primer reto de esta sesión [Reto 01: Migrar pruebas de JUnit 4 a JUnit5](./Reto-01)

---
### <ins>Ejecución condicional de las pruebas</ins>

La API de extensión ExecutionCondition en JUnit Jupiter permite a los desarrolladores habilitar o deshabilitar un contenedor o probar en función de ciertas condiciones mediante programación. El ejemplo más simple de tal condición es la DisabledCondition incorporada que admite la anotación @Disabled (consulte Disabling Tests)

En el siguiente ejemplo veremos los diferentes condicionales que se pueden manejar para JUnit [Ejemplo 02: Diferencias entre JUnit 4 y JUnit 5](./Ejemplo-02)

Para este reto vamos a realizar pruebas unitarias con JUnit [Reto 02: Pruebas unitarias con JUnit](./Reto-02)

---
### <ins> Prueba con TestNG </ins>

#### ¿Qué es TestNG?

TestNG es un marco de pruebas de automatización en el que NG significa "Próxima Generación". TestNG está inspirado en JUnit, que usa las anotaciones (@). TestNG supera las desventajas de JUnit y está diseñado para facilitar las pruebas de un extremo a otro.

Con TestNG, puedes generar un informe adecuado y puedes saber fácilmente cuántos casos de prueba se pasan, fallan y se omiten. Puedes ejecutar los casos de prueba fallidos por separado.

Por ejemplo:

* Imagina que tienes cinco casos de prueba, escribes un método para cada caso de prueba (supongamos que el programa se escribe usando el método principal sin usar testNG). Cuando ejecutas este programa primero, tres métodos se ejecutan correctamente y el cuarto método falla. Luego corriges los errores presentes en el cuarto método, ahora solo deseas ejecutar el cuarto método porque los primeros tres métodos se ejecutan de todos modos con éxito. Esto no es posible sin utilizar TestNG.

* Hablando de TestNG con Selenium se genera el archivo testng-failed.xml en la carpeta de salida de la prueba. Si deseas ejecutar solo casos de prueba fallidos, lo único que debes hacer es ejecutar este archivo XML. De esta forma se ejecutarán solo casos de prueba fallidos.

##### ¿Por qué utilizar TestNG con Selenium?

Las pruebas de Selenium predeterminadas no generan un formato adecuado para los resultados. Usando TestNG con Selenium, podemos generar mejores reportes de resultados de pruebas.

La mayoría de los usuarios de Selenium usan TestNg más que Junit debido a sus ventajas. Hay tantas características de TestNG, pero solo nos centraremos en las más importantes que podemos usar en Selenium. Las siguientes son las características clave de Selenium TestNG:

* Generar el informe en un formato adecuado que incluya una serie de ejecuciones de casos de prueba, la cantidad de casos de prueba aprobados, la cantidad de casos de prueba fallidos y la cantidad de casos de prueba omitidos.
* Se pueden agrupar varios casos de prueba más fácilmente convirtiéndolos en un archivo testng.xml. En el que puede establecer prioridades sobre qué caso de prueba debe ejecutarse primero.
* El mismo caso de prueba se puede ejecutar varias veces sin bucles con solo usar la palabra clave llamada "invocation count".
* Con TestNG, puedes ejecutar varios casos de prueba en varios navegadores.
* TestNG se puede integrar fácilmente con herramientas como TestNG Maven, Jenkins, etc.
* Las anotaciones utilizadas en las pruebas son muy fáciles de entender, por ejemplo: @BeforeMethod, @AfterMethod, @BeforeTest, @AfterTest
* WebDriver no tiene un mecanismo nativo para generar informes. TestNG puede generar el informe en un formato legible.

A continuación veremos un ejemplo de uso de TestNG en JAVA [Ejemplo 03: TestNG](./Ejemplo-03)

En este último reto de la sesión veremos como hacer pruebas con selenium y TestNG [Reto 03: Pruebas TestNG con Selenium](./Reto-03)

## Postwork :memo:

Encuentra las indicaciones y consejos para reflejar los avances de tu proyecto de este módulo.

- [Postwork: Analisis y pruebas del entrevistador con integración continua](./Postwork/README.md)




