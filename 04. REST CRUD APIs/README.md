# REST CRUD APIs

This module introduces the core concepts of building RESTful web services using Spring Boot. It covers REST service basics, HTTP operations, designing REST controllers, JSON data binding, handling exceptions, and implementing global exception handling. Below is an overview of the key topics along with links to specific commits.
## Key Topics Covered

### 1. What Are REST Services?
- Learned the principles of REST architecture and how it facilitates stateless communication over HTTP.
- Explored the fundamental HTTP methods (`GET`, `POST`, `PUT`, `DELETE`) for RESTful CRUD operations.
---

### 2. Spring Boot REST HTTP Basics
- Configured Spring Boot applications to serve REST endpoints.
- Understood how HTTP status codes and headers work in RESTful services.
---
### 3. REST Controllers
- Designed REST APIs using the `@RestController` annotation.
- Defined API endpoints for various CRUD operations.
---
### 4. JSON and Jackson Data Binding
- Utilized Jackson to serialize and deserialize JSON objects.
- Configured JSON responses for Spring Boot REST APIs.

**Commit Link**: [REST POJO Implementation](https://github.com/Solunska/spring-boot-learnings/tree/bc449a7a47f3f9a1b3216513ecc21a337e852d44f)

---
### 5. Path Variables
- Used `@PathVariable` to capture values from the URL path and inject them into controller methods.

**Commit Link**: [Path Variables](https://github.com/Solunska/spring-boot-learnings/tree/140334649f6da554232cbefd1307dd28e0f111f4)

---
### 6. Exception Handling
- Implemented exception handling for REST APIs using `@ExceptionHandler` to provide custom responses for errors.

**Commit Link**: [Exception Handling](https://github.com/Solunska/spring-boot-learnings/tree/f6a31ef1b65272de80321a528176350c94485e29)

---
### 7. Global Exception Handling
- Centralized exception handling with `@ControllerAdvice` to provide consistent error responses across the application.

**Commit Link**: [Global Exception Handling](https://github.com/Solunska/spring-boot-learnings/tree/3e4889c45e641d82352de12eabdbf7b3ab867cd7)