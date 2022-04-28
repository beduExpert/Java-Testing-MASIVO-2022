# Sesión #3: JUnit & TestNG

## :dart: Objetivos

PENDIENTE

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

### <ins> Razones para migrar de JUnit 4 a JUnit 5 </ins>

Entre las múltiples razones que podemos encontrar para utilizar JUnit 5 podemos encontrar: 
- JUnit 5 aprovecha las características de Java 8 o posterior, como las funciones lambda, lo que hace que las pruebas sean más potentes y fáciles de mantener.
- JUnit 5 ha agregado algunas características nuevas muy útiles para describir, organizar y ejecutar pruebas. Por ejemplo, las pruebas obtienen mejores nombres para mostrar y se pueden organizar jerárquicamente.
- JUnit 5 está organizado en varias bibliotecas, por lo que solo se importan a su proyecto las funciones que necesita. Con sistemas de compilación como Maven y Gradle, incluir las bibliotecas adecuadas es fácil.
- JUnit 5 puede usar más de una extensión a la vez, lo que JUnit 4 no podría (solo se puede usar un corredor a la vez). Esto significa que puede combinar fácilmente la extensión Spring con otras extensiones (como su propia extensión personalizada).

El siguiente ejemplo muestra las diferencias entre JUnit 4 y 5 a nivel de arquitectura, aserciones, entre otros [Ejemplo 01: Diferencias entre JUnit 4 y JUnit 5](./Ejemplo-01)

Con base en el ejemplo anterior, vamos a desarrollar el primer reto de esta sesión [Reto 01: Altas y consultas de entrevistadores](./Reto-01)

---
### <ins>Tipos de Pruebas de Software</ins>

Existen diferentes tipos de pruebas de software, en este documento se presentan los tipos según el SUT:

- Aceptación
- Sistema
- Integración
- Componente
- Unitaria

#### Aceptación

Se prueba el sistema completo, desde la interfaz hasta la base de datos o de al menos alguna parte del sistema que sea funcional. El objetivo es validar los requireimientos iniciales como son los casos de uso, historias de usuario, etc. Quienes realizan estas pruebas usualmente son los usuarios finales que no formaron parte del desarrollo.

#### Sistema

Se prueba el sistema completo, desde la interfaz hasta la base de datos o de al menos alguna parte del sistema que sea funcional. El objetivo es validar los requireimientos iniciales como son los casos de uso, historias de usuario, etc. Quienes realizan estas pruebas son personas dedicadas a las pruebas que pueden involucrar al usuario, pero no formaron parte del desarrollo.

#### Integración

Se prueban componentes del sistema o subsistemas. El objetivo es verificar la comunicación entre los componentes del sistema o sus subsistemas. Quienes realizan estas pruebas son los desarrolladores incolucrando al usuario.

#### Componente

Se prueban grupos o partes del sistema que en conjunto hacen funcionar un componente o servicio. El objetivo es verificar el funcionamiento correto e independiente de los componentes. Quienes realizan estas pruebas son los desarrolladores incolucrando al usuario.

#### Unitaria

Se prueba una sola clase, objeto, o método. El objetivo es verificar las condiciones del diseño y documentar su comportamiento. Quienes realizan estas pruebas son los desarrolladores incolucrando al usuario.

A continuación se puede ver como se prueba un flujo para obtener la información de un entrevistador [Ejemplo 02: Probar flujo para obtener info de un entrevistador](./Ejemplo-02)

---
### <ins>Integración Continua</ins>

La integración continua es la práctica de desarrollo de software en donde los integrantes de ese equipo de desarrollo, y
como el nombre lo indica, continuamente integran su trabajo. Ésta integración puede suceder al menos una vez al día lo
que da lugar a múltiples colaboraciones al día. Las integraciones continuas incluyen ejecución de pruebas para detectar
fallos tan rápido como sea posible. El no incluir pruebas de las integraciones continuas, puede dar lugar a errores en
el código que pasan desapercibidas. En caso de encontrar errores en el código, se tendrá que volver a construir la
integración hasta lograr una libre de fallos.

#### Entornos

Las integraciones continuas pueden realizarse en diferentes entonces, aquí se encuentra una lista de posibles entornos:

- **Entorno de Producción:** Es el entorno en el que se exploran las aplicaciones ejecutadas
- **Entorno de Pre-Producción:** Es el entorno con las mismas características de el de producción pero con la finalidad
  de realizar pruebas sobre las aplicaciones y poder ser mandadas a producción.
- **Entorno de Integración Continua:** Es el entorno donde se manejan y gestionan las ramas (branches) del código.
- **Entorno Local:** Es el entorno del desarrollador

#### Requisitos Para la Integración Continua

Estos son los requisitos para mantener un flujo de integración continua:

- Mantener un único repositorio con un controlador de versiones, tales como GitHub, GitLab, SVN, etc.
- Automatizar la construcción
    - Toda integración se realiza en la rama de desarrollo dentro del entorno de integración
    - Cada construcción debe incluir la ejecución de pruebas inmediatas
    - Arreglar fallos inmediatamente
- Automatizar el despliegue
- Probar en un entorno de Pre-Producción
- Facilitar la obtención del último ejecutable
- Que todo el equipo pueda ver lo que está sucediendo

#### Pruebas Continuas (Continuous Testing)

Las pruebas continuas se basan en la automatización de pruebas integradas, como parte de un proceso de implementación en
el que el software se valida en entornos de pruebas realistas. La adición de la virtualización del servicio , permite a
los equipos comenzar a comprobar la calidad del software más temprano en el ciclo de vida, simulando software y sistemas
dependientes, pero no disponibles. Las pruebas continuas permiten a un equipo de proyecto ejecutar pruebas cuando sea
necesario, no cuando sea posible.

Algunos puntos importantes sobre las pruebas continuas:

- Las pruebas continuas proporcionan una visión instantánea sobre si un candidato de lanzamiento es demasiado arriesgado
  para proceder a través del pipeline de entrega.
- Las pruebas continuas establecen una red de seguridad que ayuda al equipo a proteger la experiencia del usuario en los
  procesos de desarrollo acelerados y a evitar los titulares de los fallos del software
- Las pruebas continuas esperan que las pruebas se integren en el proceso de desarrollo, no que se añadan al final.

En este ejemplo veremos como hacer una integración continua a un pequeño código con Github [Ejemplo 03: Repositorio en GitHub](./Ejemplo-03)


## Postwork :memo:

Encuentra las indicaciones y consejos para reflejar los avances de tu proyecto de este módulo.

- [Postwork: Analisis y pruebas del entrevistador con integración continua](./Postwork/README.md)




