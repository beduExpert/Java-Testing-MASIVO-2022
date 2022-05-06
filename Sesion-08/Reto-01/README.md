# Reto 1 - Ejecutar SonarQube en tu proyecto

## :dart: Objetivos

- Identificar criterios de calidad en el software
- Analizar los criterios de análisis estático del código
- Ejecutar un análisis estático con SonarQube


## ⚙ Requisitos

- IntelliJ IDEA
- Java
- Gradle
- SonarQube
- Docker

>**¡Nota para experto(a)!**
>
> A lo largo de este curso los alumnos estarán trabajando en equipos de dos integrantes, por ello como primera actividad el experto definirá las parejas, en caso de ser un grupo con un número impar podría haber equipos de tres personas.

> Los retos buscan emular un entorno real de trabajo, en los mismos habrá descripciones vagas de los requerimientos y el experto fungirá como stakeholder para clarificar dudas o añadir detalles a los requerimientos.


## Desarrollo

Ahora es tu turno de ejecutar el análisis con SonarQube en tu código.

- Ejecuta el siguiente comando para levantar la instancia de SonarQube
  `docker run -d --name sonarqube -e SONAR_ES_BOOTSTRAP_CHECKS_DISABLE=true -p 9000:9000 sonarqube:latest`
- Sigue los pasos listados en el ejemplo anterior.
- Modifica tu archivo gradle para que contenga SonarQube como plugin
- Ejecuta el siguiente comando
  `./gradlew sonarqube -Dsonar.projectKey=java-testing -Dsonar.host.url=http://localhost:9000   -Dsonar.login=TU_TOKEN`
- Elige algunos de los Bugs o Code Smells y corrígelos.

