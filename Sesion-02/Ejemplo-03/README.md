# Ejemplo #3 - Como seleccionar casos de prueba

## :dart: Objetivo

- Reconocer la importancia de escribir pruebas que garanticen el correcto funcionamiento de un método, por muy simple
  que sea
- Analizar técnicas, recomendaciones y buenas prácticas para escribir pruebas unitarias.



## Desarrollo

### Como seleccionar casos de prueba
Generar casos de prueba efectivos que revelen la presencia de
fallas es fundamental para el éxito del proceso de pruebas (etapa
de preparación).
Idealmente, se debería determinar un conjunto de casos de
prueba tales que su ejecución exitosa implique que no hay errores
en el software desarrollado
Comúnmente este objetivo ideal no se puede lograr debido a las
limitaciones prácticas y teóricas.
Cada caso de prueba cuesta dinero: esfuerzo para generarlo,
tiempo de cómputo para ejecutarlo, esfuerzo para evaluar los
resultados
Por lo tanto, el número de casos de prueba necesarios para
detectar los errores debe ser minimizado para reducir costos
Los dos objetivos principales del proceso de pruebas:
- Maximizar el número de errores detectados (cobertura)
- Reducir al mínimo el número de casos de prueba (costo)
Como con frecuencia son contradictorios, el problema de
seleccionar el conjunto de casos de prueba con el que un
programa debe ser probado se vuelve una tarea muy compleja

Una estrategia simple que podemos seguir es elegir casos de prueba
de alguno de los siguientes grupos

- Casos extremos (edge cases)
- Caso representativo de un grupo

Tambien podemos aplicar las siguientes tecnicas de integración

- Big bang, combinar todos los componentes y probar el sistema
como un todo
- Integración incremental, los componentes se integran y prueban
poco a poco
  - Integración descendente (componentes de funcionales)
  - Integración ascendente (componentes de infraestructura, e.g. acceso
a BD)

