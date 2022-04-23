# Ejemplo 1 - Casos de uso

## :dart: Objetivos

- Elaborar casos de uso para ejecución de acuerdo a los set de pruebas.

## Desarrollo

En este ejemplo veremos que información es clave para la elaboración de casos de uso.

Precondiciones:

    El usuario se encuentra registrado pero aún no es algún tipo de Persona (Student o Affiliate)

Actor: 

    User

Input:

    major_id (integer)
    name (string al menos 3 caracteres)
    last_name (string al menos 3 caracteres)
    referrer_code (string de n caracteres, opcional)

Output:

    id_course_progress

Flow:

    1. Crear el student correspondiente
        1.1 Obtener el referrer ?
        1.2 Set _is_pending_invitation_reward_to_referrer_student
        1.3 Crear entidad estudiante
        1.4 Guardar la entidad
    2. Crear el course_progress correpsondiente con el major seleccionado
        2.1 Obtener el major
        2.2 Crear el course_progress
        2.3 Guardar course_progress
    3. Dar al estudiante el paquete correspondiente por su registro
        3.1 Obtener el paquete de monedas correspondiente
        3.2. Crear la transaccion
        3.3 Ejecutar la transaccion
        3.4 Enviar la respuesta
    4. Realizar la compra del curso por parte del estudiante
        4.1 Obtener el estudiante correspondiente
        4.2. Obtener el couse_product correspondiente
            4.2.1 Obtener su precio
                4.2.1.1 Si el producto no existe lanzar la excepción ProductDoesNotExist
        4.3 Verificar que el coins_balance del estudiante no sea menor que el precio del producto
            4.3.1 Lanzar excepción InsufficientBalance
        4.5 Crear la transacción
        4.6 Ejecutar la transacción
        4.7 Enviar la respuesta
    5.Enviar la respuesta
