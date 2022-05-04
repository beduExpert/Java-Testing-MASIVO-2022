# Sesión 5: Mockito tool

## :dart: Objetivos

- Aplicar la técnica de fixtures para proveer información adicional a nuestras pruebas
- Aplicar el patrón de diseño factory para crear entidades y modelos dinámicamente en nuestras pruebas
- Utilizar mockito tool para generar mocks en nuestras pruebas

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
  - Mockito
- Frameworks web
  - Springboot


## 📂 Contenido

### <ins>Servicio para pruebas</ins>

En el siguiente ejemplo veremos como crear un servicio junto con sus pruebas. [Ejemplo 01: Creación de un servicio básico y sus pruebas](./Ejemplo-01)

---

### <ins>Pruebas con Stubs</ins>

Para las pruebas con stubs iniciaremos presentando un ejemplo del uso de data service donde mostramos como añadirlo [Ejemplo 02: Añadir un data service](./Ejemplo-02)

Con base en la información anterior, iniciaremos con nuestro primer reto de esta sesión. [Reto 01: Pruebas con stubs](./Reto-01)

---

### <ins>Pruebas con Mocks</ins>

Ya probamos con stubs el control de nuestras clases, sin embargo, cuando tenemos ya muchos stubs lo podemos manejar a través de librerias más robustas como lo es mockito. A continuación presentamos un ejemplo de como incorporar esta libreria al código. [Ejemplo 03: Pruebas con mocks](./Ejemplo-03)

Luego de ver este ejemplo podemos iniciar el reto de esta sección. [Reto 02: Pruebas con mockito](./Reto-02)

---

### <ins>Inyección de mocks</ins>

#### ¿Qué es la inversión de control?

La inversión de control (Inversion of Control - IOC) es un principio en la ingeniería de software que transfiere el
control de objetos o partes de un programa a un contenedor o marco. Lo usamos con mayor frecuencia en el contexto de la
programación orientada a objetos.

A diferencia de la programación tradicional, en la que nuestro código personalizado realiza llamadas a una biblioteca,
IoC habilita un marco para tomar el control del flujo de un programa y realizar llamadas a nuestro código personalizado.
Para habilitar esto, los marcos usan abstracciones con comportamiento adicional incorporado. Si queremos agregar nuestro
propio comportamiento, necesitamos extender las clases del marco o agregar nuestras propias clases.

Las ventajas de esta arquitectura son:

    Desvincular la ejecución de una tarea de su implementación facilitando el cambio entre diferentes implementaciones 
    Mayor modularidad de un programa
    Mayor facilidad para probar un programa al aislar un componente o burlarse de sus dependencias
    Permitir que los componentes se comuniquen a través de contratos.

Podemos lograr la Inversión de Control a través de varios mecanismos tales como: patrón de diseño de estrategia, patrón
de localizador de servicios, patrón de fábrica e inyección de dependencia (Dependency Injection - DI).

A continuación, veremos DI. [Ejemplo 04: Inyección de mocks](./Ejemplo-04)

El siguiente es el reto de esta sección [Reto 03: Inyección de mocks](./Reto-03)


---

### Postwork :memo:
- [Postwork](./Postwork)




