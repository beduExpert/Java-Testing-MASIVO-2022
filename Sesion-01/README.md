# Sesión #1: Introduction to Testing

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

La ejecuciÃ³n de las pruebas de software se puede definir como la ejecuciÃ³n de un mÃ©todo o conjunto de pruebas. Esto puede incluir uno o mÃ¡s casos de prueba. La ejecuciÃ³n puede generar dos resultados:

#### Verde, pasa

Se obtienen los resultados esperados cuando se ejecuta el caso de prueba sobre el SUT. 
TambiÃ©n pueden existir falsos negativos, que es cuando se obtiene el resultados esperado aunque el SUT no estÃ© funcionando como deberÃ­a con algunos error o fallos que pueden pasar desapercibidos. Usualmente estos fallos se apareceren en producciÃ³n.

#### Rojo, no pasa

ExistiÃ³ un fallo en la prueba, quiere decir que los resultados esperados cuando se ejecuta el caso de la prueba sobre el SUT, no se cumplieron. AquÃ­ pueden existir dos casos:
- Error en la prueba: Hubo algÃºn error en la ejecuciÃ³n de la prueba. Suelen ser problemas locales fÃ¡ciles de detectar.
- Falso Positivo: Se produce un error aunque el SUT funcione correctamente. La prueba debe ser arreglada ajustandose de mejor manera al SUT.

El siguiente ejemplo muestra como probar un flujo cuando se agrega un nuevo entrevistador [Ejemplo 01: Probar el flujo para añadir un nuevo entrevistador](./Ejemplo-01)

---
### <ins>Tema 2: Proceso de Pruebas</ins>

- [Ejemplo 02: Pruebas unitarias](./Ejemplo-02)
    - [Reto 01: Bajas de entrevistadores](./Reto-01)
- [Ejemplo 03: Como seleccionar casos de prueba](./Ejemplo-03)
    - [Reto  02: Definir modelo de datos para entrevistas](./Reto-02)
- [Postwork:](./Postwork/README.md)




