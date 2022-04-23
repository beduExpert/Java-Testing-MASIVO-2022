# Reto 2 - Pruebas de caja negra

## :dart: Objetivo

- Analizar qué son las pruebas de tipo black box testing
- Comparar y distinguir las diferencias entre black box y white box testing
- Implementar pruebas de caja negra

## Desarrollo

Describir casos de prueba aplicando técnicas de caja negra. Durante este reto solo describiremos los posibles casos de
prueba, todavía no debemos codificarlos. Los casos de prueba deben ser desarrollados para la historia de agregar un
entrevistador

- Generar casos de prueba utilizando la técnica de: Análisis de valores límite
- Generar casos de prueba utilizando la técnica de: Partición de equivalencia

<details>
  <summary>Solución</summary>

Casos con valores límite:

- Cadena vacía para cualquiera de los campos.
- Minimo número de caracteres aceptados en cualquier campo.
- Un carácter más del máximo soportado en cualquier campo.

Casos con partición de equivalencia:

- Cualquier caso de prueba cuyo número de caracteres sea menor al minimo aceptado, será equivalente a cualquier otro de
  ese grupo
- Cualquier caso de prueba cuyo número de caracteres sea mayor al maximo aceptado, será equivalente a cualquier otro de
  ese grupo
- Cualquier caso de prueba cuyo número de caracteres se encuentre el minimo y el maximo aceptado, será equivalente a
  cualquier otro de ese grupo

</details>
