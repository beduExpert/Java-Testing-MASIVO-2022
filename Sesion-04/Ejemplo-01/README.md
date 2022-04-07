# Ejemplo 1 - Técnicas de caja negra: Requerimiento funcional / Caso de uso

## :dart: Objetivos

- Analizar qué son las pruebas de tipo black box testing

## Desarrollo

Como vimos en la sesión 2 (Testing processes in Agile) de nuestro módulo de QA Automation Testing las historias de
usuario (en formato AS, WANT, SO) nos permiten describir de forma rápida y abreviada una acción que el usuario desea
realizar en nuestro sistema. Complementadas con descripciones de BDD (formato GIVEN, WHEN. THEN) nos permiten definir
requerimientos y escribir pruebas. Sin embargo dichas herramientas pueden carecer de detalles necesarios, para ello otra
técnica de escribir requerimientos y que podemos usar para probar nuestro software son los casos de uso.

### Diferencias entre historias de usuario y casos de uso

Las historias de usuario tratan sobre necesidades. Cuando escribe una historia de usuario, lo que está describiendo es
una necesidad del usuario. Es algo que el usuario debe hacer en su trabajo diario. Si nunca construyes ningún software
para él, ¡esa necesidad seguirá existiendo!

Los casos de uso se refieren al comportamiento que creará en el software para satisfacer esas necesidades. Un
desarrollador que necesita crear software que funcione debe poder leer un caso de uso y tener una buena idea de lo que
debe hacer el software. Por lo general, tiene muchos detalles y describe todo lo que el desarrollador necesita construir
para satisfacer las necesidades del usuario. Es por eso que debe tener muchos más detalles y ser claro e inequívoco.

Las historias de usuario son fáciles de leer para los usuarios. Cuando escribe una historia de usuario, en lo que se
concentra es en escribir algo que cualquiera pueda entender, en el idioma de los usuarios. Todos sabemos que los
desarrolladores tienen mucha más paciencia para hablar sobre los detalles del software que están creando que los
usuarios, por lo que las historias de los usuarios deben ser breves. Una historia de usuario debe expresar un
pensamiento completo en solo un par de oraciones.

Los casos de uso describen una interacción completa entre el software y los usuarios (y posiblemente otros sistemas).
Cuando realiza un análisis de casos de uso, lo que está haciendo es diseñar una solución funcional que satisfaga las
necesidades de los usuarios. Debe ser algo que los desarrolladores puedan implementar. Es posible que una historia de
usuario genere varios casos de uso. Y cuando combina todos sus casos de uso en un documento de caso de uso, terminará
con una descripción completa de cada interacción entre el usuario y el software que planea construir. Y si su software
tiene que interactuar con múltiples sistemas, puede terminar tratando a esos otros sistemas como actores en su caso de
uso.

Cabe aclarar que: de **una historia de usuario pueden desprenderse múltiples casos de uso**

### De historia de usuario a caso de uso

A continuación describiremos una historia de usuario en diferentes etapas, hasta llegar a una descripción detallada en
un caso de uso. La siguiente historia representa la actividad que tiene que llevar a cabo un estudiante apra registrarse
en la plataforma de su universidad

#### Historia de usuario

Registrarse como estudiante

Un usuario quire registrarse en el sistema como estudiante para poder acceder a las funcionalidades dle estudiante.

#### Historia de usuario (As, Want, So)

Registrarse como estudiante

AS un usuario I WANT poder registrarme como estudiante SO puedo ingresar a las funcionalidades para usuario estudiante

#### Descripción Given, When, Then (GWT)

Criterios de aceptación

GIVEN un usuario WHEN ingresa los datos complementarios: Carrera y Nombre THEN se crea su registro en la aplicación

GIVEN un usuario WHEN ingresa nombre de carrera o institución (cadena mayor a 3 caracteres)
THEN Se despliegan las posibles opciones encontradas agrupadas y puede seleccionar alguna de estas.

GIVEN un usuario WHEN Borra el campo de carrera THEN se oculta el modal

GIVEN un usuario WHEN selecciona su carrera THEN el botón Siguiente se desbloquea y puede continuar con su registro

GIVEN un usuario WHEN Inserta su nombre (min 3 caracteres)
THEN Se desbloquea el botón de continuar y puede finalizar su registro

#### Caso de Uso

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
