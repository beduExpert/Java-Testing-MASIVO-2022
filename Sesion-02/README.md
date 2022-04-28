# Sesión #2: Unit Testing in Java

## :dart: Objetivos

- Definir que es una prueba unitaria
- Reconocer la importancia de escribir pruebas que garanticen el correcto funcionamiento de un método, por muy simple
  que sea
- Analizar técnicas, recomendaciones y buenas prácticas para escribir pruebas unitarias.
- Reconocer las diferencias entre distintos tipos de pruebas

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

## 📂 Contenido

### <ins>Tipos de pruebas</ins>

Existen diferentes tipos de tests, cuya principal diferencia radica en lo que buscan probar. Actualmente existen discrepancias acerca de los nombres que se les dan y los tipos que existen. Por ello y siguiendo a algunos autores los clasificaremos en tres grandes grupos: test unitarios (unit tests), test de integración (integration tests) y test punta a punta (E2E por su nombre en Ingles End to End)

![testing pyramid](https://raw.githubusercontent.com/beduExpert/Java-Testing-2021/main/Sesion-02/Ejemplo-01/assets/testing%20pyramif.png)


#### Pruebas unitarias

Las pruebas unitarias consisten en aislar una parte del código (una función, método o clase) y comprobar que funciona correctamente. Son pequeños tests que validan el comportamiento de un objeto y la lógica.
El unit testing suele realizarse durante la fase de desarrollo de aplicaciones de software o móviles. Normalmente las llevan a cabo los desarrolladores


#### Pruebas de integración

También denominados por algunos autores como tests funcionales, prueban la interacción entre dos o más elementos, que pueden ser clases, módulos, paquetes, subsistemas, etc… incluso la interacción del sistema con el entorno de producción.

#### Pruebas E2E:
Prueban todo el flujo del software desde el punto de vista del usuario final. Prueban el software desde la interfaz de usuario y no desde el código interno. Están enfocados en detectar posibles problemas que pudieran encontrar nuestros usuarios en su interacción con el flujo general del programa.

A continuación veremos un ejemplo de pruebas de integración [Ejemplo 01: Pruebas de Integración](./Ejemplo-01)

---

### <ins>Pruebas Unitarias</ins>

Las pruebas unitarias consisten en aislar una parte del código (una función, método o clase) y
comprobar que funciona correctamente. Son pequeños tests que validan el comportamiento de un
objeto y la lógica.

#### Características
Para que una prueba unitaria tenga la calidad suficiente se deben cumplir los siguientes requisitos:

- Automatizable: No debería requerirse una intervención manual.
- Completas: Deben cubrir la mayor cantidad de código.
- Repetibles: No se deben crear pruebas que solo puedan ser ejecutadas una sola vez.
- Independientes: La ejecución de una prueba no debe afectar a la ejecución de otra.
- Profesionales: Las pruebas deben ser consideradas igual que el código, con la misma
profesionalidad, documentación, etc.


#### Las 3 A’s del unit testing

Para llevar a cabo buenas pruebas unitarias, deben estar estructuradas siguiendo las tres A’s del Unit
Testing. Se trata de un concepto fundamental respecto a este tipo de pruebas, que describe un proceso
compuesto de tres pasos.

- Arrange (organizar). Es el primer paso de las pruebas unitarias. En esta parte se definen los
requisitos que debe cumplir el código.
- Act (actuar). Es el paso intermedio de las pruebas, el momento de ejecutar el test que dará
lugar a los resultados que deberás analizar.
- Assert (verificar). En el último paso, es el momento de comprobar si los resultados obtenidos
son los que se esperaban. Si es así, se valida y se sigue adelante. Si no, se corrige el error hasta
que desaparezca.

En el siguiente ejemplo veremos como realizar pruebas unitarias a nuestro código [Ejemplo 02: Pruebas unitarias](./Ejemplo-02)

Ahora, con base en el anterior ejemplo vamos a iniciar nuestro primer reto donde haremos bajas de entrevistadores [Reto 01: Bajas de entrevistadores](./Reto-01)

---

### <ins>Como seleccionar casos de prueba</ins>

- Generar casos de prueba efectivos que revelen la presencia de fallas es fundamental para el éxito del proceso de pruebas (etapa de preparación).
- Idealmente, se debería determinar un conjunto de casos de prueba tales que su ejecución exitosa implique que no hay errores en el software desarrollado
- Comúnmente este objetivo ideal no se puede lograr debido a las limitaciones prácticas y teóricas.
- Cada caso de prueba cuesta dinero: esfuerzo para generarlo, tiempo de cómputo para ejecutarlo, esfuerzo para evaluar los resultados, por lo tanto, el número de casos de prueba necesarios para detectar los errores debe ser minimizado para reducir costos

Los dos objetivos principales del proceso de pruebas:
- Maximizar el número de errores detectados (cobertura)
- Reducir al mínimo el número de casos de prueba (costo)

Como con frecuencia son contradictorios, el problema de seleccionar el conjunto de casos de prueba con el que un programa debe ser probado se vuelve una tarea muy compleja

Una estrategia simple que podemos seguir es elegir casos de prueba de alguno de los siguientes grupos

- Casos extremos (edge cases)
- Caso representativo de un grupo

Tambien podemos aplicar las siguientes tecnicas de integración

- Big bang, combinar todos los componentes y probar el sistema como un todo
- Integración incremental, los componentes se integran y prueban poco a poco
- Integración descendente (componentes de funcionales)
- Integración ascendente (componentes de infraestructura, e.g. acceso a BD)


Ahora, vamos a documentar nuestro set de pruebas para identificar los casos que se deben tener en cuenta para ejecutar. En este ejemplo vemos que información es requerida [Ejemplo 03: Documentar un set de pruebas](./Ejemplo-03)

Realicemos ahora nuestro reto final de la sesión donde tendremos un modelo de datos para entrevistas [Reto 02: Modelo de datos para entrevistas](./Reto-02)


---

### Postwork :memo:

- [Postwork:](./Postwork/README.md)




