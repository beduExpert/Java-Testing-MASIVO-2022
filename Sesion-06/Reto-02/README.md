# Reto 2 - Segunda transformación

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

Nuestra segunda transformación consistirá en: eliminar una condicional y cambiar el alcance de una condicional
existente.

Instrucciones:

Elimina completamente la condición `else if (unSortedList.length == 2)` y modifica el código existente para pasar los
casos de prueba Modifica la condición `if (unSortedList.length == 1) {` y su código interno para poder pasar con éxito
el caso de prueba cuando la entrada es: `new int[]{}`

<details>
  <summary>Solución</summary>

```java
package Sort;

public class Sorter {
    public static List<Integer> Sort(int[] unSortedList) {
        List<Integer> sorted = new ArrayList<Integer>();
        if (unSortedList.length == 0) {
            return sorted;
        } else {
            Integer lower = null;
            int medium = unSortedList[0];
            Integer higher = null;

            for (int element : unSortedList) {
                if (element > medium) {
                    higher = element;
                }
                if (element < medium) {
                    lower = element;
                }

            }

            if (lower != null) sorted.add(lower);
            sorted.add(medium);
            if (higher != null)  sorted.add(higher);
        }

        return sorted;
    }


}
```

</details>

¿Qué limitaciones presenta la solución propuesta?
