# Spring Boot Course

This repository is part of a comprehensive Spring Boot course aimed at building foundational knowledge in Spring Boot and related technologies. The course is structured into modules, each focusing on specific concepts and their practical implementation. By the end of the course, I will have developed complete real-time projects, including a Spring Boot REST API with full CRUD functionality and a Spring Boot MVC application leveraging Hibernate/JPA.
### **Course Description**
The course covers the following concepts:
- Spring Boot Core
- Spring Boot MVC
- Spring Boot Security
- Spring Boot REST API
- Spring Data JPA
- Spring Data REST
- Thymeleaf
- AOP
- Hibernate/JPA

---

## Modules Overview

### **Module 1: Spring Boot Overview**
This module introduces the fundamental features of Spring Boot, including tools that enhance the development process and application management.

[Link to Module Folder](https://github.com/Solunska/spring-boot-learnings/tree/master/01.%20Spring%20Boot%20Overview)

**Key Topics Covered:**
1. Spring Boot DevTools and Actuator  
   Learned how to enable automatic restarts, live reloads, and use Actuator for application monitoring and management.

2. Spring Security  
   Implemented authentication and authorization mechanisms for robust application security.

3. Injecting Custom Application Properties  
   Utilized the `application.properties` file for defining and injecting custom properties.

4. Configuring the Spring Boot Server  
   Customized server ports, context paths, and other server configurations.

---

### **Module 2: Spring Core**
This module delves into the core functionalities of the Spring Framework, focusing on dependency injection and Spring bean management.

[Link to Module Folder](https://github.com/Solunska/spring-boot-learnings/tree/master/02.%20Spring%20Core)

**Key Topics Covered:**
1. Dependency Injection Using Constructor Injection  
   Implemented constructor injection to enforce immutability and ensure all dependencies are provided during object creation.

2. Injecting Specific Bean Using `@Qualifier`  
   Resolved ambiguity when multiple beans of the same type exist.

3. Using the `@Primary` Annotation  
   Designated a default bean to be injected when multiple candidates are available.

4. Lazy Initialization  
   Optimized resource usage by creating beans only when needed.

5. Bean Scopes  
   Defined the lifecycle and visibility of beans using scopes such as `singleton` and `prototype`.

6. Bean Lifecycle Methods  
   Used hooks like `@PostConstruct` and `@PreDestroy` to manage bean initialization and destruction.

7. Java Bean Configuration  
   Defined beans using Java-based configuration with `@Configuration` and `@Bean`.

---

This repository will continue to grow as I complete additional modules from the course. Explore the individual module folders for detailed documentation and code examples.
