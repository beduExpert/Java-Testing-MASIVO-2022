# Sesión 6: Test Driven Development

## :dart: Objetivos

- Analizar qué es esta técnica de programación guiada por pruebas, sus orígenes y la lógica detrás de su funcionamiento. 
- Aplicar el ciclo rojo, verde, refactorización.
- Explorar la escuela Londres de TDD (de afuera hacia adentro o también conocido como mockistas)
- Explorar la escuela Chicago de TDD (de adentro hacia afuera o también conocido como clasistas)

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
- Frameworks de pruebas
  - Junit 5.7.x

## 📂 Contenido


### <ins>Las Reglas del Test Driven Development</ins>

Los Test Driven Development cuentan con 3 reglas básicas para su desarrollo, en este ejemplo podemos ver de manera práctica como abordarlo [Ejemplo 01:  Las tres leyes de TDD](./Ejemplo-01)

---

### <ins>Fases de la Transformación</ins>

Para TDD se manejan 4 fases de transformación que veremos en los retos de esta sesión, a continuación vemos un contexto de la premisa del principio de transformación junto con un ejemplo práctico.

#### La premisa del principio de transformación

Esta premisa podría parecer bastante radical. Sugiere que las refactorizaciones tienen contrapartes llamadas transformaciones. Las refactorizaciones son operaciones simples que cambian la estructura del código sin cambiar su comportamiento. Las transformaciones son operaciones simples que cambian el comportamiento del código. Las
transformaciones se pueden utilizar como el único medio para pasar la prueba que actualmente falla en el ciclo rojo/verde de refactorización. Las transformaciones tienen una prioridad, o un orden preferido, que si se mantiene, mediante el orden de las pruebas, evitará estancamientos o interrupciones prolongadas en el ciclo rojo/verde.

    ({}–>nil) ningún código en absoluto que pasa a código que emplea null
    (nil->constant)
    (constant->constant+) una constante simple con una constante mas compleja
    (constant->scalar) remplazando con una constante con una variable o un argumento
    (statement->statements) añadiendo masdeclaraciones no condicionales
    (unconditional->if) dividiendo el camino de ejecución
    (scalar->array)
    (array->container)
    (statement->recursion)
    (if->while)
    (expression->function) remplazando una expresióncon una función o un algoritmo
    (variable->assignment) remplazando el valor de una variable 

Este es un ejemplo que muestra la técnica de programación guiada por las pruebas [Ejemplo 02: La premisa del principio de transformación](./Ejemplo-02)

Estos son los retos con los 4 principios de la transformación para TDD:
* [Reto 01: Primera transformación](./Reto-01)
* [Reto 02: Segunda transformación](./Reto-02)
* [Reto 03: Tercera transformación](./Reto-03)
* [Reto 04: Cuarta transformación](./Reto-04)
    
    
 ---

### Postwork :memo:
- [Postwork](./Postwork)




