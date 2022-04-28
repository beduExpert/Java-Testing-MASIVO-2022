# Reto 1 - Bajas de entrevistadores

## :dart: Objetivos

- Elaborar el menu en java para dar de baja un entrevistador.

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

La empresa ABC Technologies desea realizar un sistema que le permita automatizar algunas partes de su proceso para agendar entrevistas técnicas.

El project manager ha definido como objetivo para este sprint añadir las siguientes características a nuestro sistema actual:

- Mediante terminal permite eliminar entrevistadores existentes.
- El usuario ingresará el correo electrónico del entrevistador a eliminar

### Instrucciones:

- Añadir una opción en nuestro menu que permita eliminar entrevistadores
- Se deben incluir pruebas de esta funcionalidad
- Utilizando Code with me o Visual Studio Live Share trabajar de forma colaborativa en los requerimientos dados
- Hacer push de sus cambios a su repositorio

<details>
  <summary>Solución</summary>

1. En nuestro menu mostramos las opciones para dar de alta y consultar un entrevistador.
2. En este archivo solo vive la logica del menu, dejando la logica propia del proceso de alta o consulta en nuestro archivo Interviewer.java
  
Menu.java

``` java
package com.test.interviewer;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    Scanner sc;

    public Menu() {
        sc = new Scanner(System.in);
        Interviewer.data = new ArrayList<Interviewer>();
        Interviewer.loadDataFromFile();

        showMainMenu();
    }

    public void showMainMenu() {
        int option = 0;

        while (option != 5 ) {
            System.out.println("Seleccione la operacion a realizar:");
            System.out.println("1. Dar de alta un entrevistador");
            System.out.println("2. Consultar un entrevistador");
            System.out.println("3. Modificar un entrevistador");
            System.out.println("4. Eliminar un entrevistador");
            System.out.println("5. Salir");

            option = sc.nextInt();
            sc.nextLine();

            switch (option) {
                case 1:
                    addInterviewer();
                    break;
                case 2:
                    searchInterviewer();
                    break;
                case 3:
                    modifyInterviewer();
                    break;
                case 4:
                    deleteInterviewer();
                    break;
            }
        };

        System.out.println("Programa terminado");
    }

    public void addInterviewer() {
        System.out.println("Ingrese el nombre del entrevistador: ");
        String name = sc.nextLine();
        System.out.println("Ingrese el apellido del entrevistador: ");
        String lastName = sc.nextLine();
        System.out.println("Ingrese el email del entrevistador: ");
        String email = sc.nextLine();
        System.out.println("El entrevistador se encuentra activo? (1=Si/2=No)");
        Boolean isActive = sc.nextInt() == 1;
        sc.nextLine();

        Interviewer interviewer = new Interviewer(name, lastName, email, isActive);
        interviewer.add();

        System.out.println(interviewer.toString());
    }

    public void searchInterviewer() {
        System.out.println("Ingrese el email del entrevistador a consultar:");
        String email = sc.nextLine();

        Interviewer interviewer = Interviewer.getByEmail(email);

        if (interviewer != null) {
            System.out.println("Entrevistador encontrado:");
            System.out.println(interviewer.toString());
        } else {
            System.out.println("Entrevistador no encontrado");
        }
    }

    public void modifyInterviewer() {
        System.out.println("Ingrese el email del entrevistador a modificar:");
        String email = sc.nextLine();

        Interviewer interviewer = Interviewer.getByEmail(email);

        if (interviewer != null) {
            System.out.println("Entrevistador encontrado:");
            System.out.println(interviewer.toString());

            System.out.println("Ingrese el nuevo nombre del entrevistador: (Enter para mantener actual)");
            String name = sc.nextLine();
            System.out.println("Ingrese el nuevo apellido del entrevistador: (Enter para mantener actual)");
            String lastName = sc.nextLine();
            System.out.println("Ingrese el nuevo email del entrevistador: (Enter para mantener actual)");
            String newEmail = sc.nextLine();
            System.out.println("El entrevistador se encuentra activo? (1=Si/2=No)");
            Boolean isActive = sc.nextInt() == 1;
            sc.nextLine();

            interviewer.save(name, lastName, newEmail, isActive);

        } else {
            System.out.println("Entrevistador no encontrado");
        }
    }

    public void deleteInterviewer() {
        System.out.println("Ingrese el email del entrevistador a eliminar:");
        String email = sc.nextLine();

        Interviewer interviewer = Interviewer.getByEmail(email);
        try {
            interviewer.delete();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        new Menu();
    }
}
  ``` 
    
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
    private final String exitCommand = "5 \n";

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
    public void addNewInterviewer() {
        final String interviewerName = "Interviewer Name";
        final String interviewerLastName = "Interviewer Lastname";
        final String interviewerEmail = "Interviewer Email";
        final String addNewInterviewerCommand = "1 \n " + interviewerName + " \n " + interviewerLastName + " \n " + interviewerEmail + " \n 1 \n" + exitCommand;
        provideInput(addNewInterviewerCommand);

        Menu.main(new String[0]);
        final String output = getOutput();

        assertTrue(output.contains(interviewerName));
        assertTrue(output.contains(interviewerLastName));
        assertTrue(output.contains(interviewerEmail));
    }

    @Test
    public void getInterviewer() {
        final String interviewerName = "Interviewer Name";
        final String interviewerLastName = "Interviewer Lastname";
        final String interviewerEmail = "interviewer@mail.com";
        final String addNewInterviewerCommand = "1 \n " + interviewerName + " \n " + interviewerLastName + " \n " + interviewerEmail + " \n 1 \n";
        final String getInterviewerCommand = "2 \n " + interviewerEmail + "\n ";
        provideInput(addNewInterviewerCommand + getInterviewerCommand + exitCommand);

        Menu.main(new String[0]);
        final String output = getOutput();

        assertTrue(output.contains(interviewerName));
        assertTrue(output.contains(interviewerLastName));
        assertTrue(output.contains(interviewerEmail));
    }


}
  ``` 
  
Interviewer.java

  ``` java
package com.test.interviewer;

import java.io.*;
import java.util.ArrayList;

public class Interviewer implements Serializable {
    static ArrayList<Interviewer> data;

    int id;
    String name;
    String lastName;
    String email;
    Boolean isActive;

    public Interviewer(
            String name,
            String lastName,
            String email,
            Boolean isActive
    ) {
        this.id = data.size() + 1;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.isActive = isActive;
    }

    public Interviewer add() {
        data.add(this);
        Interviewer.saveDataToFile();
        return this;
    }

    public void delete() throws Exception{
        Interviewer interviewer = Interviewer.getByEmail(this.email);

        if (interviewer != null) {
            data.remove(this);
            Interviewer.saveDataToFile();
        }
        else
            throw new Exception("Interviewer not found");
    }

    public void save(
            String name,
            String lastName,
            String email,
            Boolean isActive
    ) {
        try {
            this.delete();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return;
        }

        if (!name.equals(""))
            this.name = name;

        if (!lastName.equals(""))
            this.lastName = lastName;

        if (!email.equals(""))
            this.email = email;

        this.isActive = isActive;

        data.add(this);
    }

    public static Interviewer getByEmail(String email) {
        for (Interviewer interviewer: data) {
            if (interviewer.email.equals(email))
                return interviewer;
        }

        return null;
    }

    @Override
    public String toString() {
        return "\nID: " + this.id +
                "\nName: " + this.name +
                "\nLast Name: " + this.lastName +
                "\nEmail: " + this.email +
                "\nIs Active: " + this.isActive + "\n";
    }

    public static void saveDataToFile() {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("./interviewers");
            ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream);

            outputStream.writeObject(Interviewer.data);

            outputStream.close();
            fileOutputStream.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

    public static void loadDataFromFile() {
        try {
            FileInputStream fileInputStream = new FileInputStream("./interviewers");
            ObjectInputStream inputStream = new ObjectInputStream(fileInputStream);

            ArrayList<Interviewer> fileData = (ArrayList<Interviewer>) inputStream.readObject();

            Interviewer.data.clear();
            Interviewer.data.addAll(fileData);

            inputStream.close();
            fileInputStream.close();
        } catch (Exception e) {
            if (!e.getMessage().contains("No such file or directory"))
                e.printStackTrace();
        }
    }

}
  ``` 
  
Añadimos las pruebas correspondientes para eliminar y modificar un entrevistador. 
 
InterviewerTest.java

  ``` java
package com.test.interviewer;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;


public class InterviewerTest {
    static String existingInterviewerName = "First";
    static String existingInterviewerLastName = "User";
    static String existingInterviewerEmail = "first@email.com";

    @BeforeEach
    public void setUp() throws Exception {
        Interviewer.data = new ArrayList<>();

        // We insert a user for testing delete and save
        Interviewer.data.add(new Interviewer(
                existingInterviewerName,
                existingInterviewerLastName,
                existingInterviewerEmail,
                true
        ));
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


    @Test
    public void save() {
        int originalListSize = Interviewer.data.size();
        String expectedLastName = "New";
        Interviewer existingInterviewer = Interviewer.data.get(0);
        System.out.println(Interviewer.data.size());
        existingInterviewer.save("", expectedLastName, "", true);

        int newListSize = Interviewer.data.size();
        System.out.println(Interviewer.data.size());
        int lastInterviewerIndex = newListSize - 1;
        Interviewer latestInterviewer = Interviewer.data.get(lastInterviewerIndex);

        assertEquals(
                originalListSize,
                newListSize,
                "List size should be the same"
        );
        assertEquals(
                expectedLastName,
                latestInterviewer.lastName,
                "Last Name should have been updated"
        );
        assertEquals(
                existingInterviewer.name,
                latestInterviewer.name,
                "Name should have not been updated"
        );
    }

    @Test
    public void getByEmail() {
        Interviewer result = Interviewer.getByEmail(existingInterviewerEmail);

        assertNotNull(result, "Interviewer should be found");
        assertEquals(
                existingInterviewerName,
                result.name,
                "Unexpected Interviewer Name"
        );
        assertEquals(
                existingInterviewerLastName,
                result.lastName,
                "Unexpected Interviewer Last Name"
        );
    }

    @Test
    public void getByNonExistingEmail() {
        String nonExistingEmail = "nonexisting@email.com";

        Interviewer result = Interviewer.getByEmail(nonExistingEmail);

        assertNull(result, "Interviewer should not be found");
    }

    @Test
    public void delete() {
        Interviewer existingInterviewer = Interviewer.data.get(0);

        int expectedSize = Interviewer.data.size() - 1;

        try {
            existingInterviewer.delete();
        } catch (Exception e) {
            fail("Unexpected Exception received: " + e.getMessage());
        }

        int actualSize = Interviewer.data.size();

        assertEquals(
                expectedSize,
                actualSize,
                "List should be smaller"
        );
    }
}
``` 
</details>
