# Sesión #2: Unit Testing in Java

## :dart: Objetivos

- Definir que es una prueba unitaria
- Reconocer la importancia de escribir pruebas que garanticen el correcto funcionamiento de un método, por muy simple
  que sea
- Analizar técnicas, recomendaciones y buenas prácticas para escribir pruebas unitarias.

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

- [Ejemplo 01: Tipos de pruebas](./Ejemplo-01)
- [Ejemplo 02: Pruebas unitarias](./Ejemplo-02)
Ahora, con base en el anterior ejemplo vamos a iniciar nuestro primer reto donde haremos bajas de entrevistadores [Reto 01: Bajas de entrevistadores](./Reto-01)



---

#### <ins>Como seleccionar casos de prueba</ins>

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

---

### Postwork :memo:

- [Postwork:](./Postwork/README.md)




