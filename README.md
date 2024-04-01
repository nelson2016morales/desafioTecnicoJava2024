# desafioTecnicoJava2024

Instalación de la Aplicación
AMBIENTE: Se sugiere que la revisión del proyecto pueda realizarse en un entorno de desarrollo Local que debiera considerar los siguientes requisitos.

-Instalación de algún IDE que soporte Java Spring boot. Por ejemplo, para el desarrollo del proyecto se ha utilizado STS versión 4.190. -Verificar que la versión de Java sea compatible para STS o el ide que se desee usar. Para efectos de compatibilidad la versión usada en el entorno de este desarrollo es java version "11.0.19" 2023-04-18 LTS.

Importación del proyecto en el IDE
Tras validar que se cuenta con los requisitos anteriores, se debe importar el proyecto. Ejemplo del proceso realizado para importar desde el Ide STS:

Abrir opción “File”, del cuadro superior izquierdo. 
Elegir opción “Existing Maven Project”. 
Seleccionar botón “Browser” y navegar hasta la carpeta del proyecto descargado que ya ha sido descomprimido previamente en el paso inicial o que tal vez fue clonado como proyecto git según estimo conveniente la persona que realizó la acción. 
Ejecución de la Aplicación
El primer paso de la Ejecución, es la actualización de las dependencias del proyecto. Para dicha acción se debe realizar un maven update de la siguiente forma:

Click derecho sobre la carpeta del proyecto. 
Seleccionar opción desplegable “Maven”. 
Seleccionar “Update Project”. 
Correr la aplicación. Este paso se puede realizar de la siguiente forma:

Hacer click derecho sobre la clase CrudUsuariosApplication.java. 
Seleccionar opción “Run As".
Seleccionar Opción “Java Application”. 
Si el proceso se ha realizado sin problemas y en orden, se desplegará los mensajes correspondientes del inicio de Spring. Dicho proceso debe finalizar con los mensajes que se destacan a continuación:

Tomcat Started: Significa que se ha iniciado el servidor de nuestra aplicación correctamente. 
Started CrudUsuariosApplication: Lo cual significa que se ha deployado e iniciado correctamente nuestra Api Rest y que se puede iniciar las pruebas. 
Probando la Aplicación
El primer paso para probar la instalación, es instalar alguna herramienta que nos permita simular las peticiones de tipo Http que recibe nuestra aplicación Rest. En el caso de este desarrollo se ha utilizado la aplicación de escritorio Postman:

-> Prueba CRUD “Crear Usuario”  

	Se debe configurar una opción de consulta tipo Request Post en postman con los siguientes datos: 

	URL -> http://localhost:8080/crearUsuario 
	{
		"name": "Juan rodriguez",
		"email": "juan2@rodriguez.org",
		"password": "hunter1",
		"phones": [
			{
				"number": "1234567",
				"citycode": "1",
				"contrycode": 57
			}
		]
	}
	
 
	Información: 

		Se permite ingresar más de un teléfono para poder comprobar el correcto cumplimiento de la cardinalidad entre tablas. 
		
		El resultado de la ejecución permitirá evaluar los siguientes requerimientos: 

		Tipo de status Http adecuado. 
		Formato del endpoint. 
		Salida con campos indicados (id UUID, created, modified, last_login, token JWT, isactiveCreación de usuarios). 
		Creación de teléfono de usuarios. 
		Validación de formato de correos. 
		Validación con expresión regular en correo. 
		Validación de correos existente previamente en base de datos. 
		Formato de mensajes de error como respuesta. 
		
	*Se ha dejado una imagen con evidencia de la prueba en postman y su configuración y formato de json. La imagen se encuentra en el repositorio en nisum\evidencias postman

-> Prueba CRUD “Listar Usuarios” 

	Se debe configurar una opción de consulta tipo Request Get con los siguientes datos: 
	URL -> http://localhost:8080/traerUsuarios 
	
	*Se ha dejado una imagen con evidencia de la prueba en postman y su configuración y formato de json. La imagen se encuentra en el repositorio en nisum\evidencias postman

	
-> Prueba CRUD “Actualizar Usuarios” 

	Se debe configurar una opción de consulta tipo Request PUT : 

	URL -> http://localhost:8080/actualizarUsuario/[valor UUID]

	Información: 

		Se permite actualizar uno o más teléfonos de un usuario junto con sus datos. 
		El id para enviar en la url mantiene el formato UUID. 
		El resultado de la ejecución permitirá evaluar los siguientes requerimientos: 
		Tipo de status Http adecuado. 
		Cambios en los datos del usuario. 
		Cambios en los datos de los teléfonos del usuario. 
		Mensaje de error cuando un usuario no existe. 

	*Se ha dejado una imagen con evidencia de la prueba en postman y su configuración y formato de json. La imagen se encuentra en el repositorio en nisum\evidencias postman


->	Prueba CRUD “Delete Usuarios” 

	Se debe configurar una opción de consulta tipo Request DELETE como muestra la imagen de ejemplo: 

	URL -> http://localhost:8080/borrarUsuario/[valor UUID]

	El resultado de la ejecución permitirá evaluar los siguientes requerimientos: 
	Tipo de status Http adecuado. 
	Mensaje de error cuando un usuario no existe. 

	*Se ha dejado una imagen con evidencia de la prueba en postman y su configuración y formato de json. La imagen se encuentra en el repositorio en nisum\evidencias postman
Acceso a Base de datos en memoria U2
Para acceder a la base de datos y observar los comportamientos de las tablas, es posible acceder a la siguiente url: http://localhost:8080/h2-console/

Información:

Se debe recordar que, por requerimiento se trabaja con bases de datos en memoria, por lo tanto, las tablas y su información solo existirán cuando el proyecto esté en ejecución. No se adjunta script de base de datos debido a que no se necesitaría para probar el proyecto.
Usuario: 'sa'
Password: 'password'
Documentacion swapper
http://localhost:8080/swagger-ui/index.html
