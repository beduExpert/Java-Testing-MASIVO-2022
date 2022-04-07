# Ejemplo #2 - Pruebas Unitarias

## :dart: Objetivo

- Definir que es una prueba unitaria
- Analizar técnicas, recomendaciones y buenas prácticas para escribir pruebas unitarias.

## Desarrollo

### Pruebas unitarias

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


### Las 3 A’s del unit testing

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
