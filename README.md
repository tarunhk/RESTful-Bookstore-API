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
-Java
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

## 💡 Future Improvements
- Add JWT Authentication
- Use MySQL/PostgreSQL instead of H2
- Add Global Exception Handling
- Implement DTO pattern



## ⭐ If you like this project

Give it a star ⭐ on GitHub!
