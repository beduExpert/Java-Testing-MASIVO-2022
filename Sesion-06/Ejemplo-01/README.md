# Ejemplo 1 - Las tres leyes de TDD

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

El tío Bob describe TDD con tres reglas:

    No se le permite escribir ningún código de producción a menos que sea para aprobar una prueba unitaria fallida.
    No se le permite escribir más pruebas unitarias de las que sean suficientes para fallar; y las fallas de compilación son fallas.
    No se le permite escribir más código de producción del que sea suficiente para aprobar la prueba de una unidad que falla.

Léelos con atención y notará que son más simples de lo que parecen, pero tienen mucha repetición, así que aquí hay una
versión "refactorizada":

    Escriba el código de producción solo para aprobar una prueba de unidad con errores.
    Escriba solo lo suficiente de una prueba unitaria para fallar.
    Escriba solo el código de producción suficiente para aprobar la prueba de la unidad que falla.

Ahora es claro que la regla 3 implica la regla 1, así que aquí hay una versión concisa que resulta más fácil de
recordar:

    Escriba solo lo suficiente de una prueba unitaria para fallar.
    Escriba solo el código de producción suficiente para aprobar la prueba de la unidad que falla.

Este par de reglas también sirven como una lista de verificación cuando estemos desarrollando, así que simplemente las
puedes repetir en orden, una y otra vez, para mantenerte en el circuito TDD.

Siguiendo estas reglas vamos a escribir un programa que nos permita ordenar un arreglo

El caso más sencillo que podemos probar es para un arreglo vacío:

```java
package Sort;

import junit.framework.Assert;
import org.junit.Test;

import java.util.Arrays;

public class SorterTest {
    @Test
    public void SortEmptyList_ShouldReturnEmptyList() {
        Assert.assertTrue(Arrays.equals(new ArrayList<Integer>(),
                Sorter.Sort(new int[]{})));
    }
}

```

Nuestro siguiente paso es ejecutar nuestras pruebas y comprobar que fallan **por las razones esperadas**

Aunque este paso pueda parecer redundante, es claro que van a fallar nuestras pruebas ¿correcto?, es parte de la
práctica de TDD por las siguientes razones:

- Evitar falsos negativos
- Generar ciclos de desarrollo lo más pequeños posible, llevando al minimo el tiempo transcurrido entre los estados de
  nuestro código (red -green)

El código minimo para pasar dichas pruebas es el siguiente

```java
package Sort;

public class Sorter {
    public static List<Integer> Sort(int[] unSortedList) {
        return new ArrayList<Integer>();
    }


}
```

El siguiente caso que probaremos es cuando tenemos un arreglo con un solo elemento

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
}

```

A continuación tendremos que cambiar la implementación de nuestro código para pasar ambos casos de prueba

```java
package Sort;

public class Sorter {
  public static List<Integer> Sort(int[] unSortedList) {
    List<Integer> sorted = new ArrayList<Integer>();
    return sorted;
  }


}

```

Nuestro siguiente caso a implementar es para un arreglo con dos números

El siguiente caso que probaremos es cuando tenemos un arreglo con un solo elemento

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
                    Arrays.asList(1,2)),
            Sorter.Sort(new int[]{1,2})));
  }
}

```

En este caso no necesitamos hacer modificaciones a nuestro código, ya que los tres casos pasaran.
