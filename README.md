# SpringShop

## Overview

SpringShop is a microservices-based shopping application built using Spring Boot. This project consists of two main services: the Inventory Microservice and the Shopping Microservice.

### Features

- **Inventory Microservice**: 
  - Handles CRUD operations for product data.
  
- **Shopping Microservice**:
  - Fetches product data from the Inventory Microservice.

## Technologies Used

- Java
- Spring Boot
- Spring Cloud (for microservices)
- Git
- Maven

## Getting Started

### Prerequisites

- Java 11 or higher
- Maven
- Git

### Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/NelushGayashan/SpringShop.git
   ```
2. Navigate to the project directory:
   ```bash
    cd SpringShop
   ```
3. Build the project:
   ```bash
    mvn clean install
   ```
4. Run the application:
   ```bash
    mvn spring-boot:run
   ```

### API Endpoints

- **Inventory Microservice**: 
  - Base URL: http://localhost:8081
  - Example endpoint: GET /products - Fetch all products.
  
- **Shopping Microservice**:
  - Base URL: http://localhost:8082/api/shopping
  - Example endpoint: GET /products - Fetch product details.

### Contributing

Contributions are welcome!


