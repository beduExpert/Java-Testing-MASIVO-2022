# Ejemplo #1 - Pruebas de Integración

## :dart: Objetivo

- Demostrar la forma de realizar pruebas de integración para Java

## Desarrollo

Las pruebas de integración las veremos evidenciadas en este ejemplo:

Soy propietario de una empresa de publicidad y publico anuncios en diferentes sitios web. Al final del mes, quiero ver cuántas personas vieron mis anuncios y cuántas personas hicieron clic en mis anuncios. Necesito un informe de mis anuncios mostrados y cobro en consecuencia a mis clientes.

Software GenNext desarrollé este producto para mí y a continuación estaba la arquitectura:

![image](https://user-images.githubusercontent.com/22419786/164873186-07ac9b1a-e2e0-44ad-a0c0-2681c331db9e.png)

- CEBOLLA - Módulo de interfaz de usuario, visible para el usuario final, donde se dan todas las entradas.
- Licenciado en Derecho - Es el módulo Business Logic, que tiene todos los cálculos y métodos específicos del negocio.
- VAL - Es el módulo de Validación, que tiene todas las validaciones de la corrección de la entrada.
- CNT - Es el módulo de contenido que tiene todos los contenidos estáticos, específicos de las entradas ingresadas por el usuario. Estos contenidos se muestran en los informes.
- EN - Es el módulo Engine, este módulo lee todos los datos que provienen del módulo BL, VAL y CNT y extrae la consulta SQL y la dispara a la base de datos.
- Programador - Es un módulo que programa todos los informes en función de la selección del usuario (mensual, trimestral, semestral y anual)
- DB - Es la base de datos.

Ahora, habiendo visto la arquitectura de toda la aplicación web, como una sola unidad, las pruebas de integración, en este caso, se centrarán en el flujo de datos entre los módulos.

Las preguntas aquí son:

- ¿Cómo leerán e interpretarán el módulo BL, VAL y CNT los datos ingresados ​​en el módulo UI?
- ¿El módulo BL, VAL y CNT está recibiendo los datos correctos de la interfaz de usuario?
- ¿En qué formato se transfieren los datos de BL, VAL y CNT al módulo EQ?
- ¿Cómo leerá el EQ los datos y extraerá la consulta?
- ¿La consulta se extrae correctamente?
- ¿El Programador obtiene los datos correctos para los informes?
- ¿El conjunto de resultados recibido por la EN de la base de datos es correcto y como se esperaba?
- ¿EN puede enviar la respuesta al módulo BL, VAL y CNT?
- ¿El módulo de la interfaz de usuario es capaz de leer los datos y mostrarlos adecuadamente en la interfaz?

En el mundo real, la comunicación de datos se realiza en formato XML. Entonces, cualquier dato que ingrese el usuario en la interfaz de usuario, se convierte a un formato XML.

En nuestro escenario, los datos ingresados ​​en el módulo UI se convierten en un archivo XML que es interpretado por los 3 módulos BL, VAL y CNT. El módulo EN lee el archivo XML resultante generado por los 3 módulos y extrae el SQL y realiza consultas en la base de datos. El módulo EN también recibe el conjunto de resultados y lo convierte en un archivo XML y lo devuelve al módulo UI que convierte los resultados en un formato legible por el usuario y lo muestra.

En el medio tenemos el módulo del programador que recibe el conjunto de resultados del módulo EN, crea y programa los informes.

Entonces, ¿dónde entra en juego la prueba de integración?
