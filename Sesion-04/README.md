# Sesión 4: Black and White Box Testing

## :dart: Objetivos

- Analizar qué son las pruebas de tipo white box testing
- Analizar qué son las pruebas de tipo black box testing
- Comparar y distinguir las diferencias entre black box y white box testing
- Implementar pruebas de caja negra
- Implementar pruebas de caja blanca

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


### <ins>Técnicas de caja negra: Requerimiento funcional</ins>

Como vimos en la sesión 2 (Testing processes in Agile) de nuestro módulo de QA Automation Testing las historias de
usuario (en formato AS, WANT, SO) nos permiten describir de forma rápida y abreviada una acción que el usuario desea
realizar en nuestro sistema. Complementadas con descripciones de BDD (formato GIVEN, WHEN. THEN) nos permiten definir
requerimientos y escribir pruebas. Sin embargo dichas herramientas pueden carecer de detalles necesarios, para ello otra
técnica de escribir requerimientos y que podemos usar para probar nuestro software son los casos de uso.

#### Diferencias entre historias de usuario y casos de uso

Las historias de usuario tratan sobre necesidades. Cuando escribe una historia de usuario, lo que está describiendo es
una necesidad del usuario. Es algo que el usuario debe hacer en su trabajo diario. Si nunca construyes ningún software
para él, ¡esa necesidad seguirá existiendo!

Los casos de uso se refieren al comportamiento que creará en el software para satisfacer esas necesidades. Un
desarrollador que necesita crear software que funcione debe poder leer un caso de uso y tener una buena idea de lo que
debe hacer el software. Por lo general, tiene muchos detalles y describe todo lo que el desarrollador necesita construir
para satisfacer las necesidades del usuario. Es por eso que debe tener muchos más detalles y ser claro e inequívoco.

Las historias de usuario son fáciles de leer para los usuarios. Cuando escribe una historia de usuario, en lo que se
concentra es en escribir algo que cualquiera pueda entender, en el idioma de los usuarios. Todos sabemos que los
desarrolladores tienen mucha más paciencia para hablar sobre los detalles del software que están creando que los
usuarios, por lo que las historias de los usuarios deben ser breves. Una historia de usuario debe expresar un
pensamiento completo en solo un par de oraciones.

Los casos de uso describen una interacción completa entre el software y los usuarios (y posiblemente otros sistemas).
Cuando realiza un análisis de casos de uso, lo que está haciendo es diseñar una solución funcional que satisfaga las
necesidades de los usuarios. Debe ser algo que los desarrolladores puedan implementar. Es posible que una historia de
usuario genere varios casos de uso. Y cuando combina todos sus casos de uso en un documento de caso de uso, terminará
con una descripción completa de cada interacción entre el usuario y el software que planea construir. Y si su software
tiene que interactuar con múltiples sistemas, puede terminar tratando a esos otros sistemas como actores en su caso de
uso.

Cabe aclarar que: de **una historia de usuario pueden desprenderse múltiples casos de uso**

#### De historia de usuario a caso de uso

A continuación describiremos una historia de usuario en diferentes etapas, hasta llegar a una descripción detallada en
un caso de uso. La siguiente historia representa la actividad que tiene que llevar a cabo un estudiante apra registrarse
en la plataforma de su universidad

#### Historia de usuario

Registrarse como estudiante

Un usuario quire registrarse en el sistema como estudiante para poder acceder a las funcionalidades dle estudiante.

#### Historia de usuario (As, Want, So)

Registrarse como estudiante

AS un usuario I WANT poder registrarme como estudiante SO puedo ingresar a las funcionalidades para usuario estudiante

#### Descripción Given, When, Then (GWT)

Criterios de aceptación

GIVEN un usuario WHEN ingresa los datos complementarios: Carrera y Nombre THEN se crea su registro en la aplicación

GIVEN un usuario WHEN ingresa nombre de carrera o institución (cadena mayor a 3 caracteres)
THEN Se despliegan las posibles opciones encontradas agrupadas y puede seleccionar alguna de estas.

GIVEN un usuario WHEN Borra el campo de carrera THEN se oculta el modal

GIVEN un usuario WHEN selecciona su carrera THEN el botón Siguiente se desbloquea y puede continuar con su registro

GIVEN un usuario WHEN Inserta su nombre (min 3 caracteres)
THEN Se desbloquea el botón de continuar y puede finalizar su registro

#### Caso de Uso


- [Ejemplo 01: Casos de Uso](./Ejemplo-01)
    - [Reto 01: Casos de usos](./Reto-01)
---

#### <ins>Tema 4: Prueba del Test Plan</ins>


- [Ejemplo 02: Técnicas de caja negra](./Ejemplo-02)
    - [Reto 02: Pruebas con técnicas de caja negra](./Reto-02)
- [Ejemplo 03: Técnicas de caja blanca](./Ejemplo-03)
- [Postwork](./Postwork)




