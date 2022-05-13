# Sesión 4: Black and White Box Testing

## :dart: Objetivos

- Analizar qué son las pruebas de tipo black and white box testing
- Comparar y distinguir las diferencias entre black box y white box testing
- Implementar pruebas de caja negra y blanca

## ⚙ Requisitos

- Editor de código
  - IntelliJ IDEA
- Programación colaborativa
  - Code with me
- Control de versiones.
  - Git
  - Tener una cuenta de GitHub
- Entorno de desarrollo de Java.
  - Java JDK 8+
  - Gradle 7+
- Frameworks de pruebas
  - Junit 5.7.x

## 📂 Contenido


### <ins>Técnicas de caja negra: Requerimiento funcional</ins>

Como vimos en la sesión 2 (Testing processes in Agile) de nuestro módulo de QA Automation Testing las historias de
usuario (en formato AS, WANT, SO) nos permiten describir de forma rápida y abreviada una acción que el usuario desea
realizar en nuestro sistema. Complementadas con descripciones de BDD (formato GIVEN, WHEN. THEN) nos permiten definir
requerimientos y escribir pruebas. Sin embargo dichas herramientas pueden carecer de detalles necesarios, para ello otra
técnica de escribir requerimientos y que podemos usar para probar nuestro software son los casos de uso.

#### Diferencias entre historias de usuario y casos de uso

Las historias de usuario tratan sobre necesidades. Cuando escribe una historia de usuario, lo que está describiendo es
una necesidad del usuario. Es algo que el usuario debe hacer en su trabajo diario. Si nunca construyes ningún software
para él, ¡esa necesidad seguirá existiendo!

Los casos de uso se refieren al comportamiento que creará en el software para satisfacer esas necesidades. Un
desarrollador que necesita crear software que funcione debe poder leer un caso de uso y tener una buena idea de lo que
debe hacer el software. Por lo general, tiene muchos detalles y describe todo lo que el desarrollador necesita construir
para satisfacer las necesidades del usuario. Es por eso que debe tener muchos más detalles y ser claro e inequívoco.

Las historias de usuario son fáciles de leer para los usuarios. Cuando escribe una historia de usuario, en lo que se
concentra es en escribir algo que cualquiera pueda entender, en el idioma de los usuarios. Todos sabemos que los
desarrolladores tienen mucha más paciencia para hablar sobre los detalles del software que están creando que los
usuarios, por lo que las historias de los usuarios deben ser breves. Una historia de usuario debe expresar un
pensamiento completo en solo un par de oraciones.

Los casos de uso describen una interacción completa entre el software y los usuarios (y posiblemente otros sistemas).
Cuando realiza un análisis de casos de uso, lo que está haciendo es diseñar una solución funcional que satisfaga las
necesidades de los usuarios. Debe ser algo que los desarrolladores puedan implementar. Es posible que una historia de
usuario genere varios casos de uso. Y cuando combina todos sus casos de uso en un documento de caso de uso, terminará
con una descripción completa de cada interacción entre el usuario y el software que planea construir. Y si su software
tiene que interactuar con múltiples sistemas, puede terminar tratando a esos otros sistemas como actores en su caso de
uso.

Cabe aclarar que: de **una historia de usuario pueden desprenderse múltiples casos de uso**

#### De historia de usuario a caso de uso

A continuación describiremos una historia de usuario en diferentes etapas, hasta llegar a una descripción detallada en
un caso de uso. La siguiente historia representa la actividad que tiene que llevar a cabo un estudiante apra registrarse
en la plataforma de su universidad

#### Historia de usuario

Registrarse como estudiante

Un usuario quire registrarse en el sistema como estudiante para poder acceder a las funcionalidades dle estudiante.

#### Historia de usuario (As, Want, So)

Registrarse como estudiante

AS un usuario I WANT poder registrarme como estudiante SO puedo ingresar a las funcionalidades para usuario estudiante

#### Descripción Given, When, Then (GWT)

Criterios de aceptación

GIVEN un usuario WHEN ingresa los datos complementarios: Carrera y Nombre THEN se crea su registro en la aplicación

GIVEN un usuario WHEN ingresa nombre de carrera o institución (cadena mayor a 3 caracteres)
THEN Se despliegan las posibles opciones encontradas agrupadas y puede seleccionar alguna de estas.

GIVEN un usuario WHEN Borra el campo de carrera THEN se oculta el modal

GIVEN un usuario WHEN selecciona su carrera THEN el botón Siguiente se desbloquea y puede continuar con su registro

GIVEN un usuario WHEN Inserta su nombre (min 3 caracteres)
THEN Se desbloquea el botón de continuar y puede finalizar su registro

#### Caso de Uso

Los casos de uso permiten identificar los flujos por los que deben pasar los casos de prueba junto con sus acciones, el siguiente es un ejemplo de lo que debe contener un caso de uso [Ejemplo 01: Casos de Uso](./Ejemplo-01)
    
Con base en esta información, iniciaremos el primer reto de esta sesión [Reto 01: Casos de usos](./Reto-01)

---

### <ins>Técnicas de caja negra</ins>

#### Análisis de valores límite

Es una prueba de caja negra ampliamente utilizada, que también es la base para la prueba de equivalencia. El análisis de
valor límite prueba el software con casos de prueba con valores extremos de datos de prueba. Boundary Value Analysis (
BVA) se utiliza para identificar las fallas o errores que surgen debido a los límites de los datos de entrada.

Por ejemplo: tomar entradas para los datos de un caso de prueba para una sección de edad debe aceptar datos válidos de
entre 1 y 100. Según el análisis de BVA, el software se probará con cuatro datos de prueba como -1, 1, 100 y 101 para
verificar la respuesta del sistema utilizando los valores límite.

#### Partición de equivalencia

Esta técnica de diseño de casos de prueba verifica la entrada y la salida dividiendo la entrada en clases equivalentes.
Los datos deben probarse al menos una vez para garantizar la máxima cobertura de prueba de datos. Es la forma de prueba
exhaustiva, que también reduce la redundancia de entradas.

Por ejemplo: Tomar entradas para los datos de un caso de prueba para el ejemplo mencionado anteriormente tendrá tres
clases de las cuales se probará un dato.

Clase válida: 1 a 100 (cualquier número), Clase no válida: -1 (marcando la más baja de la más baja), Clase no válida:
101 (la más alta de la más alta).

#### Transición entre estados

Esta técnica de prueba utiliza las entradas, salidas y el estado del sistema durante la fase de prueba. Compara el
software con la secuencia de transiciones o eventos entre los datos de prueba.

Según el tipo de software que se prueba, verifica los cambios de comportamiento de un sistema en un estado particular u
otro estado mientras mantiene las mismas entradas.

Por ejemplo, una página de inicio de sesión le permitirá ingresar el nombre de usuario y la contraseña hasta tres
intentos. Cada contraseña incorrecta se enviará al usuario a la página de inicio de sesión. Después del tercer intento,
el usuario será enviado a una página de error. Este método de transición de estado considera los diversos estados del
sistema y las entradas para pasar solo a la secuencia correcta de la prueba.

#### Tablas de decisión

Este enfoque crea casos de prueba basados en varias posibilidades. Considera múltiples casos de prueba en un formato
de tabla de decisión donde cada condición se verifica y se cumple, para pasar la prueba y proporcionar resultados
precisos. Se prefiere en el caso de varias combinaciones de entrada y múltiples posibilidades.

Por ejemplo, una aplicación de entrega de alimentos verificará varios modos de pago como entrada para realizar el
pedido: toma de decisiones basada en la tabla.

Caso 1: si el usuario final tiene una tarjeta, el sistema no comprobará si hay efectivo o cupón y tomará medidas para
realizar el pedido.

Caso 2: Si el usuario final tiene un cupón, no se verificará si tiene una tarjeta o efectivo y se tomarán medidas.

Caso 3: si el usuario final tiene efectivo, se tomará la acción.

Caso 4: si el usuario final no tiene nada, no se tomarán medidas.

#### Pruebas de casos de uso/ funcionales

Los casos de uso describen las interacciones entre actores (que pueden ser usuarios o sistemas) que producen un
resultado que agrega algún valor. A partir de estos se pueden derivar casos de prueba. Tienen precondiciones que deben
cumplirse para que estos funcionen de forma exitosa. Los casos de uso terminan con post-condiciones, que son resultados
observables y estado del sistema después de la ejecución. Son útiles para definir las pruebas de aceptación, en las que
participa el usuario o cliente.

Ahora veremos un ejemplo de pruebas para la parte de Partición de Equivalencia y Valor Límite [Ejemplo 02: Partición de Equivalencia y Valor Límite](./Ejemplo-02)
 para que con esta información podamos iniciar el siguiente reto [Reto 02: Pruebas con técnicas de caja negra](./Reto-02)

---

### <ins>Técnicas de caja blanca</ins>

#### Prueba del camino básico (Path testing)

En la prueba de ruta, escribiremos los gráficos de flujo y probaremos todas las rutas independientes. Aquí, escribir el
gráfico de flujo implica que los gráficos de flujo representan el flujo del programa y también muestran cómo cada
programa se agrega entre sí, como podemos ver en la siguiente imagen:

![image](https://user-images.githubusercontent.com/22419786/168200721-3d873bea-8e80-49d2-bf1a-c72b740142c8.png)

Y probar todas las rutas independientes implica que suponga una ruta desde main () a la función G, primero configure los
parámetros y pruebe si el programa es correcto en esa ruta en particular, y de la misma manera pruebe todas las demás
rutas y corrija los errores.

#### Prueba de ciclo o bucle

En la prueba de bucle, probaremos los bucles como while, for y do-while, etc. y también verificaremos la condición de
finalización si funciona correctamente y si el tamaño de las condiciones es suficiente.

Por ejemplo: tenemos un programa en el que los desarrolladores han dado alrededor de 50,000 bucles.

```{
    while (50000)
    ……
    ……
    }
```

No podemos probar este programa manualmente durante todo el ciclo de 50.000 bucles. Entonces escribimos un pequeño
programa que ayuda para los 50,000 ciclos, como podemos ver en el programa a continuación, que la prueba TestUno está
escrita en un lenguaje similar al programa de código fuente, y esto se conoce como prueba unitaria. Y está escrito solo
por los desarrolladores.

```
   TestUno {
    ……
    ……
    }    
```

Como podemos ver en la imagen de abajo, tenemos varios requisitos como 1, 2, 3, 4. Y luego, el desarrollador escribe los
programas como el programa 1,2,3,4 para las condiciones paralelas. Aquí la aplicación contiene las 100 líneas de código.

![image](https://user-images.githubusercontent.com/22419786/168200902-7adf74ba-5c55-40b5-bbfe-903c5bec9f2a.png)

El desarrollador hará la prueba de caja blanca y probará los cinco programas línea por línea de código para encontrar el
error. Si encuentran algún error en alguno de los programas, lo corregirán. Y nuevamente tienen que probar el sistema,
entonces este proceso requiere mucho tiempo y esfuerzo y ralentiza el tiempo de lanzamiento del producto.

Ahora, supongamos que tenemos otro caso, donde los clientes quieren modificar los requisitos, luego el desarrollador
hará los cambios necesarios y probará los cuatro programas nuevamente, lo que requiere mucho tiempo y esfuerzo.

Estos problemas se pueden resolver de las siguientes formas:

En este caso, escribiremos una prueba para un programa similar donde el desarrollador escribe este código de prueba en
el lenguaje relacionado como código fuente. Luego ejecutan este código de prueba, que también se conoce como programas
de prueba unitaria. Estos programas de prueba están vinculados al programa principal y se implementan como pruebas.

![image](https://user-images.githubusercontent.com/22419786/168200912-85a28703-4d13-438d-bdc1-7581a48a53d6.png)

Por lo tanto, si hay algún requisito de modificación o error en el código, el desarrollador realiza el ajuste tanto en
el programa principal como en el programa de prueba y luego ejecuta el programa de prueba.

#### Pruebas de condiciones o condicionales

En este tipo de prueba necesitamos validar todas las condiciones para ambos valores: verdadero(true) y falso(false).
Probando todas las posibles combinaciones
```
if(condition) - true  
{  
…..  
……  
……  
}  
else - false  
{  
…..  
……  
……  
```

Una prueba de caja blanca la podemos ver en el siguiente ejemplo [Ejemplo 03: Técnicas de caja blanca](./Ejemplo-03)


---

### Postwork :memo:
- [Postwork](./Postwork)



