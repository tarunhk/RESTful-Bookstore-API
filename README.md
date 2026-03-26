# 📚 Bookstore API

A RESTful backend application built using Spring Boot to manage books and authors. This project demonstrates CRUD operations, entity relationships, pagination, filtering, and API documentation using Swagger.

---

## 🚀 Features
- 📖 Manage Books and Authors (CRUD operations)
- 🔗 Entity Relationship (Many-to-One: Book → Author)
- 📄 Pagination & Sorting
- 🔍 Filtering & Search (by title and genre)
- 📘 Swagger UI for API documentation
- 🗄️ H2 In-Memory Database

---

## 🛠️ Tech Stack
- Java
- Spring Boot
- Spring Data JPA
- H2 Database
- Maven
- Swagger (OpenAPI)

---

## 📂 Project Structure

```
src/
 ├── controller/
 ├── service/
 ├── repository/
 ├── entity/
```

---

## ▶️ How to Run

1. Clone the repository:

```
git clone https://github.com/YOUR_USERNAME/bookstore-api.git
```

2. Navigate to project:

```
cd bookstore-api
```

3. Run the application:

```
./mvnw spring-boot:run
```

4. Server will start at:

```
http://localhost:8080
```

---

## 🌐 API Endpoints

### 📘 Author APIs

* GET /authors
* POST /authors

### 📗 Book APIs
- GET /books
- POST /books
- GET /books?page=0&size=2
- GET /books/genre?genre=Tech
- GET /books/search?title=Spring

---

## 📄 Swagger UI

Access API documentation here:

```
http://localhost:8080/swagger-ui/index.html
```

---

## 🧪 Sample Requests

### Create Author

```json
{
  "name": "Tarun",
  "email": "tarunhk1520@gmail.com"
}
```

### Create Book

```json
{
  "title": "Spring Boot Guide",
  "genre": "Tech",
  "price": 499,
  "author": {
    "id": 1
  }
}
```

---


## 🧠 Concepts Used

### 1️⃣ REST API
Implemented CRUD operations using Spring Boot controllers.

### 2️⃣ Layered Architecture
Followed: Controller → Service → Repository

### 3️⃣ JPA & Hibernate
Used for database interaction without writing SQL.

### 4️⃣ Entity Relationships
Implemented Many-to-One relationship between Book and Author.

### 5️⃣ Pagination & Sorting
Used Spring Data Pageable for efficient data handling.

### 6️⃣ Swagger Documentation
Integrated OpenAPI for API testing and documentation.

---


## 📊 Sample Output
```
GET /books?page=0&size=5&sort=id

Response:
{
  "content": [
    {
      "id": 1,
      "title": "Spring Boot Mastery",
      "genre": "Tech",
      "price": 599
    }
  ]
}
```

---


## 🎓 Learning Outcomes
- Building REST APIs using Spring Boot
- Understanding layered architecture
- Working with relational databases using JPA
- Implementing pagination and filtering
- Designing scalable backend systems
- Using Swagger for API testing
- Handling real-world backend development

