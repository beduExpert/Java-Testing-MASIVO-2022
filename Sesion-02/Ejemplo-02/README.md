# Ejemplo #2 - Pruebas Unitarias

## :dart: Objetivo

- Definir que es una prueba unitaria
- Analizar técnicas, recomendaciones y buenas prácticas para escribir pruebas unitarias.

## Desarrollo

### Pruebas unitarias

**Paso 1: El proyecto**

Creamos un proyecto que llamaremos «Prueba de Cobertura», agregamos un paquete «example» y las librerías arriba mencionadas. Para finalizar, creamos una clase «Miclase.java«.

![image](https://user-images.githubusercontent.com/22419786/164873567-95ce10ec-d478-4c9d-9891-8354704b213f.png)

**Paso 2. El código**

El código que probaremos, lo estudiamos en un post anterior [LINK] donde realizamos una prueba manual del algoritmo. El algoritmo corresponde al problema de detectar el numero mayor dados tres números.

![image](https://user-images.githubusercontent.com/22419786/164873585-19951afc-5564-49d2-9e43-7e5d923a2814.png)

Pasamos del algoritmo a código y tenemos:

package example;
/**
 * @see https://www.jc-mouse.net/
 * @author mouse
 */
public class MiClase {

    public int numero_mayor(int a, int b, int c) {
        if (a > b && a > c) {
            return a;
        } else if (c > b) {
            return c;
        } else {
            return b;
        }
    }
    
}

**Paso 3: Paquete de Prueba**

Ya que tenemos nuestra clase de prueba lista, procedemos a crear las clases de prueba. Clic derecho sobre nuestro proyecto -> New -> Other… En Categoría seleccionamos «Unit Tests» y en File Types, seleccionamos «Test for Existing Class» y presionamos el botón siguiente.

A continuación, presionando el botón «browse…» buscamos y seleccionamos la clase que testearemos, «Miclase«, dejamos todas las opciones tal cual están y finalizamos presionando el botón «Terminar».

![image](https://user-images.githubusercontent.com/22419786/164873630-62276f62-1882-475d-8ea3-cbf6e10a8c1d.png)

Se creara otra clase en la sección de «Paquete de prueba» como se ve a continuación

![image](https://user-images.githubusercontent.com/22419786/164873634-01e94ddc-53a4-4b3f-970c-65bdb096f32e.png)

**Paso 4: JUnit**

Antes de realizar la prueba con JUnit, debemos estudiar un poco el código generado. En la parte inferior de la clase MiClaseTest encontramos el siguiente método:

 1     @Test
 2     public void testNumero_mayor() {
 3         System.out.println("numero_mayor");
 4         int a = 0;
 5         int b = 0;
 6         int c = 0;
 7         MiClase instance = new MiClase();
 8         int expResult = 0;
 9         int result = instance.numero_mayor(a, b, c);
10         assertEquals(expResult, result);
11         // TODO review the generated test code and remove the default call to fail.
12         fail("The test case is a prototype.");
13     }
donde:

1) @Test: Los métodos marcados con esta anotación, le indican a JUnit que es código que queremos que se ejecute. Son estos métodos donde se implementan el código de pruebas.

4,5,6) Las variables del método que probaremos

7) Instancia a nuestra de prueba

8) El resultado que esperamos obtener si la prueba tiene exito

9) la llamada al método de prueba, el resultado se almacena en otra variable

10) assertEquals: Es uno de varios métodos con los que cuenta JUnit, este método en particular compara si dos objetos son iguales, de no ser así, lanzará una excepción y la prueba se detiene.

12) fail: Este método hace que la prueba termine con fallo

Como vimos en un post anterior [Caja blanca: Prueba del camino básico], este algoritmo consta de 4 caminos posibles, eso quiere decir que debemos implementar 4 métodos de prueba.

![image](https://user-images.githubusercontent.com/22419786/164873663-c2d118f0-372c-4339-9623-94582622898d.png)

Partiendo como base el método de prueba arriba mencionado, creamos 4 métodos con sus respectivos valores de entrada y valores esperados, es decir:

    @Test
    public void testNumero_mayor_caso1() {        
        int a = 5;
        int b = 3;
        int c = 7;
        MiClase instance = new MiClase();
        int expResult = 7;
        int result = instance.numero_mayor(a, b, c);
        assertEquals(expResult, result);        
    }

    @Test
    public void testNumero_mayor_caso2() {        
        int a = 5;
        int b = 3;
        int c = 4;
        MiClase instance = new MiClase();
        int expResult = 5;
        int result = instance.numero_mayor(a, b, c);
        assertEquals(expResult, result);        
    }
    
    @Test
    public void testNumero_mayor_caso3() {        
        int a = 5;
        int b = 7;
        int c = 6;
        MiClase instance = new MiClase();
        int expResult = 7;
        int result = instance.numero_mayor(a, b, c);
        assertEquals(expResult, result);        
    }
    
    @Test
    public void testNumero_mayor_caso4() {        
        int a = 5;
        int b = 7;
        int c = 9;
        MiClase instance = new MiClase();
        int expResult = 9;
        int result = instance.numero_mayor(a, b, c);
        assertEquals(expResult, result);        
    }
Para ejecutar el test con JUnit, clic derecho sobre la clase MiClaseTest.java -> run file

Observamos que pasamos las 4 pruebas con éxito.

![image](https://user-images.githubusercontent.com/22419786/164873671-6826c05c-bebf-49bd-a592-cc58088d1d58.png)

Si tuviésemos algún error, este aparecería en color rojo.

**Paso 5. JaCoCoverage**

Como mencionamos en un principio, este plugin nos permite ver más a detalle lo que pasa con el código y los caminos que este toma. Para ejecutarlo, clic derecho sobre el proyecto -> Test with JaCoCoverage. Se abrirá una pagina en el navegador que tengamos configurado por defecto.

![image](https://user-images.githubusercontent.com/22419786/164873681-91af821f-123f-4760-af13-7c94cfd51d7a.png)

En esta pagina, el plugin nos brinda información importante sobre el test realizado, ademas podemos navegar por las diferentes clases que cuenta nuestro proyecto. En nuestro ejemplo pasamos todas las pruebas por lo que el código se colorea de verde.

![image](https://user-images.githubusercontent.com/22419786/164873701-d98399ac-9604-40e0-9d71-f1294036e632.png)

Para observar mejor este plugin, provoquemos un error a propósito. Comentemos el método testNumero_mayor3() que corresponde al camino 3 que nos dice que el numero mayor esperado de «a»,»b» y «c», es «b» . Volvamos a ejecutar el plugin.

![image](https://user-images.githubusercontent.com/22419786/164873707-d9acd3c2-76a1-4ccf-953a-15c978eac9d7.png)

Observamos que ahora marca en rojo el camino que no se cumplió.
