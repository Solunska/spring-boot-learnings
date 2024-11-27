# REST CRUD Employees

This module focuses on building a REST API for managing employee data. It emphasizes best practices in REST API design, implementing data access layers, service layers, and CRUD operations using Spring Data JPA and Spring Data REST.
## Key Topics Covered

### 1. REST API Design Best Practices
- Followed RESTful conventions for designing resource-oriented APIs.
- Utilized meaningful HTTP methods and status codes to enhance API usability.
---

### 2. REST DAO
- Built a Data Access Object (DAO) layer for employee data.
- Implemented CRUD operations (`add`, `update`, `delete`, `get`) in the DAO.

**Commit Link**: [DAO Add, Update, Delete](https://github.com/Solunska/spring-boot-learnings/tree/196a267f9c2c340c132844b341a90517abc45558)

---
### 3. Service Layer
- Added business logic for managing employee data in the service layer.
- Connected the service layer with the DAO for streamlined operations.

**Commit Link**: [Service Add, Update, Delete](https://github.com/Solunska/spring-boot-learnings/tree/f32d51386a6182764f702b95373501a896310b0d)

---
### 4. CRUD Operations
- Implemented endpoints for creating, reading, updating, and deleting employee records.
- Supported fetching individual employee records via RESTful endpoints.

**Commit Link**: [CRUD Operations](https://github.com/Solunska/spring-boot-learnings/tree/7323ee2466b26e05ad903f334dec26926af006cf)

---
### 5. Using Spring Data JPA
- Leveraged Spring Data JPA to simplify DAO operations and reduce boilerplate code.
- Configured repository interfaces for data persistence.

**Commit Link**: [Spring Data JPA Integration](https://github.com/Solunska/spring-boot-learnings/tree/debbb330eb85190fae2f8f1ba74686f7d482207e)

---
### 6. Using Spring Data REST
- Automated the creation of REST endpoints using Spring Data REST.
- Customized RESTful behavior for specific entities.

**Commit Link**: [Spring Data REST Implementation](https://github.com/Solunska/spring-boot-learnings/tree/d647e6e854c4fe9c3b67bb946515e9409e1d4855)

---
### 7. Spring Data REST Configurations and Sorting
- Configured Spring Data REST for sorting and pagination.

**Commit Link**: [Spring Data REST Configurations and Sorting](https://github.com/Solunska/spring-boot-learnings/tree/fa9b116c02314ef7a122db6828f0aa4b4b1a88ba)