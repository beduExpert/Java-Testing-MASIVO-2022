# Ejemplo 1 - El costo de probar software

## :dart: Objetivo

* Identificar cuál es el verdadero costo de: probar el software y de no hacerlo

## ⚙ Requisitos

- IntelliJ IDEA
- Java
- Gradle
- JUnit
- Code with me
- Una cuenta de GitHub


## Desarrollo

>**💡 Nota para experto(a)**
>
> Seleccionar un par de equipos para que presenten su implementación del reto 1
> Generar conversación con los siguientes temas: ¿Cómo fue su proceso de desarrollo? ¿Cómo saben que su software está funcionando correctamente? ¿Están probando su software?

### El costo de probar software

La importancia de probar el software y corregir los bugs en un proyecto vas más de una compilación correcta, si no que puede llegar a costar mucho dinero si no se hace en el momento adecuado. Por ejemplo, digamos que una empresa no logró detectar y corregir un bug en la etapa de desarrollo, se saltaron la etapa de pruebas por cuestiones de tiempo — o incluso para ahorrarse dinero — y se lanzó una aplicación web a producción; algunos usuarios comienzan a reportar errores y se tiene que detener el servicio. La empresa tiene que dedicar recursos para revisar el código, encontrar el bug y trabajar en él, costando hasta **100 veces** más de lo que puedo haber costado en una etapa temprana.
¿Por qué puede llegar a costar tanto?
Porque el regresar a corregir un error puede desencadenar que otras secciones del cógido se hayan visto afectados por éste, o includo por el cambio, desencadenando una *avalancha* de revisiones y posibles nuevos cambios.

Un estudio realizado por el Instituto de Nacional de Estándares de Tecnología de Estados Unidos, muestra que si un error es encontrado y corregido en la etapa de toma de requerimientos, puede costar unos 100 USD, si es encontrado en la etapa de pruebas, 1,500 UDS y si es encontrado en producción, 10,000 USD.

Es por esto que no debemos saltarnos el proceso de probar el software, debemos considerarlo nuestra obligación al desarrollar un proyecto de software. Con ésto nos estaremos ahorrando tiempo y lo que podría llegar a ser mucho dinero.

### Eficiencia y eficacia

Las pruebas, así como muchas otras cosas medibles en nuestro entorno, también adaptan la eficacia y eficiencia a las necesidades del ciclo de vida del software. Aquí se presentan las definiciones de ambos términos para pruebas de software:

- **Eficacia:** Produce resultados deseados. Las pruebas deben ser correctamente ejecutadas y con las siguientes características:
  - Ejecutarlas tan rápidamente como sea posible.
  - Tratar de descubrir los errores tempranamente.
  - Encontrar los errores de mayor importancia antes que los de menos importancia.
- **Eficiencia:** Las pruebas son realizadas sin gastos extremos. Hay dos conceptos que tomar en cuenta:
  - Costo de Conformidad: Este se paga para en búsqueda de la calidad, son los costos de detección y prevención de errores
  - Costo de No Conformidad: Este se paga cuándo no se puede conseguir la calidad y generalmente es un costo menor al de Conformidad. 


### ¿Qué es una prueba?

Hemos hablado de la importancia de las pruebas en el ciclo de vida del software, ¿pero qué es en realidad una prueba y cúales son sus características?
Hay dos etapas y conceptos que nos ayudan a entender lo que son las pruebas de software:

- **Validar:** Con esto podemos evitar irnos por el camino equivocado de acuerdo a las necesidades y peticiones del cliente. Sin la validación, podemos terminar construyendo un software que no sea el solicitado o con las características requeridas.
- **Verificar:** Con esto podemos asegurar que lo desarrollado cumpla las características de lo requerido, podemos detectar y corregir errores que pudieran desviar el resultado del objetivo.

Conceptos a tomar en cuenta para las pruebas de software:
- Feature (Característica): Unidad cuya funcionalidad puede ser comprobable y es construida en la evolución de un proyecto de software.
- Subject Under Test (SUT): Característica que se esté probando en el momento.
- Depended-on Component (DOC): Parte del software que no se está verificando en alguna prueba de las que depende el SUT. 
- Test Case: (Caso de Prueba): Procedimiento para validar o verificar el SUT.

#### Ejecución

La ejecución de las pruebas de software se puede definir como la ejecución de un método o conjunto de pruebas. Esto puede incluir uno o más casos de prueba. La ejecución puede generar dos resultados:

## Verde, pasa

Se obtienen los resultados esperados cuando se ejecuta el caso de prueba sobre el SUT. 
También pueden existir falsos negativos, que es cuando se obtiene el resultados esperado aunque el SUT no esté funcionando como debería con algunos error o fallos que pueden pasar desapercibidos. Usualmente estos fallos se apareceren en producción.

## Rojo, no pasa

Existió un fallo en la prueba, quiere decir que los resultados esperados cuando se ejecuta el caso de la prueba sobre el SUT, no se cumplieron. Aquí pueden existir dos casos:
- Error en la prueba: Hubo algún error en la ejecución de la prueba. Suelen ser problemas locales fáciles de detectar.
- Falso Positivo: Se produce un error aunque el SUT funcione correctamente. La prueba debe ser arreglada ajustandose de mejor manera al SUT.


## Probar el flujo para añadir un nuevo entrevistador

Añadir JUnit (5.7.2) como dependencia en nuestro archivo `build.gradle`

`build.gradle`
```
plugins {
    id 'java'
}

group 'org.example'
version '1.0-SNAPSHOT'

sourceCompatibility = 1.8

repositories {
    mavenCentral()
}

test {
    useJUnitPlatform()
}

dependencies {
    testImplementation 'org.junit.jupiter:junit-jupiter-api:5.7.2'
    testRuntimeOnly 'org.junit.jupiter:junit-jupiter-engine:5.7.2'
}

```


`InterviewerTest.java`
```java
package com.test.interviewer;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;


public class InterviewerTest {
  static String existingInterviewerName = "First";
  static String existingInterviewerLastName = "User";
  static String existingInterviewerEmail =  "first@email.com";

  @BeforeEach
  public void setUp() throws Exception {
    Interviewer.data = new ArrayList<>();
  }

  @Test
  public void add() {
    Interviewer interviewer = new Interviewer(
            "Test",
            "User",
            "any@email.com",
            true
    );

    interviewer.add();

    int expectedId = Interviewer.data.size();
    assertEquals(
            expectedId,
            interviewer.id,
            "Interviewer ID should be the new List's size"
    );
  }
}
```
