# Ejemplo 4 - Security test con ZAP

## :dart: Objetivos

- Analizar los 10 riesgos de seguridad más frecuentes en aplicaciones web (OWASP Top Ten)


## ⚙ Requisitos

- IntelliJ IDEA
- Java
- Gradle
- ZAP

## Desarrollo

### Aplicación de pruebas de penetración y seguridad web con ZAP

Hoy en día, la seguridad de las aplicaciones debe estar en el centro de las preocupaciones de las empresas. De hecho,
tan pronto como una aplicación web (o sitio web) se expone públicamente en Internet, es candidata a un ataque por parte
de personas malintencionadas. Además, es importante tener en cuenta que la seguridad de la aplicación es aún más
importante si se utiliza para almacenar datos confidenciales como cuentas bancarias o su información personal.

Para abordar este problema, OWASP (abreviatura de Open Web Application Security
Project, https://www.owasp.org/index.php/Main_Page) es una organización mundial que estudia los problemas de seguridad
de las aplicaciones. El objetivo de esta organización es destacar públicamente los problemas de seguridad y las
vulnerabilidades que se pueden encontrar en un sistema de aplicación. Además de esta valiosa información de seguridad,
OWASP proporciona recomendaciones, soluciones y herramientas para probar y proteger aplicaciones.

Uno de los proyectos y documentos importantes y útiles proporcionados por OWASP son los 10 principales problemas de
seguridad de las aplicaciones. Este documento está disponible
en https://www.owasp.org/images/7/72/OWASP_Top_10-2017_%28en%29.pdf.pdf. Es muy detallado, con una explicación, ejemplos
y una solución para cada problema de seguridad. En este documento, encontramos que la principal vulnerabilidad de
seguridad a la que las aplicaciones son más vulnerables es la vulnerabilidad de inyección, como la inyección SQL, que
consiste en inyectar código o solicitudes en una aplicación para recopilar, eliminar o corromper datos de la aplicación.

También tenemos en este documento otra falla de seguridad conocida, que es Cross-Site Scripting (XSS), que consiste en
ejecutar código HTML o JavaScript malicioso en el navegador web de un usuario.

El desafío para las empresas es poder automatizar las pruebas de seguridad de sus aplicaciones para protegerlas y tomar
medidas lo más rápido posible cuando se descubre una falla.

Hay muchas herramientas de prueba de seguridad y penetración disponibles. Una lista muy completa está disponible
en https://www.owasp.org/index.php/Appendix_A:_Testing_Tools. Entre ellos, aprendimos sobre SonarQube en el capítulo
anterior, que permite el análisis de código para detectar vulnerabilidades de seguridad.

Otra herramienta en esta lista que es muy interesante es ZAP (abreviatura de Zed Attack
Proxy, https://www.owasp.org/index.php/OWASP_Zed_Attack_Proxy_Project), que fue desarrollada por la comunidad OWASP.

Veamos cómo usar ZAP para realizar pruebas de seguridad en nuestras aplicaciones.

### Uso de ZAP para pruebas de seguridad

ZAP es una herramienta gráfica, gratuita y de código abierto que permite escanear sitios web y realizar una multitud de
pruebas de seguridad y penetración.

A diferencia de SonarQube, que también realiza análisis de seguridad, ZAP ejecuta la aplicación y realiza pruebas de
seguridad. Si bien SonarQube realiza un análisis de seguridad en el código fuente de la aplicación, no lo ejecuta.

Cuando se ejecuta, ZAP actuará como un proxy entre el usuario y la aplicación al escanear todas las URL de la aplicación
y luego realizar una serie de pruebas de penetración en estas diferentes URL. Actualmente es una de las herramientas más
utilizadas en las pruebas de aplicaciones porque, además de ser gratuita, proporciona muchas características muy
interesantes, como la capacidad de configurar pruebas de penetración Ajax, y también configuraciones de prueba
avanzadas. Además, se integra muy bien con muchas plataformas de pipeline CI / CD, y finalmente, es posible controlarlo
usando API REST, cuya documentación se encuentra en https://github.com/zaproxy/zaproxy/wiki/ApiDetails.

Un requisito previo para usar ZAP es tener Java instalado en la máquina que realizará las pruebas. Puede ser una máquina
local o un agente de compilación.

Podemos descargar ZAP en https://github.com/zaproxy/zaproxy/wiki/Downloads; descarga el paquete correspondiente a tu
sistema operativo.

Luego, instala ZAP siguiendo los procedimientos de instalación del software de tu SO y, una vez finalizada la
instalación, podemos abrir ZAP y acceder a su interfaz.

Esta captura de pantalla muestra la interfaz ZAP predeterminada:

![img.png](img.png)

Haremos nuestro primer análisis de seguridad con ZAP siguiendo estos pasos:

    En el panel de la derecha, da clic en el botón Escaneo Automático, que abre un formulario en el que ingresamos la URL a escanear.
    En el campo URL para atacar, ingresa la URL del sitio web a analizar. En nuestro ejemplo, ingresamos la URL de un sitio de demostración: http://demo.guru99.com/Security/SEC_V1/
    Luego, para iniciar el análisis, hacemos clic en el botón Atacar.

La siguiente captura de pantalla muestra los pasos anteriores visualmente:

![img_1.png](img_1.png)

Esperamos que se complete el análisis de la prueba de seguridad de este sitio web.

    Tan pronto como se completa el análisis, podemos ver el resultado de los problemas de seguridad encontrados en el panel de la parte inferior izquierda.
    Por último, hacer clic en una de las alertas muestra los detalles del problema y nos ayuda a solucionarlo.

La siguiente pantalla muestra la visualización de los resultados del análisis que acabamos de detallar:

![img_2.png](img_2.png)

Acabamos de ver cómo utilizar ZAP, que es una herramienta gráfica que se utiliza para analizar las vulnerabilidades de
seguridad de un sitio web muy rápidamente.
