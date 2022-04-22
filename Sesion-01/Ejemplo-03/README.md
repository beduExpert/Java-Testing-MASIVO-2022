# Ejemplo #3 - Repositorio en GitHub

## :dart: Objetivo

* Integrar código con Github para control de versiones

## ⚙ Requisitos

- IntelliJ IDEA
- Java
- Gradle
- JUnit
- Code with me
- Una cuenta de GitHub


## Desarrollo

Para crear un repositorio en GitHub lo primero es ir al botón Nuevo  (en la esquina superior derecha) y seleccionar la opción New repository. 

![1](https://user-images.githubusercontent.com/22419786/164800097-63b05fd4-d93f-4853-a32d-06f9951b9d33.png)

Esto lleva a un formulario donde es necesario indicar las siguientes opciones:

- **Nombre del repositorio** (Repository name): es el nombre con el que será mostrado el repositorio.
- **Descripción (Description):** aquí puedes incluir una breve descripción acerca de tu proyecto. Este campo es opcional.
- **Tipo de repositorio:** el repositorio que estás creando puede ser público o privado. Un repositorio público puede ser visto por todo el mundo, por el contrario, un repositorio privado solo podrá ser visto por ti y las personas que elijas.
Adicionalmente, es posible crear algunos archivos con el repositorio, pero no es obligatorio. Sin embargo, es una buena idea agregar a nuestros proyectos un archivo README. En este archivo puedes escribir la descripción detallada de tu proyecto que será mostrada a otros usuarios al acceder a tu repositorio.

![2](https://user-images.githubusercontent.com/22419786/164800100-452d77bb-84ab-47d1-a2c4-a0b4e9ab23bf.png)
![3](https://user-images.githubusercontent.com/22419786/164800105-efca6967-13d3-4fe9-93c1-6bce2fb52b0d.png)

Una vez completes el formulario tienes que hacer clic en el botón Create repository. Esto crea el repositorio y te envía a su página principal, donde puedes seguir configurando otros aspectos relativos a tu repositorio.

![4](https://user-images.githubusercontent.com/22419786/164800139-5a3ed27c-7279-4c46-9158-713fa27857c8.png)

### Tutorial para subir un código a GitHub paso a paso y actualizar el código.

Ya tienes creado tu primer repositorio en GitHub. Ahora veras cómo se gestiona desde el ordenador utilizando Git.

#### Paso 0: Configurar Git

Antes de comenzar a utilizar Git para gestionar tus proyectos de GitHub desde tu ordenador es necesario configurarlo. Esto se realiza solo una ves, ya que las configuraciones se mantienen ante actualizaciones y son comunes para varios proyectos.

Para establecer las configuraciones, Git cuenta con una herramienta llamada git config.

A continuación, veras cómo usarla:

Lo primero que debes hacer cuando instales Git es establecer tu nombre de usuario y dirección de correo electrónico. Esto es importante, ya que Git utiliza estos datos cuando realizas operaciones sobre un repositorio.

Para establecer el nombre de usuario y la dirección de correo se utilizan los siguientes comandos.

![5](https://user-images.githubusercontent.com/22419786/164800163-3c5450cd-92ef-479e-8fb6-d404d70a2e29.PNG)
 
Por supuesto, en la primera línea iría tu nombre entre comillas, y en la segunda tu correo.

La opción —global le indica a Git que tiene que utilizar esta configuración para todo lo que hagas en el sistema. En caso de que quieras utilizar una identidad diferente para un proyecto en particular puedes ejecutar estos comandos desde la carpeta del proyecto sin la opción –global. 

Para especificar el editor a utilizar puedes usar el siguiente comando.

![6](https://user-images.githubusercontent.com/22419786/164800171-ce5abc30-96d0-413d-9e7c-dcdab537a91c.PNG)

Donde [editor] es el editor a utilizar.

Por ejemplo, si se desea utilizar el editor vim, lo puedes indicar mediante la siguiente instrucción:

![7](https://user-images.githubusercontent.com/22419786/164800178-16265efb-7012-4865-b154-b8c4ace787d7.PNG)

Si quieres comprobar la configuración puedes emplear el comando git config –list para mostrar todas las propiedades establecidas.

![8](https://user-images.githubusercontent.com/22419786/164800189-c07e1ae9-5e59-469e-879c-eeaf49b4e923.png)

#### Paso 1: Obteniendo un Repositorio de Git

Existen dos maneras de obtener un repositorio en Git. La primera es tomar un proyecto o carpeta existente y crear el repositorio a partir de aquí. La segunda es clonar un repositorio existente en Git desde otro servidor, como puede ser GitHub o GitLab.

**Inicializando un repositorio en una carpeta existente**

Si planeas comenzar a gestionar un proyecto con Git debes ir al directorio del proyecto y ejecutar el siguiente comando:

![9](https://user-images.githubusercontent.com/22419786/164800209-ba9e0aab-5cf8-4a2c-a4a4-b0245c25e1ae.PNG)

Esto crea una sub-carpeta llamada .git, la cual contiene la base de datos y los archivos necesarios para que Git sea capaz de gestionar tu proyecto.

**Clonando un repositorio existente**

Si deseas obtener una copia de un repositorio Git existente en un servidor remoto debes utilizar el comando git clone. Lo puedes utilizar para descargar un repositorio en el que desees contribuir o para comenzar a trabajar en un repositorio recién creado en GitHub.

Este comando crea una copia local del repositorio remoto, por lo tanto tendrás acceso a todo el historial de versiones de todos los archivos del proyecto.

La estructura del comando sería la siguiente:

![10](https://user-images.githubusercontent.com/22419786/164800219-8e5c1beb-3194-4c55-9015-58efd39a6b5e.PNG)

Donde [url] es la dirección del repositorio en el servidor remoto.

Por ejemplo, para clonar el repositorio de Adafruit para sensores DHT se utilizaría el siguiente comando:

![11](https://user-images.githubusercontent.com/22419786/164800231-df47ea1e-853f-406f-8a24-bc7dd935f111.PNG)

En la siguiente figura puedes ver el resultado obtenido en la consola. 

![12](https://user-images.githubusercontent.com/22419786/164800251-218c0aab-e747-4a3b-a0b4-b95ea1dfbbf8.png)

Esto creará una carpeta llamada DHT-sensor-library dentro de la cual se almacenará una copia del proyecto remoto.

![13](https://user-images.githubusercontent.com/22419786/164800257-b5143fa6-9fbf-4936-9a12-8299fd95d6cf.png)

Como puedes apreciar, la carpeta contiene un directorio .git (donde está la base de datos del repositorio) y el área de trabajo con los archivos de la última versión del proyecto.

*Importante: el área de trabajo de un repositorio es la propia carpeta donde se almacena el proyecto, sin incluir el directorio .git*

De forma similar puedes clonar el repositorio que creaste en GitHub anteriormente, mediante el comando:

![image](https://user-images.githubusercontent.com/22419786/164799093-2eee24b9-455a-442e-8ffd-f3ed033c6bed.png)
 
En este caso la carpeta se llamará programarfacil-github. Puedes utilizar el comando cd de la consola para entrar al directorio.

En la siguiente imagen puedes ver el resultado final.

![image](https://user-images.githubusercontent.com/22419786/164799145-c994ab23-fed0-446c-95ca-73ae0deac5b5.png)

Ya tienes un repositorio Git local con una copia de trabajo de los archivos del proyecto. Ahora solo queda realizar cambios en los archivos y confirmarlos para que Git almacene las instantáneas con dichos cambios.

#### Paso 2: Revisar el estado de archivos

Los archivos en Git pueden o no estar bajo seguimiento. Los archivos bajo seguimiento o rastreados (en inglés tracked) son aquellos que estaban en la última instantánea del proyecto. Los archivos sin seguimiento o sin rastrear (en inglés untracked) son todos los otros, es decir, cualquier archivo nuevo que se agregue al directorio de trabajo.

Anteriormente has visto que los archivos rastreados pueden tener tres estados: sin modificar, modificados o preparados. Por ejemplo, cuando clonas un repositorio todos los archivos están rastreados y sin modificar. Al editar algunos archivos estos pasan al estado de modificado. Cuando termines las modificaciones tienes que poner los archivos en modo preparado para confirmar los cambios.

En la siguiente imagen puedes ver el ciclo de vida del estado de los archivos.

![image](https://user-images.githubusercontent.com/22419786/164799228-d4fd668a-fb4f-4c01-aba6-e0b0ec321709.png)

Para determinar en qué estado se encuentran los archivos de tu proyecto debes ejecutar el comando git status. Si ejecutas este comando en un repositorio recién clonado obtendrás un resultado similar al de la siguiente imagen.

![image](https://user-images.githubusercontent.com/22419786/164799258-c8f6e36b-22da-4031-afae-818147b4d2d1.png)

Esto significa que no hay archivos modificados y tampoco sin rastrear. Esto es perfectamente lógico en un repositorio recién clonado en el que no se ha modificado nada.

También indica en qué rama te encuentras y el estado de esa rama con respecto a la existente en el servidor remoto. Como aún no has realizado modificaciones, muestra que está actualizada.

#### Paso 3: Rastrear archivos nuevos
Ahora vas a agregar un nuevo archivo de texto plano llamado “hola_github.txt” a tu proyecto. La carpeta del proyecto ahora luce como esta imagen.

![image](https://user-images.githubusercontent.com/22419786/164799299-d0add4c4-9607-4ff5-a348-1a6a3c990b4d.png)

Si ejecutas ahora el comando git status obtendrás el siguiente resultado:

![image](https://user-images.githubusercontent.com/22419786/164799318-55db12e0-addd-411d-a8b8-b24f10fd7a75.png)

Como puedes ver, el archivo hola_github.txt aparece bajo la cabecera “Archivos sin seguimiento” (en inglés Untracked files). Bajo esta cabecera solo aparecen archivos nuevos y Git no los incluirá en el próximo commit a no ser que se le indique expresamente.

Para que Git comience a rastrear un nuevo archivo es necesario utilizar el comando git add. Por ejemplo, ejecutando el siguiente comando se comenzará a rastrear el archivo hola_github.txt

![image](https://user-images.githubusercontent.com/22419786/164799352-a92e9f32-b7f2-49ca-9cd4-e316e5740c66.png)

Si vuelves a revisar el estado de los archivos. Puedes ver que ahora el archivo hola_github.txt está siendo rastreado y está listo para ser confirmado en el próximo commit.

![image](https://user-images.githubusercontent.com/22419786/164799391-88c54a24-37f8-430b-8126-ed65fd4088b6.png)

#### Paso 4: Preparar archivos modificados

Ahora vas a editar un archivo que esté siendo rastreado, en este caso el archivo README.md. Puedes utilizar cualquier editor de texto plano para modificarlo. En mi caso he utilizado gedit y he añadido una línea de texto al final del archivo.

![image](https://user-images.githubusercontent.com/22419786/164799433-48680e47-7739-48cc-b302-9a77461cb506.png)

Ejecutando la instrucción git status se obtiene el siguiente resultado:

![image](https://user-images.githubusercontent.com/22419786/164799449-bf4f4027-130f-4faa-829b-75e07c25d3e2.png)

Como puedes apreciar, el archivo README.md aparece en la sección “Cambios no rastreados para el commit” (en inglés, Changes not staged for commit). Eso significa que es un archivo rastreado que ha sido modificado, pero aún no está preparado. Para ello, es necesario utilizar el comando git add. Si después ejecutas git status el resultado sería:

![image](https://user-images.githubusercontent.com/22419786/164799473-92976121-214e-40b2-86a3-7ccfd6342943.png)

Esto indica que ambos archivos están preparados y formarán parte de tu próxima confirmación (commit).

git add es un comando que cumple varios propósitos. Es preferible pensar en él como un comando para “añadir este contenido a la próxima confirmación” más que para “añadir este archivo al proyecto”.

#### Paso 5: Confirmar cambios
Una vez tienes el área de preparación con los archivos que quieres, puedes confirmar los cambios. Para esto es necesario ejecutar el comando:

![image](https://user-images.githubusercontent.com/22419786/164799590-3936c545-59b9-446e-9877-cd126e33286d.png)
 
Este comando ejecutará el editor seleccionado en la configuración inicial.

![image](https://user-images.githubusercontent.com/22419786/164799612-2a66d185-bc46-49ba-b0ae-43bbad32b626.png)

El texto muestra algunas instrucciones de cómo proceder, la salida de la última ejecución del comando git status y una línea en blanco encima. En esa línea en blanco debes comenzar a escribir un mensaje que describa la confirmación que estás realizando.

![image](https://user-images.githubusercontent.com/22419786/164799650-210f43f3-c353-4716-9013-999fb178164c.png)

Una vez escribas el mensaje, lo guardes y cierres el editor, los cambios serán confirmados.

![image](https://user-images.githubusercontent.com/22419786/164799705-5d47e023-2340-41a4-88db-82e8a867bcb4.png)

Con esto ya has creado el commit y puedes ver cómo la salida generada por el comando git commit muestra la rama en la que se ha realizado, así como otras estadísticas.

Como ejercicio práctico te propongo que agregues nuevos archivos, modifiques los existentes y realices varias confirmaciones (commits).

#### Paso 6: Actualizar el repositorio remoto
Al iniciar este tutorial has clonado un repositorio de GitHub ya creado. Sin embargo, hasta ahora todos los cambios que te he comentado han sido locales. Es decir, que todas las modificaciones están en tu ordenador. De hecho, si ejecutas el comando git status obtendrás una salida que indica que tu rama está adelantada a la de origin por varios commits.

![image](https://user-images.githubusercontent.com/22419786/164799767-ffddaff8-cb87-4d88-8f3a-bfbe04cbc19b.png)

*El término origin lo utiliza Git para referirse al servidor remoto del que has clonado tu repositorio.*

El comando para enviar todos los cambios locales a un servidor remoto es git push, su estructura sería:

![image](https://user-images.githubusercontent.com/22419786/164799828-8c29444b-e4cb-42d6-8946-420c3d7310ec.png)

Donde:

[nombre-remoto]: es el servidor a actualizar.
[nombre-rama]: es la rama a actualizar.

Para el nombre del servidor puedes utilizar directamente la URL o el término origin. Por lo tanto, puedes utilizar cualquiera de estos comandos:

![image](https://user-images.githubusercontent.com/22419786/164799902-e433d5c6-923b-4893-b900-dee3a12844dd.png)

Al ejecutar el comando Git te pedirá que indiques el nombre de usuario y la contraseña para acceder al servidor remoto. Esos datos corresponden a los que utilizaste para crear tu cuenta de GitHub.  

El resultado obtenido sería el siguiente:

![image](https://user-images.githubusercontent.com/22419786/164799944-7d8cc307-11e9-4c6f-9fd2-18fc8b3a0740.png)

Si ahora vas al navegador y abres el repositorio podrás ver los cambios efectuados en el repositorio remoto.

![image](https://user-images.githubusercontent.com/22419786/164799965-d11bf821-63b7-4241-bc0a-823f99861c07.png)

Ahora ya solo queda repetir los pasos del 2 al 6, en dependencia del curso que vaya tomando tu proyecto. Ten en cuenta que no es necesario seguir el orden esquemáticamente. 

En la siguiente imagen puedes ver el proceso para agregar un sketch de Arduino al repositorio. Por supuesto, primero es necesario copiar el sketch a la carpeta del proyecto.

![image](https://user-images.githubusercontent.com/22419786/164800009-979978dc-fd1e-4a11-8a81-b6b6a3780af5.png)

La vista del repositorio actualizado sería la siguiente:

![image](https://user-images.githubusercontent.com/22419786/164800027-a5e9c582-2707-4ed0-a1dc-3ca69e24767d.png)

