We have created a simle programm with mapping in warming up and training.
to be continued there
Definition ot the excercise: 

Of course! Here's a similar beginner-level exercise in Spring Boot, outlined in steps without the solution provided. This will guide you through creating another simple RESTful web service.

### Exercise: Create a Spring Boot Application to Return a Custom Message

**Objective:** Develop a Spring Boot application that listens on a custom endpoint and returns a custom message.

**Steps:**

1. **Project Setup with Spring Initializr:**
   - Navigate to [Spring Initializr](https://start.spring.io/).
   - Select Maven Project, Java, and the latest Spring Boot version.
   - Add the "Spring Web" dependency.
   - Name your project "CustomMessageService".
   - Download the project and open it in IntelliJ IDEA.

2. **Create a REST Controller:**
   - In your project, navigate to the `src/main/java/<package-name>` directory.
   - Create a new Java class named `MessageController`.
   - In this class, use the `@RestController` annotation to define it as a controller.

3. **Define a GET Endpoint:**
   - Inside the `MessageController`, create a method that handles HTTP GET requests.
   - Use the `@GetMapping` annotation to map this method to a URL path, such as `/message`.
   - Make this method return a custom message string of your choice.

4. **Run the Application:**
   - Find the main application class in the `src/main/java/<package-name>` directory. This class is annotated with `@SpringBootApplication`.
   - Run the application by clicking the run icon in IntelliJ IDEA next to the class definition.
   - Once the application is running, open a web browser and navigate to `http://localhost:8080/message` to see your custom message.

This exercise will help you practice setting up a Spring Boot project, creating a REST controller, and defining a simple GET endpoint to return a custom message. It's a great way to get familiar with developing web services using Spring Boot.
