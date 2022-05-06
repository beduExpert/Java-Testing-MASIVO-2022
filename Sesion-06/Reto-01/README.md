# Reto 1 - Primera transformación

## :dart: Objetivo

- Analizar qué es esta técnica de programación guiada por pruebas, sus orígenes y la lógica detrás de su funcionamiento.
- Aplicar el ciclo rojo, verde, refactorización.

## ⚙ Requisitos

- IntelliJ IDEA
- Java
- Gradle
- JUnit
- Code with me
- Una cuenta de GitHub

>**¡Nota para experto(a)!**
>
> A lo largo de este curso los alumnos estarán trabajando en equipos de dos integrantes, por ello como primera actividad el experto definirá las parejas, en caso de ser un grupo con un número impar podría haber equipos de tres personas.

> Los retos buscan emular un entorno real de trabajo, en los mismos habrá descripciones vagas de los requerimientos y el experto fungirá como stakeholder para clarificar dudas o añadir detalles a los requerimientos.


## Desarrollo

Como revisamos en nuestro ejemplo 2, ciertos patrones comienzan a emerger de nuestro código. Durante este reto
siguiendo _la premisa del principio de transformación_

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

Nuestra primera transformación consistirá en sustituir una condicional por un ciclo.

Instrucciones:

Remplaza las condiciones internas de la condición `else if (unSortedList.length == 3)` por un ciclo while/for, por ahora
te puedes ocupar únicamente de los casos con entradas:

- 1,2,3
- 2,3,1

EL código que debes remplazar por un ciclo for es el siguiente:

```
if (unSortedList[1] > unSortedList[2]) {
    sorted.add(unSortedList[2]);
    sorted.add(unSortedList[0]);
    sorted.add(unSortedList[1]);
} else {
    sorted.add(unSortedList[1]);
    sorted.add(unSortedList[0]);
    sorted.add(unSortedList[2]);
}
```

<details>
  <summary>Solución</summary>

1. Sustituir el código lista do anteriormente por un ciclo for que nos permita ordenar los elementos de acuerdo a si el
   elemento actual es mayor o menor

```java
package Sort;

public class Sorter {
    public static List<Integer> Sort(int[] unSortedList) {
        List<Integer> sorted = new ArrayList<Integer>();
        if (unSortedList.length == 1) {
            return sorted.add(unSortedList[0]);
        } else if (unSortedList.length == 2) {
            if (unSortedList[0] > unSortedList[1]) {
                sorted.add(unSortedList[1]);
                sorted.add(unSortedList[0]);
            } else {
                sorted.add(unSortedList[0]);
                sorted.add(unSortedList[1]);
            }
        } else if (unSortedList.length == 3) {
            int lower = 0;
            int medium = unSortedList[0];
            int higher = 0;

            for (int element : unSortedList) {
                if (element > medium) {
                    higher = element;
                }
                if (element < medium) {
                    lower = element;
                }

            }

            sorted.add(lower);
            sorted.add(medium);
            sorted.add(higher);
        }

        return sorted;
    }


}
```

</details>

¿Qué limitaciones presenta la solución propuesta?
