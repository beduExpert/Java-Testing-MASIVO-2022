
# Sesión 7: Test Quality

## :dart: Objetivos

- Definir el concepto de calidad en software
- Diferenciar entre testing y calidad
- Crear pruebas de calidad
- Utilizar herramienta y métricas que ayuden a definir la calidad

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


### <ins>Métricas DORA</ins>

![image](https://user-images.githubusercontent.com/22419786/166856701-e552ec86-7766-405c-adc3-391bb66d93e6.png)

El proceso de desarrollo de software no es fácil de medir y administrar, particularmente a medida que se vuelve más complejo y descentralizado. En muchas empresas, hay varios equipos que trabajan en partes más pequeñas de un gran proyecto, y estos equipos están repartidos por todo el mundo. Es un desafío saber quién está haciendo qué y cuándo, si existen cosas que esten bloqueando al equipo y qué tipo ha sido lo que retrasado el proceso. Sin un conjunto confiable de puntos de datos para rastrear a través de los equipos, es virtualmente imposible ver cómo encaja cada pieza del rompecabezas del proceso de desarrollo de aplicaciones. Las métricas de DORA pueden ayudar a arrojar luz sobre el desempeño de sus equipos en DevOps.

#### ¿Qué son las métricas DORA?

Estas métricas no surgieron de la nada. Las métricas de DORA son el resultado de seis años de encuestas realizadas por el equipo de DORA (DevOps Research and Assessments) que, entre otros puntos de datos, miden específicamente la frecuencia de implementación (DF), el tiempo medio de espera para cambios (MLT), el tiempo medio para recuperarse después de un fallo (MTTR) y tasa de fallo en cambios (CFR). Estas métricas sirven como una guía de qué tan bien se están desempeñando los equipos de ingeniería y qué tan exitosa es una empresa en DevOps, que van desde los "de bajo rendimiento" hasta los "de élite". Ayudan a responder la pregunta: ¿Somos mejores en DevOps ahora que hace un año?

Los resultados y datos de la investigación de DORA se han convertido en un estándar de medición para aquellas personas que son responsables de rastrear el desempeño de DevOps en su organización. Los líderes de ingeniería y DevOps deben comprender estas métricas para administrar el rendimiento de DevOps y mejorar con el tiempo.

#### ¿Por qué es tan importante realizar un seguimiento de las métricas de DORA?

Sencillo. Ayudan a DevOps y a los líderes de ingeniería a medir el rendimiento (velocidad) y la estabilidad (calidad) de la entrega de software. Muestran cómo los equipos de desarrollo pueden ofrecer un mejor software a sus clientes, más rápido. Estas métricas brindan a los líderes datos concretos para que puedan medir el desempeño de DevOps de la organización, y para que puedan informar a los ejecutivos y recomendar mejoras.

Las métricas de DORA ayudan a alinear los objetivos de desarrollo con los objetivos comerciales. Desde la perspectiva de la gestión de productos, ofrecen una visión de cómo y cuándo los equipos de desarrollo pueden satisfacer las necesidades de los clientes. Para los líderes de ingeniería y DevOps, estas métricas pueden ayudar a demostrar que la implementación de DevOps tiene un valor comercial claro.


---

### <ins>4 Métricas Clave</ins>

#### Análisis de valores límite

Las cuatro métricas clave

Profundicemos un poco más en las cuatro métricas que el equipo de DORA ha identificado como esenciales para el éxito de DevOps de una organización. 

#### Frecuencia de implementación

La frecuencia de implementación se refiere a la cadencia de los lanzamientos exitosos de una organización a producción. Los equipos definen el éxito de manera diferente, por lo que la frecuencia de implementación puede medir una variedad de cosas, como la frecuencia con la que se implementa el código en producción o la frecuencia con la que se publica para los usuarios finales. Independientemente de lo que mida esta métrica equipo por equipo, los equipos de élite apuntan a una implementación continua, con múltiples despliegues por día. 

#### Plazo medio de entrega de cambios

El tiempo medio de espera para los cambios mide el tiempo que tarda un commit en entrar en producción. Ayuda a los líderes de ingeniería y DevOps a comprender qué tan saludable es el ciclo de release de sus equipos y si podrían manejar una afluencia repentina de solicitudes. Al igual que la frecuencia de implementación, esta métrica proporciona una forma de establecer el ritmo de entrega de software en una organización: su velocidad. 

#### Tiempo medio para recuperarse

¿Cuánto tiempo le toma a un equipo restaurar el servicio en caso de una interrupción no planificada u otro incidente? Este punto de datos es el tiempo medio del equipo para recuperarse. Es fundamental poder restaurar el servicio lo más rápido posible (con un tiempo medio de recuperación bajo). Los equipos de élite mejoran esta métrica con la ayuda de un monitoreo sólido y la implementación de prácticas de entrega progresiva. 

#### Tasa de fallas en cambios

La tasa de fallas en cambios de un equipo se refiere a la frecuencia con la que sus cambios conducen a fallas en producción. Rollbacks, las implementaciones fallidas y los incidentes con soluciones rápidas, independientemente de la causa raíz, cuentan para la tasa de fallas en cambios. Al igual que el tiempo medio para recuperarse, esta métrica ayuda a medir la estabilidad. ¿Cuánto tiempo del desarrollador se dedica a tareas que no contribuyen al valor empresarial? Comprender la tasa de fallas en cambios ayuda a los líderes a decidir dónde invertir en infraestructura para respaldar a los equipos de desarrollo.

---

### <ins>Indice de calidad del software</ins>

En el siguiente ejemplo podemos ver otras métricas existentes: [Ejemplo 01:  Indice de calidad del software](./Ejemplo-01) 

Con base en el anterior ejemplo, podemos solucionar los 3 retos siguientes de métricas I y II.

* [Reto 01: Implementación de métricas clave I](./Reto-01)
* [Reto  02: Implementación de métricas clave II](./Reto-02)
* [Reto 03: Implementación del índice de calidad del software](./Reto-03)


---

### <ins>Otras Métricas</ins>

Existen otras métricas para la calidad de las pruebas, el siguiente ejemplo muestra como se realizan. [Ejemplo 02: Otras métricas](./Ejemplo-02)

---

### Postwork :memo:
- [Postwork](./Postwork)




