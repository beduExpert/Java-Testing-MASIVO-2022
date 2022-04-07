# Reto 3 - Tercera transformación

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

A continuación añadiremos dos casos de prueba más

```java
package Sort;

import junit.framework.Assert;
import org.junit.Test;

import java.util.Arrays;

public class SorterTest {
    @Test
    public void SortEmptyList_ShouldReturnEmptyList() {
        Assert.assertTrue(new ArrayList<Integer>(),
                Sorter.Sort(new int[]{}));
    }

    @Test
    public void SortListWithOneElement_ShouldReturnSortedList() {
        Assert.assertTrue(Arrays.equals(new ArrayList<Integer>(
                        Arrays.asList(1)),
                Sorter.Sort(new int[]{1})));
    }

    @Test
    public void SortListWithTwoElementsInCorrectOrder_ShouldReturnSameList() {
        Assert.assertTrue(Arrays.equals(new ArrayList<Integer>(
                        Arrays.asList(1, 2)),
                Sorter.Sort(new int[]{1, 2})));
    }

    @Test
    public void SortListWithTwoElementsInReverseOrder_ShouldReturnSortedList() {
        Assert.assertTrue(Arrays.equals(new ArrayList<Integer>(
                        Arrays.asList(2, 1)),
                Sorter.Sort(new int[]{2, 1})));
    }

    @Test
    public void SortListWithSameTwoElements_ShouldReturnSortedList() {
        Assert.assertTrue(Arrays.equals(new ArrayList<Integer>(
                        Arrays.asList(2, 2)),
                Sorter.Sort(new int[]{2, 2})));
    }

    @Test
    public void SortListWithThreeElementsInCorrectOrder_ShouldReturnSortedList() {
        Assert.assertTrue(Arrays.equals(new ArrayList<Integer>(
                        Arrays.asList(1, 2, 3)),
                Sorter.Sort(new int[]{1, 2, 3})));
    }

    @Test
    public void SortListWithThreeElementsFirstTwoSwapped_ShouldReturnSortedList() {
        Assert.assertTrue(Arrays.equals(new ArrayList<Integer>(
                        Arrays.asList(1, 2, 3)),
                Sorter.Sort(new int[]{2, 1, 3})));
    }

    @Test
    public void SortListWithThreeElementsFirstTwoSwapped_ShouldReturnSortedList() {
        Assert.assertTrue(Arrays.equals(new ArrayList<Integer>(
                        Arrays.asList(1, 2, 3)),
                Sorter.Sort(new int[]{3, 1, 2})));
    }

    @Test
    public void SortListWithThreeElementsFirstTwoSwapped_ShouldReturnSortedList() {
        Assert.assertTrue(Arrays.equals(new ArrayList<Integer>(
                        Arrays.asList(1, 2, 3)),
                Sorter.Sort(new int[]{1, 3, 2})));
    }
    
}

```

Instrucciones:

Realiza las transformaciones correspondientes para pasar estos dos nuevos casos.

<details>
  <summary>Solución</summary>

```java
package Sort;

public class Sorter {
    public static List<Integer> Sort(int[] unSortedList) {
        List<Integer> sorted = new ArrayList<Integer>();
        if (unSortedList.length <= 1) {
            return sorted;
        } else {
            List<Integer> lower = new ArrayList<Integer>();
            int medium = unSortedList[0];
            List<Integer> higher = new ArrayList<Integer>();
            ;

            for (int element : unSortedList) {
                if (element > medium) {
                    higher.add(element);
                }
                if (element < medium) {
                    lower.add(element);
                }

            }

            Integer[] lowers = new Integer[lower.size()];
            lower.toArray(lowers);
            sorted.addAll(sort(lowers));

            sorted.add(medium);

            Integer[] highers = new Integer[higher.size()];
            higher.toArray(highers);
            sorted.addAll(sort(highers));
        }

        return sorted;
    }


}
```

</details>

¿Qué limitaciones presenta la solución propuesta?