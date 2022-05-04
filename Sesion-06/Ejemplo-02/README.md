# Ejemplo 2 - La premisa del principio de transformación

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

Continuando con nuestro desarrollo, ahora necesitamos probar el caso en que recibimos dos elementos pero en desorden.

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
}

```

¿Cuál podría ser el código minimo y más simple que podríamos implementar para pasar este caso?

Probablemente podrías estar considerando comenzar con las iteraciones, sin embargo no sería el código más "sencillo".

Lo que podemos ver en este caso es que cuando tenemos dos números y uno es mayor que el otro necesitamos
intercambiarlos.

```java
package Sort;

import java.util.ArrayList;

public class Sorter {
    public static List<Integer> Sort(int[] unSortedList) {
        List<Integer> sorted = new ArrayList<Integer>();
        if (unSortedList.length <= 1) {
            return sorted;
        }
        if (unSortedList[0] > unSortedList[1]) {
            sorted.add(unSortedList[1]);
            sorted.add(unSortedList[0]);
        } else {
            sorted.add(unSortedList[0]);
            sorted.add(unSortedList[1]);
        }
        return sorted;
    }


}
```

¿Te parece un sin sentido implementar dicho código porque solo funcionara con estos casos de prueba?

Planteemos el siguiente escenario, imagina un día típico donde estás trabajando con código "desconocido", los primeros
pasos seguramente serán pequeños, algún print por ahi, tal vez ir directamente por el debugger, probar diferentes
entradas para ver que salidas obtienes, etc. Todo esto con el propósito de ir ganando familiaridad con el código. Cuando
por fin te sientes con la confianza necesaria para comenzar con modificaciones los primeros pasos que daras serán
pequeños, iras verificando que todo funcione en cada paso. Cuando tu confianza aumente haras cambios más grandes sin
detenerte, inesperadamente algo no estará funcionando y decidirás seguir cambiando, el código hasta que te encuentres en
un punto de no retorno. Donde o solucionas el error o deshaces todos los cambios. TDD busca evitar esto, creando ciclos
de desarrollo cortos donde siempre puedes volver a un estado anterior.

Nuestro siguiente caso será un arreglo con dos elementos iguales

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
}

```

Nuestro siguiente caso será un arreglo con tres elementos iguales

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
}

```

A continuación agregaremos una prueba con 3 elementos desordenados

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
}

```

Continuando con este patron ahora podemos verificar el caso para la longitud de tres

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
            if (unSortedList[1] > unSortedList[2]) {
                sorted.add(unSortedList[2]);
                sorted.add(unSortedList[0]);
                sorted.add(unSortedList[1]);
            } else {
                sorted.add(unSortedList[1]);
                sorted.add(unSortedList[0]);
                sorted.add(unSortedList[2]);
            }
        }

        return sorted;
    }


}
```

Si miramos con atención podremos notar que un patron ha comenzado a emerger. Son casos similares, con la principal
diferencia radicando en el número de elementos.

Podríamos continuar con un comportamiento similar para distintas longitudes, sin embargo hay que recordar una regla de
mayor orden:

_"Mientras las pruebas se vuelven más especificas, el código se vuelve más genérico."_

Entonces seguir el camino del código específico no resistirá muchos cambios. Por lo tanto veamos la premisa del
principio de transformación, para comenzar a generalizar nuestro código.

