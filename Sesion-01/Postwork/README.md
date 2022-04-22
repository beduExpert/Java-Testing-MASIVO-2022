# Postwork

[Ver en Google docs](https://docs.google.com/document/d/1hjAhgku2h0xnTDKSEA2dBWyz51G8g44runt4SRp4ctw/edit?usp=sharing)

### 🎯 OBJETIVOS

- Desarrollar funcionalidad adicional a nuestro programa.
- Añadir pruebas unitarias adicionales para probar su funcionalidad.
- Aplicar técnicas de diseño de pruebas.
- Utilizar la herramienta JUNIT. 
- Realizar integración continua con Github

### 🚀 DESARROLLO

Durante nuestro work, desarrollamos las primeras funcionalidades de nuestro software de entrevistas  y nos comenzamos a familiarizar con el uso de JUnit. Ahora en este postwork continuaremos con el desarrollo del software de entrevistas y exploramos algunas funcionalidades de JUnit realizando el siguiente ejercicio en equipos.

El project manager ha definido como objetivo para este sprint añadir las siguientes características a nuestro sistema actual:
    - La información de los entrevistadores se puede modificar desde terminal.
    - La definición de hecho (Definition of Done) establece que todo el código generado debe contar con pruebas unitarias.

Sigue estas instrucciones:

1. Añade la opción número 3 al menú, con el texto: "3. Modificar un entrevistador". 

2. Dentro de nuestro switch generar el case con valor 3 y llamar a la función modifyInterviewer que crearemos a continuación.

3. Crear la función modifyInterviewer solicitar el email del entrevistador y en caso de no encontrarlo imprimir el mensaje:  "Entrevistador no encontrado".

4. Solo se debe continuar en este flujo si el entrevistador fue encontrado. 

5. Solicitar a continuación el nuevo nombre, apellido y email, mencionando que se debe apretar Enter para mantener el valor actual. Preguntar si el entrevistador se encuentra activo.

6. Guardar los datos del entrevistador llamando a la función save de nuestro objeto interviewer.

7. Añadir las pruebas unitarias correspondientes para validar el correcto funcionamiento de la funcionalidad de editar entrevistadores.

8. Instalar Github o trabajarlo en línea, iniciar sesión y crear el repositorio.

9. Hacer el versionamiento del código incluyendolo en el repositorio creado.
 

### Reflexiones finales 

Una vez que hayas terminado  la actividad responde las siguientes preguntas:

¿Cómo estás creando la prueba para validar que se guardan correctamente los archivos?
_________________________________________________________________________________________________________________________________________________________________________________________________________________________________
¿Decidiste probar directamente en los métodos de la clase interviewer o estás probando en el menú?
_________________________________________________________________________________________________________________________________________________________________________________________________________________________________

¿Crees que existe diferencia entre las pruebas hechas directamente a la clase interviewer y las realizadas al menú? ¿Por qué?
_________________________________________________________________________________________________________________________________________________________________________________________________________________________________

**¡Mucho éxito y reta tu potencial!**

