# SpringBatchExample
# Spring Batch Data Transfer Project

![logo](https://github.com/gada-sharanya/SpringBatchExample/assets/48100680/aceddcce-5e4d-4fa9-80ab-dd38eaef7bb1)


Welcome to the Spring Batch Data Transfer project! This project demonstrates how to use Spring Batch, a powerful framework within the Spring ecosystem, to transfer data from a CSV file to a MySQL database using Spring Boot.

## Features

- Batch processing using Spring Batch framework
- Data transfer from CSV file to MySQL database
- Efficient and scalable data processing
- Detailed job execution status tracking
- Simplified configuration with Spring Boot
- Integration with JPA for database interactions
- Improved code readability with Lombok

## Getting Started

To run this project locally, follow these steps:

1. **Clone the Repository:**
   ```sh
   git clone https://github.com/gada-sharanya/SpringBatchExample.git
   cd batches

2. Configure MySQL Database:
   Make sure you have a MySQL database up and running. Update the database configuration in src/main/resources/application.properties with your database details.

3. Run the Application:
   Run the Spring Boot application using your favorite IDE or using the following command:
   ./mvnw spring-boot:run

 4. Execute the Job:
   Access the application at http://localhost:9191 and trigger the data transfer job by clicking the provided endpoint.

**Dependencies**
Spring Boot 2.5.4
Spring Batch
Spring Web
Spring Data JPA
Lombok
MySQL Driver

**Usage**
Add your CSV file to the src/main/resources directory.
Configure the job properties and mappings in src/main/java/com/example/batches/config/SpringBatchConfig.java.
Run the application to start the data transfer job



