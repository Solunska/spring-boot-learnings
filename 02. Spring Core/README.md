# Spring Core

This module focuses on the core features of the Spring Framework, particularly around dependency injection and Spring beans. Below, you will find an overview of the key concepts covered, along with links to specific commits that demonstrate their implementation.

## Key Topics Covered

### 1. Dependency Injection Using Constructor Injection
Constructor injection is the preferred way to implement dependency injection in Spring. It enforces immutability and ensures all dependencies are provided at the time of object creation.

- **Commit Link**: [Constructor Injection Implementation](https://github.com/Solunska/spring-boot-learnings/tree/0c9f32192f35a58c9a2d765786a83dc5ed508069)

---

### 2. Injecting Specific Bean Using `@Qualifier`
The `@Qualifier` annotation helps resolve ambiguity when multiple beans of the same type exist, ensuring that the correct bean is injected.

- **Commit Link**: [Using `@Qualifier`](https://github.com/Solunska/spring-boot-learnings/tree/d7c3926f53c0dd03425b63547209202a0cfdc045)

---

### 3. Using the `@Primary` Annotation
The `@Primary` annotation designates a default bean to be injected when multiple candidates are available.

- **Commit Link**: [Using `@Primary`](https://github.com/Solunska/spring-boot-learnings/tree/52761f799c102cd2b57b81ffa75050e3a0a868d6)

---

### 4. Lazy Initialization
Spring supports lazy initialization to optimize resource usage by creating beans only when they are needed.

- **Commit Link**: [Lazy Initialization](https://github.com/Solunska/spring-boot-learnings/tree/702eff8dd0e1a94fe07c95d41852ec54b9c4d38d)

---

### 5. Bean Scopes
Bean scopes define the lifecycle and visibility of beans within the application. Common scopes include `singleton`, `prototype`, `request`, and `session`.

- **Commit Link**: [Bean Scopes](https://github.com/Solunska/spring-boot-learnings/tree/371313be28d27605b3beda89d7ea3f5f63398945)

---

### 6. Bean Lifecycle Methods
Spring provides hooks such as `@PostConstruct` and `@PreDestroy` to manage bean initialization and destruction logic.

- **Commit Link**: [Bean Lifecycle Methods](https://github.com/Solunska/spring-boot-learnings/tree/19f8ae2126e1a017caadf75ff91a9580393787aa)

---

### 7. Java Bean Configuration
In addition to XML and annotations, Java-based configuration allows you to define beans using `@Configuration` and `@Bean`.

- **Commit Link**: [Java Bean Configuration](https://github.com/Solunska/spring-boot-learnings/tree/43278069fd5cda6ce848aefbb3b89c462f547271)
