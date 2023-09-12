
<h1>Backend de proyecto final (Página web SPA construida con Angular)</h1>
<p>Este repositorio contiene el código fuente del backend de la página web desarrollada con Angular. 
  El backend está construido utilizando el lenguaje Java y el framework Spring Boot. 
  Proporciona las funcionalidades necesarias para el sistema de autenticación, autorización, 
  creación de usuarios y un conjunto de APIs para realizar operaciones CRUD.</p>

<h2>Características clave</h2>
Autenticación basada en JSON Web Token (JWT): El backend implementa autenticación y autorización mediante JWT. 
Los usuarios deben iniciar sesión para acceder a las funcionalidades protegidas.

Filtros de Tokens: Se ha implementado un filtro de tokens para verificar la validez de los JWT en cada solicitud protegida. 
Esto garantiza que solo los usuarios autenticados puedan acceder a recursos autorizados.

Creación de Usuarios: El backend permite la creación de usuarios, tanto como administradores como usuarios regulares. 
Los administradores tienen privilegios adicionales, como la gestión de otros usuarios.

Operaciones CRUD: Se han implementado APIs con protocolos HTTP para realizar operaciones CRUD (Crear, Leer, Actualizar, Borrar) 
en recursos específicos. Estas APIs se pueden utilizar para gestionar datos relacionados con la aplicación.

Administrar Usuarios: Utiliza las API de creación de usuarios para crear administradores y usuarios regulares según sea necesario. 
Consulta la documentación para obtener detalles sobre cómo utilizar estas API.

<h2>Configuración y Uso</h2>
Requisitos previos:

Asegúrate de tener Java y Spring Boot instalados en tu sistema.
Configura una base de datos compatible (por ejemplo, MySQL, PostgreSQL) y actualiza la configuración en application.properties o application.yml.
Configura las claves secretas y otras opciones de seguridad en el archivo de configuración correspondiente.

Clonar el Repositorio


Ejecutar la Aplicación:


cd backend-angular./mvnw spring-boot:run
Documentación de API:
Puedes encontrar la documentación de la API en URL de la documentación de API una vez que la aplicación esté en funcionamiento.


Implementar el Frontend (Angular):
Este backend está diseñado para funcionar con un frontend Angular. Asegúrate de configurar y ejecutar el frontend Angular y ajustar las URL de conexión en consecuencia.
