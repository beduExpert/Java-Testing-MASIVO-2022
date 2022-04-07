# Ejemplo 2 - Las 4 métricas clave

## :dart: Objetivos

- Definir el concepto de calidad en software
- Diferenciar entre testing y calidad
- Utilizar herramienta y métricas que ayuden a definir la calidad

## Desarrollo

Las cuatro métricas clave

Profundicemos un poco más en las cuatro métricas que el equipo de DORA ha identificado como esenciales para el éxito de
DevOps de una organización. 

### Frecuencia de implementación

La frecuencia de implementación se refiere a la cadencia de los lanzamientos exitosos de una organización a
producción. Los equipos definen el éxito de manera diferente, por lo que la frecuencia de implementación puede medir una
variedad de cosas, como la frecuencia con la que se implementa el código en producción o la frecuencia con la que se
publica para los usuarios finales. Independientemente de lo que mida esta métrica equipo por equipo, los equipos de
élite apuntan a una implementación continua, con múltiples despliegues por día. 

### Plazo medio de entrega de cambios

El tiempo medio de espera para los cambios mide el tiempo que tarda un commit en entrar en producción. Ayuda a los
líderes de ingeniería y DevOps a comprender qué tan saludable es el ciclo de release de sus equipos y si podrían manejar
una afluencia repentina de solicitudes. Al igual que la frecuencia de implementación, esta métrica proporciona una forma
de establecer el ritmo de entrega de software en una organización: su velocidad. 

### Tiempo medio para recuperarse

¿Cuánto tiempo le toma a un equipo restaurar el servicio en caso de una interrupción no planificada u otro incidente?
Este punto de datos es el tiempo medio del equipo para recuperarse. Es fundamental poder restaurar el servicio lo más
rápido posible (con un tiempo medio de recuperación bajo). Los equipos de élite mejoran esta métrica con la ayuda de un
monitoreo sólido y la implementación de prácticas de entrega progresiva. 

### Tasa de fallas en cambios

La tasa de fallas en cambios de un equipo se refiere a la frecuencia con la que sus cambios conducen a fallas en
producción. Rollbacks, las implementaciones fallidas y los incidentes con soluciones rápidas, independientemente
de la causa raíz, cuentan para la tasa de fallas en cambios. Al igual que el tiempo medio para recuperarse, esta métrica
ayuda a medir la estabilidad. ¿Cuánto tiempo del desarrollador se dedica a tareas que no contribuyen al valor
empresarial? Comprender la tasa de fallas en cambios ayuda a los líderes a decidir dónde invertir en infraestructura
para respaldar a los equipos de desarrollo.