# Reto 2 - Probando nuestro software

## :dart: Objetivos

- Realizar pruebas con el fin de obtener un nuevo entrevistador y consultando uno nuevo.

## ⚙ Requisitos

- IntelliJ IDEA
- Java
- Gradle
- Code with me
- Una cuenta de GitHub

>**¡Nota para experto(a)!**
>
> A lo largo de este curso los alumnos estarán trabajando en equipos de dos integrantes, por ello como primera actividad el experto definirá las parejas, en caso de ser un grupo con un número impar podría haber equipos de tres personas.

> Los retos buscan emular un entorno real de trabajo, en los mismos habrá descripciones vagas de los requerimientos y el experto fungirá como stakeholder para clarificar dudas o añadir detalles a los requerimientos.

## Desarrollo

Basándonos en el Reto 1, debemos probar que el sistema desarrollado para la empresa ABC Technologies haya podido automatizar algunas partes de su proceso para agendar entrevistas técnicas.

El project manager ha definido como objetivo para este sprint realizar las pruebas que cumplan con las siguientes características:

- Verificar que se puedan agregar nuevos entrevistadores mediante terminal.
- Verificar se puedan consultar a los entrevistadores existentes en el sistema.
- Verificar que se hayan guardado los datos esperados de un entrevistador, como son: correo, nombre completo, tecnologías, entre otras.
- Verificar que los datos vivan en memoria.

### Instrucciones:
- Se deben incluir todas las pruebas de esta funcionalidad.
- Utilizando Code with me o Visual Studio Live Share trabajar de forma colaborativa.
- Hacer push de sus cambios a su repositorio.

<details>
  <summary>Solución</summary>

1. En nuestro menu mostramos las opciones para dar de alta y consultar un entrevistador.
2. En este archivo solo vive la logica del menu, dejando la logica propia del proceso de alta o consulta en nuestro archivo Interviewer.java
  
Realizamos las pruebas correspondientes para añadir un nuevo entrevistador y para obtener un entrevistador existente.
  
MenuTest.java

  ``` java
package com.test.interviewer;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class MenuTest {
    private final InputStream systemIn = System.in;
    private final PrintStream systemOut = System.out;

    private ByteArrayInputStream testIn;
    private ByteArrayOutputStream testOut;

    @BeforeEach
    public void setUpOutput() {
        testOut = new ByteArrayOutputStream();
        System.setOut(new PrintStream(testOut));
    }

    private void provideInput(String data) {
        testIn = new ByteArrayInputStream(data.getBytes());
        System.setIn(testIn);
    }

    private String getOutput() {
        return testOut.toString();
    }

    @AfterEach
    public void restoreSystemInputOutput() {
        System.setIn(systemIn);
        System.setOut(systemOut);
    }



    @Test
    public void addNewInterviewer () {
        final String interviewerName = "Interviewer Name";
        final String interviewerLastName = "Interviewer Lastname";
        final String interviewerEmail = "Interviewer Email";
        final String addNewInterviewerCommand = "1 \n "+ interviewerName + " \n " + interviewerLastName + " \n " + interviewerEmail + " \n 1 \n 3 \n";
        provideInput(addNewInterviewerCommand);

        Menu.main(new String[0]);
        final String output = getOutput();

        assertTrue(output.contains(interviewerName));
        assertTrue(output.contains(interviewerLastName));
        assertTrue(output.contains(interviewerEmail));
    }

    @Test
    public void getInterviewer () {
        final String interviewerName = "Interviewer Name";
        final String interviewerLastName = "Interviewer Lastname";
        final String interviewerEmail = "interviewer@mail.com";
        final String addNewInterviewerCommand = "1 \n "+ interviewerName + " \n " + interviewerLastName + " \n " + interviewerEmail + " \n 1 \n";
        final String getInterviewerCommand = "2 \n " + interviewerEmail + "\n ";
        final String exitCommand = "3 \n";
        provideInput(addNewInterviewerCommand + getInterviewerCommand + exitCommand);

        Menu.main(new String[0]);
        final String output = getOutput();

        assertTrue(output.contains(interviewerName));
        assertTrue(output.contains(interviewerLastName));
        assertTrue(output.contains(interviewerEmail));
    }
}
``` 
</details>
