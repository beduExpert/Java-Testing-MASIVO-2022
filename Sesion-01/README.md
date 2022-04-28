# Sesión #1: Introduction to Testing

## :dart: Objetivos

- Ejecutar prueba para un flujo agregando un nuevo entrevistador.
- Estructurar de manera correcta un código de programación.
- Integrar código java con Github

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

### <ins>El costo de probar software</ins>

>**¡Nota para experto(a)!**
>
> Seleccionar un par de equipos para que presenten su implementaciÃ³n del reto 1
> Generar conversaciÃ³n con los siguientes temas: Â¿CÃ³mo fue su proceso de desarrollo? Â¿CÃ³mo saben que su software estÃ¡ funcionando correctamente? Â¿EstÃ¡n probando su software?

La importancia de probar el software y corregir los bugs en un proyecto vas mÃ¡s de una compilaciÃ³n correcta, si no que puede llegar a costar mucho dinero si no se hace en el momento adecuado. Por ejemplo, digamos que una empresa no logrÃ³ detectar y corregir un bug en la etapa de desarrollo, se saltaron la etapa de pruebas por cuestiones de tiempo â€” o incluso para ahorrarse dinero â€” y se lanzÃ³ una aplicaciÃ³n web a producciÃ³n; algunos usuarios comienzan a reportar errores y se tiene que detener el servicio. La empresa tiene que dedicar recursos para revisar el cÃ³digo, encontrar el bug y trabajar en Ã©l, costando hasta **100 veces** mÃ¡s de lo que puedo haber costado en una etapa temprana.
Â¿Por quÃ© puede llegar a costar tanto?
Porque el regresar a corregir un error puede desencadenar que otras secciones del cÃ³gido se hayan visto afectados por Ã©ste, o includo por el cambio, desencadenando una *avalancha* de revisiones y posibles nuevos cambios.

Un estudio realizado por el Instituto de Nacional de EstÃ¡ndares de TecnologÃ­a de Estados Unidos, muestra que si un error es encontrado y corregido en la etapa de toma de requerimientos, puede costar unos 100 USD, si es encontrado en la etapa de pruebas, 1,500 UDS y si es encontrado en producciÃ³n, 10,000 USD.

Es por esto que no debemos saltarnos el proceso de probar el software, debemos considerarlo nuestra obligaciÃ³n al desarrollar un proyecto de software. Con Ã©sto nos estaremos ahorrando tiempo y lo que podrÃ­a llegar a ser mucho dinero.

#### Eficiencia y eficacia

Las pruebas, asÃ­ como muchas otras cosas medibles en nuestro entorno, tambiÃ©n adaptan la eficacia y eficiencia a las necesidades del ciclo de vida del software. AquÃ­ se presentan las definiciones de ambos tÃ©rminos para pruebas de software:

- **Eficacia:** Produce resultados deseados. Las pruebas deben ser correctamente ejecutadas y con las siguientes caracterÃ­sticas:
  - Ejecutarlas tan rÃ¡pidamente como sea posible.
  - Tratar de descubrir los errores tempranamente.
  - Encontrar los errores de mayor importancia antes que los de menos importancia.
- **Eficiencia:** Las pruebas son realizadas sin gastos extremos. Hay dos conceptos que tomar en cuenta:
  - Costo de Conformidad: Este se paga para en bÃºsqueda de la calidad, son los costos de detecciÃ³n y prevenciÃ³n de errores
  - Costo de No Conformidad: Este se paga cuÃ¡ndo no se puede conseguir la calidad y generalmente es un costo menor al de Conformidad. 


#### ¿Qué es una prueba?

Hemos hablado de la importancia de las pruebas en el ciclo de vida del software, Â¿pero quÃ© es en realidad una prueba y cÃºales son sus caracterÃ­sticas?
Hay dos etapas y conceptos que nos ayudan a entender lo que son las pruebas de software:

- **Validar:** Con esto podemos evitar irnos por el camino equivocado de acuerdo a las necesidades y peticiones del cliente. Sin la validaciÃ³n, podemos terminar construyendo un software que no sea el solicitado o con las caracterÃ­sticas requeridas.
- **Verificar:** Con esto podemos asegurar que lo desarrollado cumpla las caracterÃ­sticas de lo requerido, podemos detectar y corregir errores que pudieran desviar el resultado del objetivo.

Conceptos a tomar en cuenta para las pruebas de software:
- Feature (CaracterÃ­stica): Unidad cuya funcionalidad puede ser comprobable y es construida en la evoluciÃ³n de un proyecto de software.
- Subject Under Test (SUT): CaracterÃ­stica que se estÃ© probando en el momento.
- Depended-on Component (DOC): Parte del software que no se estÃ¡ verificando en alguna prueba de las que depende el SUT. 
- Test Case: (Caso de Prueba): Procedimiento para validar o verificar el SUT.

### Ejecución

La ejecución de las pruebas de software se puede definir como la ejecuciÃ³n de un mÃ©todo o conjunto de pruebas. Esto puede incluir uno o mÃ¡s casos de prueba. La ejecución puede generar dos resultados:

#### Verde, pasa

Se obtienen los resultados esperados cuando se ejecuta el caso de prueba sobre el SUT. 
También pueden existir falsos negativos, que es cuando se obtiene el resultados esperado aunque el SUT no está funcionando como debería con algunos error o fallos que pueden pasar desapercibidos. Usualmente estos fallos se apareceren en producción.

#### Rojo, no pasa

Existió un fallo en la prueba, quiere decir que los resultados esperados cuando se ejecuta el caso de la prueba sobre el SUT, no se cumplieron. Aquí pueden existir dos casos:
- Error en la prueba: Hubo algún error en la ejecución de la prueba. Suelen ser problemas locales fáciles de detectar.
- Falso Positivo: Se produce un error aunque el SUT funcione correctamente. La prueba debe ser arreglada ajustandose de mejor manera al SUT.

El siguiente ejemplo muestra como probar un flujo cuando se agrega un nuevo entrevistador [Ejemplo 01: Probar el flujo para añadir un nuevo entrevistador](./Ejemplo-01)

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

Ahora realizaremos el reto de prueba de software [Reto 02: Probando nuestro software](./Reto-02)

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

Finalmente vamos a añadir persistencia de datos en nuestro último reto de la sesión [Reto 03: Añadir persistencia de datos](./Reto-03)

## Postwork :memo:

Encuentra las indicaciones y consejos para reflejar los avances de tu proyecto de este módulo.

- [Postwork: Analisis y pruebas del entrevistador con integración continua](./Postwork/README.md)




