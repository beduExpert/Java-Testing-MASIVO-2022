# Reto 1 - Técnicas de caja negra: Requerimiento funcional / Caso de uso II

## :dart: Objetivos

- Analizar qué son las pruebas de tipo black box testing
- Comparar y distinguir las diferencias entre black box y white box testing

## Desarrollo

Durante el siguiente reto deberás desarrollar:

- Historia de usuario en formato AS, WANT, SO, para añadir entrevistadores.
- Criterios de aceptación en formato GWT
- Casos de Uso

Deberás considerar los posibles casos "extremos" (_edge cases_), validaciones, errores y posibles excepciones.


<details>
  <summary>Solución</summary>

#### Historia de usuario

Añadir entrevistadores

El administrador quiere registrar nuevos entrevistadores en el sistema.

#### Historia de usuario (As, Want, So)

Añadir entrevistadores

AS un usuario administrador I WANT poder registrar nuevos entrevistadores SO los entrevistadores se pueden consultar en el sistema

#### Descripción Given, When, Then (GWT)

Criterios de aceptación

GIVEN un usuario administrador WHEN ingresa los datos del entrevistador THEN se crea su registro en la aplicación


#### Caso de Uso

Precondiciones:

    El usuario cuenta con persisos de administrador

Actor:

    Usuario administrador

Input:

    name (string al menos 3 caracteres)
    last_name (string al menos 3 caracteres)
    email (string de n caracteres)

Output:

    intervieewr_id

Flow:

    1. Crear el intervieewr correspondiente
        1.1 Validar el email
            1.1.1 Si el email es invalido lanzar la excepción InvalidEmail
        1.2 Crear la nueva instacia d ela clase Interviewer
        1.4 Guardar la entidad
        1.5 Responder con el id del nuevo entrevistador
    2.Enviar la respuesta

</details>