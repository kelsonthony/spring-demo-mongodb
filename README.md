# Spring Demo MongoDB

This project is a Spring Boot application that demonstrates the use of MongoDB as the database. It includes a RESTful API for managing rice production data.

## Technologies Used

- **Java**: Programming language used for the application.
- **Spring Boot**: Framework for building the application.
- **Spring Data MongoDB**: Spring module for integrating with MongoDB.
- **Maven**: Build automation tool used for managing dependencies and building the project.
- **MongoDB**: NoSQL database used for storing rice production data.

## Prerequisites

- **Java 17** or higher
- **Maven 3.6.3** or higher
- **MongoDB**: Ensure MongoDB is installed and running on your local machine or accessible remotely.

## Configuration

The application configuration is managed through the `application.properties` file located in the `src/main/resources` directory. Below is an example configuration:

```ini
server.port=8089

spring.application.name=spring-demo-mongodb

spring.data.mongodb.uri=mongodb://root:example@localhost:27017/Studies.rice_production?authSource=admin

logging.level.org.springframework.data.mongodb.core.MongoTemplate=DEBUG
logging.level.org.springframework.data.mongodb.core.MongoOperations=DEBUG
```

## Running the Application

1. **Clone the repository**:
    ```sh
    git clone https://github.com/kelsonthony/spring-demo-mongodb.git
    cd spring-demo-mongodb
    ```

2. **Build the project**:
    ```sh
    mvn clean install
    ```

3. **Run the application**:
    ```sh
    mvn spring-boot:run
    ```

The application will start on port 8089 by default.

## API Endpoints

The following endpoints are available in the application:

- **GET /api/rice-production**: List all rice production records.
- **GET /api/rice-production/{id}**: Get a specific rice production record by ID.
- **GET /api/rice-production/area/{countryName}**: Get rice production records by country name.
- **POST /api/rice-production**: Create a new rice production record.
- **DELETE /api/rice-production/{id}**: Delete a rice production record by ID.
- **PUT /api/rice-production/{id}**: Update a rice production record by ID.

## Project Structure

- `src/main/java/com/kelsonthony/springdemomongodb/api/controller`: Contains the REST controllers.
- `src/main/java/com/kelsonthony/springdemomongodb/domain/model`: Contains the domain models.
- `src/main/java/com/kelsonthony/springdemomongodb/domain/repository`: Contains the repository interfaces.
- `src/main/java/com/kelsonthony/springdemomongodb/domain/service`: Contains the service classes.
- `src/main/resources`: Contains the application configuration files.

## License

This project is licensed under the MIT License. See the `LICENSE` file for details.