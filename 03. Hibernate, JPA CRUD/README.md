# Hibernate/JPA CRUD

This module provides a deep dive into Hibernate and JPA, focusing on CRUD (Create, Read, Update, Delete) operations using EntityManager for database interactions. Below is an overview of the key concepts covered, along with links to specific commits that demonstrate their implementation.
## Key Topics Covered

### 1. JPA Annotations
Explored commonly used JPA annotations such as `@Entity`, `@Id`, `@GeneratedValue`, `@Column`

- **Commit Link**: [JPA Annotations](https://github.com/Solunska/spring-boot-learnings/tree/f813c16ec86842b7b8e2e2736a04c41367b989bb)

---

### 2. Saving Objects
Used the `EntityManager.persist()` method to insert new records into the database.

- **Commit Link**: [Saving Objects](https://github.com/Solunska/spring-boot-learnings/tree/d38493602555cebd8290d797f1c347132eb85638)

---

### 3. Reading Objects
Fetched records using the `EntityManager.find()` method and JPQL queries with `TypedQuery`.

- **Commit Link**: [Reading Objects](https://github.com/Solunska/spring-boot-learnings/tree/8d03a72c4c72d1945174a4f0e3b0a27058f97ce3)

---

### 4. Querying Objects
Utilized JPQL to perform dynamic queries, including parameterized queries with `TypedQuery.setParameter()`.

- **Commit Link**: [Querying Objects](https://github.com/Solunska/spring-boot-learnings/tree/728eedb34759e24913126a53d7b153eea6a14339)

---

### 5. Updating Objects
Modified existing records using the `EntityManager.merge()` method to synchronize updates with the database.

- **Commit Link**: [Updating Objects](https://github.com/Solunska/spring-boot-learnings/tree/3c39b2f4e65b2d424aed0df6b60ba495f71d42d9)

---

### 6. Deleting Objects
Removed records using `EntityManager.remove()` after retrieving them with `find()`. Additionally, performed bulk deletions with JPQL `executeUpdate()`.

- **Commit Link**: [Deleting Objects](https://github.com/Solunska/spring-boot-learnings/tree/3efb05ea8d5a596fe8754666cd79ba990f99120b)

---

### 7. Creating Database Tables from Java Code
Configured database schema generation directly from Java entity classes using annotations. Used the spring.jpa.hibernate.ddl-auto=update property to automatically synchronize the database schema with the entity definitions during application startup.
- **Commit Link**: [Creating Database Tables](https://github.com/Solunska/spring-boot-learnings/tree/d7950c018420992178064e243bd70db09f32d002)
