# Sesión 8: SonarQube

## :dart: Objetivos

- Identificar criterios de calidad en el software
- Analizar los criterios de análisis estático del código
- Ejecutar un análisis estático con SonarQube
- Analizar los 10 riesgos de seguridad más frecuentes en aplicaciones web (OWASP Top Ten)

## ⚙ Requisitos

- Editor de código
  - IntelliJ IDEA
- Programación colaborativa
  - Code with me
- Control de versiones.
  - Git
  - Tener una cuenta de GitHub
- Entorno de desarrollo de Java.
  - Java JDK 8+
  - Gradle 7+
- Frameworks de pruebas
  - Junit 5.7.x
- Otras herramientas
  - SonarQube
  - SonarLint
  - ZAP

## 📂 Contenido


### <ins>Introducción a SonarQube</ins>

SonarQube es una herramienta de código abierto de SonarSource (https://www.sonarsource.com/) que está escrita en Java.
Nos permite realizar análisis de código estático para verificar la calidad y seguridad del código de una aplicación.

SonarQube está diseñado para equipos de desarrolladores y les proporciona un panel e informes que se pueden personalizar para que puedan presentar la calidad del código en sus aplicaciones.

Permite el análisis de código estático en una multitud de lenguajes (más de 25), como PHP, Java, .NET, JavaScript, Python, etc. La lista completa se puede encontrar en https://www.sonarqube.org/features/multi-languages/. Además del análisis de código con problemas de seguridad, code smells y duplicación de código, SonarQube también proporciona cobertura de código para pruebas unitarias.

Finalmente, SonarQube se integra muy bien en los pipelines de CI / CD para que pueda automatizar el análisis de código durante los commits de código del desarrollador. Esto reduce el riesgo de implementar una aplicación que tiene vulnerabilidades de seguridad o una complejidad de código demasiado alta.

Ahora que hemos proporcionado una descripción general de SonarQube, veremos su arquitectura y componentes. Finalmente, veremos las diferentes formas de instalarlo.

En el siguiente ejemplo se muestra una descripción general de la arquitectura SonarQube [Ejemplo 01:  Introducción a SonarQube](./Ejemplo-01)


---

### <ins>Instalación de SonarQube</ins>

En el siguiente ejemplo y reto veremos como instalar SonarQube y ejecutarlo en el proyecto.

- [Ejemplo 02: Instalación de SonarQube](./Ejemplo-02)
    - [Reto 01: Ejecutar SonarQube en tu proyecto](./Reto-01)

---

### <ins>Análisis en tiempo real con SonarLint</ins>

#### Análisis en tiempo real con SonarLint

Los desarrolladores que utilizan SonarQube en un contexto de integración continua a menudo se enfrentan al problema de tener que esperar demasiado antes de obtener los resultados del análisis de SonarQube. Deben hacer commit de su código y esperar el final del proceso de integración continua antes de obtener los resultados del análisis del código.

Para abordar este problema y, por lo tanto, mejorar la vida diaria de los desarrolladores, SonarSource, el editor de SonarQube, proporciona otra herramienta, SonarLint, que permite el análisis de código en tiempo real.

SonarLint es una herramienta gratuita y de código abierto (https://www.sonarlint.org/) que se descarga de forma diferente según la herramienta de desarrollo y el lenguaje de desarrollo. SonarLint está disponible para Eclipse, IntelliJ, Visual Studio y los IDE de código de Visual Studio.

En este ejemplo veremos como realizar la instalació de SonarLint
- [Ejemplo 03: SonarLint](./Ejemplo-03)
    - [Reto 02: Ejecutar SonarLint en tu proyecto](./Reto-02)


---

### <ins>Security test con ZAP</ins>

#### Aplicación de pruebas de penetración y seguridad web con ZAP

Hoy en día, la seguridad de las aplicaciones debe estar en el centro de las preocupaciones de las empresas. De hecho, tan pronto como una aplicación web (o sitio web) se expone públicamente en Internet, es candidata a un ataque por parte de personas malintencionadas. Además, es importante tener en cuenta que la seguridad de la aplicación es aún más importante si se utiliza para almacenar datos confidenciales como cuentas bancarias o su información personal.

Para abordar este problema, OWASP (abreviatura de Open Web Application Security Project, https://www.owasp.org/index.php/Main_Page) es una organización mundial que estudia los problemas de seguridad de las aplicaciones. El objetivo de esta organización es destacar públicamente los problemas de seguridad y las vulnerabilidades que se pueden encontrar en un sistema de aplicación. Además de esta valiosa información de seguridad, OWASP proporciona recomendaciones, soluciones y herramientas para probar y proteger aplicaciones.

Uno de los proyectos y documentos importantes y útiles proporcionados por OWASP son los 10 principales problemas de seguridad de las aplicaciones. Este documento está disponible en https://www.owasp.org/images/7/72/OWASP_Top_10-2017_%28en%29.pdf.pdf. Es muy detallado, con una explicación, ejemplos y una solucón para cada problema de seguridad. En este documento, encontramos que la principal vulnerabilidad de seguridad a la que las aplicaciones son más vulnerables es la vulnerabilidad de inyección, como la inyección SQL, que consiste en inyectar código o solicitudes en una aplicación para recopilar, eliminar o corromper datos de la aplicación.

También tenemos en este documento otra falla de seguridad conocida, que es Cross-Site Scripting (XSS), que consiste en ejecutar código HTML o JavaScript malicioso en el navegador web de un usuario.

El desafío para las empresas es poder automatizar las pruebas de seguridad de sus aplicaciones para protegerlas y tomar medidas lo más rápido posible cuando se descubre una falla.

Hay muchas herramientas de prueba de seguridad y penetración disponibles. Una lista muy completa está disponible en https://www.owasp.org/index.php/Appendix_A:_Testing_Tools. Entre ellos, aprendimos sobre SonarQube en el capítulo anterior, que permite el análisis de código para detectar vulnerabilidades de seguridad.

Otra herramienta en esta lista que es muy interesante es ZAP (abreviatura de Zed Attack Proxy, https://www.owasp.org/index.php/OWASP_Zed_Attack_Proxy_Project), que fue desarrollada por la comunidad OWASP.

Veamos cómo usar ZAP para realizar pruebas de seguridad en nuestras aplicaciones [Ejemplo 04: Security test con ZAP](./Ejemplo-04)

---

### Postwork :memo:
- [Postwork](./Postwork)




 
