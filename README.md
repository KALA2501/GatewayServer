![Logo](https://github.com/FusionTech-2430/.github/blob/main/profile/Banner2.png?raw=true)

# All Connected API Gateway

Este proyecto es un API Gateway construido con **Spring Boot** y **Spring Cloud Gateway**. Su propósito es enrutar las solicitudes a varios microservicios dentro de una arquitectura de microservicios.

## Tecnologías Utilizadas 🛠️

- **Java**
- **Spring Boot**
- **Spring Cloud Gateway**
- **Eureka Discovery**
- **Maven**

## Variables de Entorno 🔒

Para ejecutar este proyecto, necesitarás agregar las siguientes variables de entorno a tu archivo .env

`EUREKA_URL`

## Configuración

El archivo `application.yml` contiene la configuración del API Gateway, incluyendo las rutas a los diferentes microservicios y la configuración de Eureka.

### Rutas Configuradas

El **API Gateway** enruta las solicitudes a los siguientes microservicios:

- **products-service**: `/api/v1/products`
- **orders-service**: `/api/v1/orders`
- **services-service**: `/api/v1/services`
- **contracts-service**: `/api/v1/contracts`
- **events-service**: `/api/v1/events`
- **participants-service**: `/api/v1/participants`
- **business-service**: `/api/v1/business`
- **subscriptions-service**: `/api/v1/subscriptions`
- **users-service**: `/api/v1/users`
- **organizations-service**: `/api/v1/organizations`
- **publications-service**: `/api/v1/publications`
- **notifications-service**: `/api/v1/notifications`

### Configuración de Eureka

El API Gateway está configurado para registrarse con un servidor Eureka. 

### Configuración del Servidor

El servidor está configurado para ejecutarse en el puerto `8080`.

## Ejecución del Proyecto 💻

Para ejecutar el proyecto, utiliza el siguiente comando de Maven:

```sh
mvn spring-boot:run
```

## Autor 🧑🏻‍💻

- [@alejandronoss1017](https://github.com/alejandronoss1017)