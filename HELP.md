# Prodcuct API Project

## Project Structure

```
.
├── docker-dev-env/
│   ├── docker-compose.yml
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── com/
│   │   │   │   ├── example/
│   │   │   │   │   ├── productapi/
│   │   │   │   │   │   ├── controller/
│   │   │   │   │   │   │   ├── ProductController.java
│   │   │   │   │   │   ├── exception/
│   │   │   │   │   │   │   ├── ProductNotFoundException.java
│   │   │   │   │   │   ├── model/
│   │   │   │   │   │   │   ├── Product.java
│   │   │   │   │   │   ├── repository/
│   │   │   │   │   │   │   ├── ProductRepository.java
│   │   │   │   │   │   ├── service/
│   │   │   │   │   │   │   ├── ProductService.java
│   │   │   │   │   │   ├── ProductApiApplication.java
│   │   ├── resources/
│   │   │   ├── application.properties
│   ├── test/
│   │   ├── java/
│   │   │   ├── com/
│   │   │   │   ├── example/
│   │   │   │   │   ├── demo/
│   │   │   │   │   │   ├── ProductApiApplicationTests.java
├── Dockerfile
├── HELP.md
├── pom.xml
```

## Description
The Product API Project is a Spring Boot application designed to manage products. It provides a RESTful API for performing CRUD (Create, Read, Update, Delete) operations on products. The application uses MongoDB as its database and is containerized using Docker and Docker Compose for easy deployment and management.

### Features
- CRUD Operations: Create, read, update, and delete products.
- Spring Boot: Utilizes Spring Boot for rapid application development.
- MongoDB: Uses MongoDB for data storage.
- Docker: Containerized application for consistent and portable deployment.
- Docker Compose: Manages multi-container Docker applications.

## Installation
1. Clone the repository:
   ```bash
   git clone
    ```
2. Change directory to the project root:
3. Build the Docker image:
   ```bash
   docker build -t product-api .
   ```
4. Run the Docker container:
   ```bash
    cd docker-dev-env
    docker-compose up --build
    ```
5. Access the application at `http://localhost:8080`.
6. Access the Swagger UI at `http://localhost:8080/swagger-ui.html`.

## Author
- [Théo Lebiez](https://github.com/Deeffault/)
