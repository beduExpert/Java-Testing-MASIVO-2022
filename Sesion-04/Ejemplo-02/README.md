# Ejemplo 2 - Partición de Equivalencia y Valor Límite

## :dart: Objetivo

- Presentar un ejemplo de partición de equivalencia y valores límite de un ejercicio.


## Desarrollo

* Consideremos la cantidad de pizzas que se pueden solicitar en una pizzería.
* Los valores de pizza de 1 a 10 se consideran válidos. Se muestra un mensaje de éxito.
* Si bien un valor de 11 a 99 se considera no válido para un pedido y aparecerá un mensaje de error, «Solo se pueden pedir 10 pizzas»
 

**Aquí está la condición de prueba**

1. Cualquier número mayor que 10 ingresado en el campo Pedido de pizza (digamos 11) se considera inválido.
2. Cualquier número menor que 1 que sea 0 o menor se considera inválido.
3. Los números del 1 al 10 se consideran válidos
4. Cualquier número de 3 dígitos, por ejemplo, -100 no es válido.

No podemos probar todos los valores posibles porque, si se hace, el número de casos de prueba excederá los 100. Para abordar este problema, usamos una hipótesis de segmentación de equivalencia al dividir los valores potenciales de los tickets en grupos o conjuntos, como se muestra a continuación donde el comportamiento del sistema puede considerarse el mismo.

Los conjuntos divididos se denominan particiones equivalentes o clases equivalentes. Luego seleccionamos un valor de cada segmento para probarlo. La hipótesis está detrás de esta técnica. si una condición / valor en una partición tiene éxito, todos los demás también pasarán. Lo mismo, si falla una condición en una partición, todas las demás condiciones en esa partición fallan.
