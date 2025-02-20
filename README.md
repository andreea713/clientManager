# Client Manager

## Descripción  
Client Manager es una aplicación CRUD en Java desarrollada con Spring Boot para la gestión de clientes.
La API expone endpoints REST para gestionar clientes, permitiendo operaciones CRUD (Create, Read, Update , Delete).

## Tecnologías  
- Java 17+  
- Spring Boot  
- Spring Data JPA  
- Maven  
- Docker  

## Arquitectura  
El proyecto sigue una estructura modular:  
- **api**: Contiene la definición de la API y excepciones.  
- **dao**: Manejo directo de la base de datos.  
- **repositories**: Interfaces para la persistencia de datos con Spring Data JPA.  
- **rest**: Controladores REST para la comunicación con el cliente.  
- **srv (services)**: Lógica de servicios y utilidades.  
- **resources**: Configuraciones de la aplicación (`application.properties`) y Docker (`dockerfile.yml`).  
