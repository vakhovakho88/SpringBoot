For a simple and effective Spring Boot warm-up exercise, let's create a basic "Hello World" REST API. This exercise will guide you through setting up a Spring Boot application and creating a REST endpoint that returns a "Hello World" message when accessed via a web browser or a tool like curl.

### Exercise: Hello World REST API with Spring Boot

#### Objective
Develop a Spring Boot application that provides a REST endpoint at `/hello` that returns a simple "Hello World" message.

#### Tools and Requirements
- Java Development Kit (JDK) - Version 8 or above
- Your favorite IDE (Eclipse, IntelliJ IDEA, Visual Studio Code, etc.) with Spring Boot support
- Maven or Gradle (depending on your project setup)

#### Steps

1. **Create a New Spring Boot Project**
    - Use [Spring Initializr](https://start.spring.io/) to create a new project:
        - Choose **Maven Project** or **Gradle Project** (depending on your preference)
        - Select **Java** as the language
        - Choose the latest Spring Boot version available
        - Fill in the **Group**, **Artifact** (e.g., com.example, demo)
        - Add **Spring Web** dependency
    - Download and unzip the project, then open it in your IDE.

2. **Create a REST Controller**
    - Navigate to the `src/main/java/com/example/demo` directory (your package structure might vary slightly).
    - Create a new Java class named `HelloController`.
    - Add the following content to `HelloController.java`:
      ```java
      package com.example.demo;
 
      import org.springframework.web.bind.annotation.GetMapping;
      import org.springframework.web.bind.annotation.RestController;
 
      @RestController
      public class HelloController {
 
          @GetMapping("/hello")
          public String sayHello() {
              return "Hello World";
          }
      }
      ```
    - This code defines a simple REST controller with one GET endpoint `/hello` that returns a "Hello World" string.

3. **Run Your Spring Boot Application**
    - Locate the main application class (e.g., `DemoApplication.java`) in the same directory as your controller.
    - Run the application by right-clicking the file and selecting **Run** (the exact option might vary by IDE).

4. **Test the Application**
    - Open a web browser and go to `http://localhost:8080/hello`
    - You should see the "Hello World" message displayed.
    - Alternatively, you can use a tool like curl: `curl http://localhost:8080/hello`

Congratulations! You've just created a simple Spring Boot application that responds with "Hello World" to web requests. This exercise is a great starting point for understanding how Spring Boot simplifies the development of web applications and RESTful services.