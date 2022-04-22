# Ejemplo 1 - Probar el flujo para añadir un nuevo entrevistador

## :dart: Objetivo

* Ejecutar una prueba para un flujo donde se agrega un nuevo entrevistador.

## ⚙ Requisitos

- IntelliJ IDEA
- Java
- Gradle
- JUnit
- Code with me
- Una cuenta de GitHub


## Desarrollo

**Probar el flujo para añadir un nuevo entrevistador**

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
