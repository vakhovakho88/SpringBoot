- Link of repository: https://github.com/darbyluv2code/spring-boot-3-spring-6-hibernate-for-beginners

- Java Development Environment
- Java Development Kit (Spring boot requires JDK 17 or higer)
- Java IDE
- Intelij is super amazing ide
- free version of intelij Intelij Community edition

## Spring Boot Overview

## Spring Framework Simplified

Spring is a toolkit that streamlines the process of building Java applications. It helps developers by handling many routine tasks:

1. **Managing Objects**: Controls the creation and linking of application components.
2. **Web Apps**: Facilitates the development of web-based applications and services.
3. **Database Connections**: Simplifies interactions with databases.
4. **Security**: Provides tools to safeguard your application.
5. **Spring Boot**: Offers a hassle-free starting point for Spring projects.
6. **Microservices**: Assists in creating small, interconnected services.

In essence, Spring takes care of the complex parts, allowing developers to focus on their main application logic.

## Challenges with Traditional Spring:

1. **Tough Setup**: Needed lots of setup with confusing XML files.
2. **Too Much Repetition**: Often required writing the same code again and again.
3. **Version Issues**: Different parts could clash because they needed different versions of tools.
4. **Hard to Deploy**: Needed external tools to run the applications.
5. **Steep Learning**: Difficult for beginners because of all the above.

## Why Spring Boot?

Spring Boot was created to fix these problems:

1. **Automatic Setup**: It figures out what setup you need based on what you’re doing.
2. **All-in-One**: Everything you need to run is included, no extra tools required.
3. **Simple and Clear**: Removes repetitive code and reduces version conflicts.
4. **Ready for Real Use**: Comes with tools to check if everything's running smoothly.
5. **Easy Start**: Setting up a new project is just a few clicks away.

In simple words, Spring Boot makes building applications with Spring easy and quick, without the usual complications.

## Spring Initializr: http://start.spring.io

- **What is it?**: A web-based tool for starting new Spring projects.
- **Why use it?**:

  - **Easy Setup**: Provides a quick way to bootstrap a new Spring Boot application.
  - **Customizable**: Lets you choose the type of project, Java version, and dependencies you need.
  - **Time Saver**: Eliminates the need for manual setup and configuration.

- **How it works?**:
  1. Visit the Spring Initializr website.
  2. Select project options and dependencies.
  3. Click "Generate" to download a pre-configured project.

### In Simple Terms:

Spring Initializr is like a project wizard for Spring Boot. It helps you set up a new project with the settings and tools you need, so you can start coding right away.

## JAR Files in Java:

- **What is it?**: JAR stands for Java ARchive. It's a package file format used to bundle Java class files and associated resources into a single file.

- **Why use it?**:

  - **Organization**: Keeps related Java classes and resources together.
  - **Portability**: Makes it easy to distribute and share Java applications or libraries.
  - **Compression**: Reduces the size of the files, making them faster to download and use.

- **How it's used?**:
  1. Use tools like `jar` command (part of JDK) to create or extract JAR files.
  2. Can be executed if they contain runnable Java applications.

### In Simple Terms:

Think of a JAR file like a zip folder but specifically for Java applications. It packs Java files and resources into one file, making them easier to distribute or use.

## Maven in Java:

- **What is it?**: Maven is a tool that helps manage Java projects.

- **Key Features**:

  - **Dependency Management**: Automatically downloads and manages libraries that your project needs.
  - **Build Automation**: Compiles and packages your Java code with simple commands.
  - **Standardized Structure**: Provides a standard project structure, making it easier to understand projects created by others.

- **Why use it?**:
  - **Simplicity**: Manage libraries and build your project with just a few commands.
  - **Consistency**: Ensures that all developers are using the same libraries and build process.
  - **Plugins**: Extends functionality with various plugins for tasks like code analysis, testing, and deployment.

### In Simple Terms:

Maven is like a helpful assistant for Java projects. It handles the "behind-the-scenes" tasks like getting the right tools, organizing your project, and preparing it for use.

- Visit: https://start.spring.io/
- Project: Maven
- Language: Java
- Spring Boot: Latest Version, avoid snapshot versions
- Group: com.luv2code.springboot.demo
- Artifact: mycoolapp
- Add dependencies
  - Spring Web
- Click on generate and download zip project
- Open the folder with intelij and maven download dependencies
- the main class: src/main/java/com/luv2code/springboot/demo/mycoolapp/MycoolappApplication.java
- Running it will start a server and we will see on wich port it runs

Create a REST Controller

## Creating a REST Controller in Spring Boot:

### 1. Setup Spring Boot Project:

- Use **Spring Initializr** to create a new project.
- Add the `Spring Web` dependency.

### 2. Create a Controller:

- Navigate to your project's `src/main/java/com/luv2code/springboot/demo/mycoolapp` directory and create a new Package named `rest`.
- - Navigate to your project's `src/main/java/com/luv2code/springboot/demo/mycoolapp/rest` directory and create a new Class named `FunRestController`.

```java
package com.luv2code.springboot.demo.mycoolapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
    //expose "/" that return "Hello World"
    @GetMapping
    public String sayHello(){
        return "Hello World";
    }
}
```

### 3. Explanation:

- `@RestController` annotation indicates that the class will serve RESTful requests.
- `@GetMapping("/")` defines an HTTP GET endpoint. When you access `http://localhost:port/`, it will return "Hello, World!".

### 4. Run & Test:

- Start your Spring Boot application.
- Use a web browser or a tool like Postman to access: `http://localhost:PORT`
- You should see: `Hello, World!`

### In Simple Terms:

This guide helps you create a simple REST endpoint in a Spring Boot application that, when accessed, returns a greeting message.

## Spring Framework Simplified

Spring Framework is like a big toolkit for Java developers. It helps them create applications more easily and efficiently. Here's a simple breakdown:

### Official Website:

- **[www.spring.io](http://www.spring.io)**: The main website where you find all things related to Spring.

### POJOs (Plain Old Java Objects):

- Just regular Java objects. No need for anything fancy.
- **Example**: A `Person` class with `name` and `age` attributes.

### Core Container:

Handles the main parts of Spring:

- **Beans**: The primary objects in your application.
  - **Example**: Think of a `Car` object in a car application.
- **Core**: The heart of Spring. It creates and manages beans.
- **SpEL**: Lets you interact with beans in advanced ways.
  - **Example**: Fetching the `Car` with the maximum speed.
- **Context**: Allows different parts of your app to communicate.

### Infrastructure:

- **AOP**: Lets you add extra features to methods without changing them.

  - **Example**: Logging every time a method is called.

- **Aspects**: Ties with AOP to enhance functionalities.
- **Instrumentation & Messaging**: Tools to monitor and send messages in applications.

### Data Access Layer:

Helps you communicate with databases:

- **JDBC**: Connects your app to databases.
  - **Example**: Fetching all users from a database.
- **ORM**: Helps you work with databases using regular objects.
  - **Example**: Saving a `User` object directly into the database.
- **Transactions**: Ensures tasks are completed properly or not at all.
  - **Example**: If buying a book fails, ensure money isn't taken.
- **OXM**: Converts objects to XML and vice versa.
- **JMS**: Lets you send and receive messages between parts of your application.

### Web Layer:

Helps in building web applications:

- **Servlet**: The foundation for building web apps in Java.
- **Websocket**: Helps in real-time communication.
  - **Example**: A live chat feature in a website.
- **Web**: Tools to make web-related tasks easier.

### Test Layer:

For checking if your application works correctly:

- **Unit**: Tests small parts of your application.
  - **Example**: Checking if the "add" function works.
- **Integration**: Tests combined parts of your application.
  - **Example**: Testing if the "buy" function reduces stock and takes money.
- **Mock**: Pretend parts for testing.
  - **Example**: Simulating a database for testing without a real one.

## In Simple Terms:

Spring is a toolkit helping developers build Java apps faster and easier. It provides tools for everything, from the core parts of an app to its web features and testing.

-- 17.10 after this it is uncorrected

- What are Spring Projects?
- You can find Spring projects on spring.io
- These are different type of projects
-

# **Maven Crash Course Reference**

## **Overview**

- **Maven**: A Java project management tool, focusing on dependency management and build automation.

## **Spring Boot & Maven**

- Use `start.spring.io` for Maven project generation.
- Key concepts:
  - `pom.xml`: Defines project and dependencies.
  - **Spring Boot starters**: Pre-configured templates for quick project setup in Maven.

## **Maven's Process**

1. **Manual Approach**: Download necessary JARs (like Spring, Hibernate) and manage classpath.
2. **Maven's Approach**:
   - Provide a "shopping list" of dependencies.
   - Maven fetches JARs from the Central Repository, caches locally.
   - Resolves nested dependencies automatically.

## **Building & Running with Maven**

- Maven auto-configures class and build paths, streamlining the build & run process.

## **Benefits**

- Simplifies dependency management.
- Standardized builds.
- Time-efficiency for developers.

## **Key Terms/Glossary**

- **`pom.xml`**: Project Object Model file. It defines project resources, plugins, dependencies, and other configurations.
- **Central Repository**: A remote storage of Java libraries, where Maven fetches dependencies from.
- **Local Repository**: Maven's local cache where it stores downloaded dependencies.

## **Quick-Start Example**

```xml
<!-- Sample pom.xml structure -->
<project>
   <dependencies>
      <!-- Define your dependencies here, e.g., Spring Boot Starter Web -->
      <dependency>
         <groupId>org.springframework.boot</groupId>
         <artifactId>spring-boot-starter-web</artifactId>
      </dependency>
   </dependencies>
</project>
```

Run `mvn clean install` to fetch dependencies and build.

## **Further Resources**

- [Maven Official Documentation](https://maven.apache.org/guides/index.html)
- [Spring Initializr](https://start.spring.io/)

## **Standard Directory Structure**

Maven offers a standardized directory structure for Java projects:

- **Root Directory**: Contains the `pom.xml` file, Maven's configuration file, which details your project dependencies (akin to a shopping list).
- **src/main/java**: Where Java source code resides.
- **src/main/resources**: Houses properties and configuration files.
- **src/main/webapp**: Contains web-related assets - JSP files, config files, images, CSS, etc.
- **src/test**: For unit testing source code and related properties/config files.
- **target**: Destination directory for compiled code and Maven-generated artifacts.

## **Benefits of Using Maven**

1. **Consistency & Efficiency**:

   - Helps newcomers with a standard project layout.
   - Simplifies finding code, properties files, unit tests, etc.

2. **IDE Compatibility**:

   - Supported by major IDEs (Eclipse, IntelliJ, NetBeans).
   - Maven projects are portable across these IDEs. Develop in one IDE and open in another without hassles.

3. **Dependency Management**:

   - Maven automatically fetches required JARs.
   - Resolves missing JARs and build path/classpath issues.

4. **Rapid Onboarding**:
   - For new developers, Maven ensures a smoother entry into projects.
   - Minimal local configurations are needed. Maven fetches and sets up everything.

## **Conclusion**

Maven, once mastered, is a powerful tool for Java projects. It not only standardizes project structures but also handles dependencies and integrations seamlessly.

# **Maven Key Concepts**

## **1. POM File (Project Object Model)**

- **Definition**: Central configuration file for Maven.
- **Location**: Root of your Maven project.
- **Function**: Specifies project dependencies for Maven.

### **POM File Structure**

- **Project Metadata**: Information about the project such as its name, version, and output file type (JAR, WAR, etc.).
- **Dependencies**: List of projects your app relies on (e.g., Spring, Hibernate).
- **Plugins**: Custom tasks for activities like generating JUnit test reports.

### **Sample POM File Structure**

```xml
<project>
    <modelVersion>4.0.0</modelVersion>
    <groupId>com.mycoolapp</groupId>
    <artifactId>mycoolapp</artifactId>
    <version>1.0</version>
    <packaging>JAR</packaging>
    <!-- ... -->
</project>
```

## **2. Project Coordinates**

- Used to uniquely identify a project.
- Comprises:
  - **Group ID**: Name of your company, group, or organization. Uses reverse domain name convention.
  - **Artifact ID**: Name of the project.
  - **Version**: Specific release version of the project.

**Tip**: Remember GAV = Group ID, Artifact ID, Version.

### **Example Project Coordinates**

For Spring:

```xml
<dependency>
    <groupId>org.springframework</groupId>
    <artifactId>spring-context</artifactId>
    <version>5.x.x</version>
</dependency>
```

For Hibernate:

```xml
<dependency>
    <groupId>org.hibernate</groupId>
    <artifactId>hibernate-core</artifactId>
    <version>x.x.x</version>
</dependency>
```

## **3. Adding Dependencies**

- Directly add dependencies into the POM file.
- To find dependencies, use the project page or visit [Maven Central Repository](https://search.maven.org/).

# **Spring Boot Project Structure**

## **1. Directory Structure**

- Spring Boot uses **Maven's standard directory structure**:
  - **src/main/java**: Place for Java source code.
  - **src/main/resources**: Contains properties or config files.
  - **src/test/java**: Houses unit testing code.

## **2. Maven Wrapper (mvnw)**

- **Purpose**: Allows you to run a Maven project without requiring Maven to be installed or set on your path.
  - **mvnw.cmd**: For Microsoft Windows.
  - **mvnw.sh**: For Linux or Mac systems.
- **How It Works**: If the right version of Maven isn't on your computer, it will download and run the correct version for you.
- **Note**: If you have Maven installed, you can use the standard `mvn` command and may ignore/delete mvnw files.

## **3. POM File**

- Contains the information provided at the **Spring Initializr**.

  - **Metadata**: Group ID, artifact ID, and more.
  - **Dependencies**: Often presented as 'starters', which are collections of compatible Maven dependencies. Example: `spring-boot-starter-web`.

  **Benefits of Starters**:

  - Group related dependencies together, simplifying the POM.
  - Ensure dependencies are compatible with one another.

- **Spring Boot Maven Plugin**: Located at the bottom of the POM file, it's used to package an executable jar or create a war archive. Useful commands:
  - `mvnw package` or `mvn package`
  - `mvnw spring-boot:run` or `mvn spring-boot:run`

## **4. Source Code Overview**

- Upon project generation, a **main Spring Boot application class** is created.
- Additional classes, like **RestController**, can be created to define APIs or other functionalities.

**Tip**: Explore the `FundRestController` for a simple Rest API example.

# **Spring Boot Project Structure**

## **1. Application Properties**

- Default properties file: `application.properties`
- Located in: `src/main/resources`
- Configure Spring Boot via properties, e.g., `server.port=8585`
- Add custom properties and access them using `@Value` annotation in your classes. For example:
  ```java
  @Value("${coach.name}")
  private String coachName;
  ```

## **2. Static Content**

- Default directory: `/static`
- Types: HTML, CSS, JavaScript, images, PDFs, etc.
- **Warning**: Avoid `src/main/webapp` for JAR packaging. It only works for WAR.

## **3. Templates**

- Supported engines: FreeMarker, Thymeleaf, Mustache
- Default directory: `/templates`
- We'll primarily use **Thymeleaf** in the course.

## **4. Unit Tests**

- Default test class created by Spring Initializr: `Mycoolapplicationtest.java`
- Contains basic setup; you can add custom unit tests.

---

**Tips**:

1. Always use `application.properties` to configure your Spring Boot app.
2. Place static resources in the `/static` directory.
3. For dynamic content, familiarize yourself with template engines like Thymeleaf.
4. Utilize the provided test structure to create meaningful unit tests for your application.

**Git Reference: Understanding Spring Boot Starters**

**1. Problem Statement:**

- Setting up a Spring application with correct Maven dependencies is challenging.
- Developers often ask: "What are the essential dependencies for a Spring MVC or Hibernate application?"

**2. Solution: Spring Boot Starters**

- **Definition**: Curated sets of Maven dependencies grouped together.
- **Benefits**:
  - Reduces the Maven configuration hassle.
  - Eliminates the need for searching individual dependencies.
  - Ensures dependencies are compatible.

**3. Example:**

- Traditional Spring MVC setup:

  ```xml
  <dependency>Spring-MVC</dependency>
  <dependency>hibernate-validator</dependency>
  <dependency>web-template</dependency>
  ```

- With Spring Boot Starter:

  ```xml
  <dependency>
      <groupId>org.springframework.boot</groupId>
      <artifactId>spring-boot-starter-web</artifactId>
  </dependency>
  ```

  This single entry covers `spring-web`, `spring-webmvc`, `hibernate-validator`, and more.

**4. Using Spring Initializr:**

- Choose the features (like web, security, JPA) you need.
- It generates the required Spring Boot Starters in your `pom.xml`.

**5. Exploring Starter Contents:**

- **IDEs**:
  - **Eclipse**: Open `pom.xml`, select the "Dependency Hierarchy" tab.
  - **IntelliJ**: Use `View > Tool Windows > Maven Projects`, then expand dependencies.

**6. Additional Resources**:

- For a comprehensive list of Spring Boot Starters, check official documentation or visit `luv2code.com/spring-boot-starters`.

**Conclusion**:

Spring Boot Starters simplify the process of setting up new Spring projects by offering pre-defined sets of dependencies that cater to specific functionalities. This ensures compatibility and reduces the configuration effort.

---

Certainly!

**Git Reference: Spring Boot Starter Parent**

**1. Introduction:**

- The **Spring Boot Starter Parent** offers Maven defaults for consistent Spring configuration.

**2. Key Features:**

- Sets compiler levels and UTF-8 source encoding.

**Example Parent Config:**

```xml
<parent>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-parent</artifactId>
    <version>2.5.0</version>
</parent>
```

**3. Customizing Java Version:**

- Override the default Java version as needed.

**Example:**

```xml
<properties>
    <java.version>12</java.version>
</properties>
```

**4. Dependency Versioning:**

- Dependencies inherit versions from the Starter Parent, ensuring compatibility.

**5. Spring Boot Plugin:**

- Default configuration provided. Run your app with: `mvn spring-boot:run`.

**Benefits:**

- Simplified Maven configuration.
- Uniform dependency management.
- Ready-to-use Spring Boot plugin.

---

**Git Reference: Spring Boot Dev Tools Overview**

**1. Problem:**

- Manually restarting Spring Boot applications after code changes is inefficient.

**2. Solution: Spring Boot Dev Tools**

- Provides automatic restarts when code changes.
- Achieved by simply adding a Maven dependency.

**Example Maven Dependency:**

```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-devtools</artifactId>
</dependency>
```

**3. IDE Configuration (IntelliJ Community Edition):**

- By default, IntelliJ Community Edition needs additional setup to support Dev Tools.

**Steps:**

1. Go to `File > Build, Execution, Deployment > Compiler` and check `Build Project Automatically`.
2. Navigate to `File > Advanced Settings` and check `Allow Auto-Make to Start`.

**4. Development Flow:**

- Configure IntelliJ as outlined.
- Add `spring-boot-devtools` to `pom.xml`.
- Implement your new features or changes.
- The app will automatically reload with changes.

---

**Spring Boot Actuator Quick Reference**

---

**Introduction:**

- **Spring Boot Actuator** allows you to monitor and manage your application.

**Key Features:**

1. **Endpoints:** Exposes various endpoints to provide insights about the running application, such as `/health`, `/info`, `/beans`, `/mappings`, etc.
2. **DevOps Ready:** Get DevOps features instantly without writing additional code.

**Setup:**

1. **Maven Dependency**:

   ```xml
   <dependency>
       <groupId>org.springframework.boot</groupId>
       <artifactId>spring-boot-starter-actuator</artifactId>
   </dependency>
   ```

2. **Accessing Endpoints**: All actuator endpoints are prefixed with `/actuator`. For instance:
   - `/actuator/health`: Checks if the application is up or down.
   - `/actuator/info`: Provides application's metadata.

**Customization:**

1. **Info Endpoint**: Customize via `application.properties`:

   ```properties
   info.app.name=MyAppName
   info.app.description=My cool Spring Boot App
   info.app.version=1.0.0
   ```

2. **Exposing All Endpoints**:
   - By default, only `/health` is exposed.
   - Expose all endpoints via `application.properties`:
     ```properties
     management.endpoints.web.exposure.include=*
     ```

**Security Note**: While actuator provides great insights, it's vital to ensure it's secure. You should protect these endpoints and only provide access to authorized personnel. Spring Boot provides ways to add security, covered in later modules.

**Example**:

Once you have set up the actuator, you can:

1. Navigate to `/actuator/health` in your browser. You should see a response like:

   ```json
   {
     "status": "UP"
   }
   ```

2. Navigate to `/actuator/info` to see the customized application metadata:
   ```json
   {
     "app": {
       "name": "MyAppName",
       "description": "My cool Spring Boot App",
       "version": "1.0.0"
     }
   }
   ```

---

**Spring Boot Actuator Quick Guide**

---

**Introduction:**

- **Spring Boot Actuator** offers monitoring and management features for your application.

**Setup:**

1. **Maven Dependency**:

   ```xml
   <dependency>
       <groupId>org.springframework.boot</groupId>
       <artifactId>spring-boot-starter-actuator</artifactId>
   </dependency>
   ```

2. **Accessing Endpoints**: By default, only `/health` is exposed, but more can be made available:
   - `/actuator/health`: Provides the health status of the app.
   - `/actuator/info`: Displays application metadata.

**Customization:**

1. **Exposing `/info` Endpoint**:
   In `application.properties` (src/main/resources/application.properties):

   ```properties
   management.endpoints.web.exposure.include=health,info
   management.info.env.enabled=true
   ```

2. **Populating `/info` Endpoint**:
   In `application.properties`:
   ```properties
   info.app.name=YourAppName
   info.app.version=YourAppVersion
   ```
   Accessing `/actuator/info` will now display the above metadata.

**Example**:

1. After setting up, start your application.
2. Navigate to:
   - `/actuator/health` in your browser. You should see:
     ```json
     {
       "status": "UP"
     }
     ```
   - `/actuator/info` to see your custom metadata, like:
     ```json
     {
       "app": {
         "name": "YourAppName",
         "version": "YourAppVersion"
       }
     }
     ```

**Spring Boot Actuator Essentials**

---

**What is it?**
Spring Boot Actuator provides built-in monitoring and management capabilities for your application without requiring any additional code.

**Setting Up Actuator:**

1. **Add Maven Dependency**:

   ```xml
   <dependency>
       <groupId>org.springframework.boot</groupId>
       <artifactId>spring-boot-starter-actuator</artifactId>
   </dependency>
   ```

2. **Configuring Custom Information**:
   In `application.properties`:

   ```properties
   info.app.name=My Super Cool App
   info.app.description=A description of your application.
   info.app.version=1.0.0
   ```

3. **/actuator/beans**: Shows all the Spring beans registered in your application.

4. **/actuator/threaddump**: Lists all running threads, useful for debugging.

5. **/actuator/mappings**: Displays all the request mappings in your app.

**Enabling More Endpoints**: To expose all actuator endpoints, modify `application.properties`:

```properties
management.endpoints.web.exposure.include=*
```

**Note**: Ensure that sensitive endpoints are properly secured.

**Spring Boot Actuator Security Essentials**

---

**Introduction:**
Spring Boot Actuator provides insights into your application's operations. However, there's a potential security concern, as we might not want to expose detailed information to the public.

**Securing Actuator Endpoints with Spring Security:**

1. **Add Maven Dependency**:

   ```xml
   <dependency>
       <groupId>org.springframework.boot</groupId>
       <artifactId>spring-boot-starter-security</artifactId>
   </dependency>
   ```

   By simply adding this, Spring Security is enabled, and access to actuator endpoints requires authentication.

2. **Default Credentials**:

   - **Username**: `user`
   - **Password**: Found in the console logs during startup. It looks like `Using generated security password: [RANDOM PASSWORD]`.

3. **Customizing Credentials**:
   In `application.properties`:

   ```properties
   spring.security.user.name=scott
   spring.security.user.password=tiger
   ```

4. **Exclude Endpoints**:
   If you want to exclude specific actuator endpoints, for example `/health` and `/info`, from being exposed:
   ```properties
   management.endpoints.web.exposure.exclude=health,info
   ```

**Further Customizations**:

- Spring Security offers advanced configurations, allowing for user authentication via databases, incorporating roles, encrypted passwords, etc.
- For a deep dive into Spring Boot Actuator's features, visit the [official documentation](https://docs.spring.io/spring-boot/docs/current/reference/html/production-ready-features.html).

**Git Reference: Secure Spring Boot App with Spring Security and Actuator Endpoints**

1. **Introduction:**

   - Topic: Securing Spring Boot App
   - Key Points:
     - The need to secure exposed endpoints.
     - Adding Spring Security to lock down endpoints.

2. **Configuring Spring Security:**

   - Example: Add Spring Security in `pom.xml`.
   - Key Points:
     - Add the `spring-boot-starter-security` dependency.
     - Security automatically applies to REST endpoints.

3. **Accessing Actuator Endpoints:**

   - Example: Accessing `/actuator/mappings` endpoint.
   - Key Points:
     - Default user ID: "user".
     - Password is generated, can be customized.
     - Security prompts login for access.

4. **Excluding Actuator Endpoints:**

   - Example: Exclude `/actuator/health` and `/actuator/info`.
   - Key Points:
     - Disable specific endpoints in `application.properties`.
     - Exclude endpoints like "health" and "info" to restrict access.

5. **Reenabling Endpoints:**

   - Example: Commenting out exclusion configuration.
   - Key Points:
     - Endpoints like "health" and "info" are useful for real-time projects.
     - Recommended to keep them available for DevOps and monitoring.

6. **Conclusion:**
   - Key Points:
     - Demonstrated securing Spring Boot App with Spring Security.
     - Highlighted the importance of securing and selectively enabling Actuator endpoints.

**Git Reference: Running Spring Boot Applications from Command Line**

1. **Introduction:**

   - Topic: Running Spring Boot from the command line.
   - Key Points:
     - Often run Spring Boot apps from IDE.
     - Learn to run Spring Boot outside IDE using command line.
     - Spring Boot apps include an embedded server.

2. **Running with `java -jar`:**

   - Example: Run a Spring Boot app named `mycoolapp.jar`.
   - Key Points:
     - No separate server or IDE needed.
     - Use `java -jar <JARFileName>` to start the app.

3. **Using Spring Boot Maven Plugin:**

   - Example: Run the app using `mvnw spring-boot:run`.
   - Key Points:
     - Simplifies running Spring Boot apps.
     - No manual Maven installation required.
     - Can also use `mvn spring-boot:run` if Maven is installed.

4. **Packaging and Running:**

   - Example: Package the app with `mvnw package`.
   - Key Points:
     - Use `mvnw spring-boot:run` to run it.
     - Mention `pom.xml` configuration for Spring Boot Maven Plugin.

5. **Development Workflow:**
   - Key Points:
     - Demonstrate exiting the IDE.
     - Show how to package and run using both `java-jar` and Spring Boot Maven Plugin.

# Spring Boot Command Line Tutorial

This tutorial is designed to guide you through running Spring Boot applications from the command line. Whether you're using Windows, macOS, or Linux, this document will provide you with clear steps, explanations, and examples to enhance your understanding and skills.

## Table of Contents

1. [Introduction](#introduction)
2. [Preparation Steps](#preparation-steps)
3. [Running Spring Boot Apps on Windows](#running-spring-boot-apps-on-windows)
4. [Running Spring Boot Apps on macOS/Linux](#running-spring-boot-apps-on-macoslinux)
5. [FAQs](#faqs)
6. [Additional Resources](#additional-resources)

## Introduction

Running Spring Boot applications from the command line is a fundamental skill that offers flexibility in development and deployment. It allows you to manage and test your applications outside of an Integrated Development Environment (IDE), ensuring that your app behaves as expected in a production-like environment.

## Preparation Steps

Before running your Spring Boot application from the command line, ensure the following:

- **Maven Configuration:** Open your Maven `pom.xml` file and remove unnecessary dependencies, such as the actuator and security, to simplify the project structure for this demonstration.
- **Exit IDE:** To focus on command-line operations, close your IDE. This step ensures that your application is not running elsewhere, which could cause port conflicts.

## Running Spring Boot Apps on Windows

### Environment Setup

1. **Directory Structure:** Avoid using directories with spaces in their names to prevent issues with the Java runtime. Place your project in an easily accessible location, e.g., `D:\Users\yourusername\dev-spring-boot`.
2. **Open Command Prompt:** Use the search function to find and open `CMD`.
3. **Verify Java Installation:** Ensure `JAVA_HOME` is set correctly and that Java is installed properly by running `echo %JAVA_HOME%` and `java --version` commands.

### Packaging and Running the Application

1. **Navigate to Project Directory:** Use the `cd` command to move into your project's directory, e.g., `cd D:\Users\yourusername\dev-spring-boot\05-command-line-demo`.
2. **Package Application:** Execute `mvnw package` to build your application. Maven will create a `.jar` file in the `target` directory.
3. **Run Application:** Use `java -jar target\mycoolapp-0.0.1-SNAPSHOT.jar` to start your Spring Boot application.
4. **Verify Operation:** Open a web browser and navigate to `http://localhost:8080` to confirm that the application is running.

## Running Spring Boot Apps on macOS/Linux

The steps for macOS and Linux are similar to those for Windows, with slight differences in commands and file paths.

### Environment Setup

1. **Open Terminal:** Access the terminal through your system's utilities.
2. **Verify Java Installation:** Confirm that Java is correctly installed with `java -version` and `echo $JAVA_HOME`.

### Packaging and Running the Application

1. **Navigate to Project Directory:** Change to your project's directory, e.g., `cd ~/dev-spring-boot/05-command-line-demo`.
2. **Package Application:** Run `./mvnw package` to build your project. This creates a `.jar` file in the `target` directory.
3. **Run Application:** Start your application with `java -jar target/mycoolapp-0.0.1-SNAPSHOT.jar`.
4. **Test Application:** Open your browser and visit `http://localhost:8080` to check the application's functionality.

## FAQs

- **Q: What if `JAVA_HOME` is not set?**
  - A: Follow the provided Java installation guide to correctly set up your environment.
- **Q: Can I run the application without packaging it every time?**
  - A: Yes, use the Spring Boot Maven plugin with `mvnw spring-boot:run` for a quicker start-up.

## Additional Resources

- **Spring Boot Documentation:** [Official Spring Boot Docs](https://spring.io/projects/spring-boot)
- **Maven Build Tool:** [Maven Official Site](https://maven.apache.org/)
- **Java Development Kit (JDK):** [AdoptOpenJDK](https://adoptopenjdk.net/)

This guide aims to make running Spring Boot applications from the command line an accessible and straightforward process. Whether you're working in a Windows, macOS, or Linux environment, the principles remain the same, empowering you to manage your Spring Boot projects more efficiently.

# Example

Sure, I'll provide a simple example of creating a basic Spring Boot application that you can run from the command line. This application will be a minimal web service that responds with "Hello, Spring Boot!" when accessed via a web browser.

### Step 1: Create a Spring Boot Project

First, you'll need to set up a Spring Boot project. You can use [Spring Initializr](https://start.spring.io/) for this:

- **Project:** Maven Project
- **Language:** Java
- **Spring Boot:** Choose the latest stable version
- **Project Metadata:**
  - **Group:** com.example
  - **Artifact:** hello-spring-boot
- **Dependencies:** Web

Generate the project, download the ZIP file, and extract it to your workspace.

### Step 2: Add a Rest Controller

Navigate to the `src/main/java/com/example/hellospringboot` directory and create a new Java file named `HelloController.java`. Add the following code:

```java
package com.example.hellospringboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String hello() {
        return "Hello, Spring Boot!";
    }
}
```

This code defines a REST controller with a single route (`"/"`) that returns a simple string.

### Step 3: Build the Project

Open a command line or terminal window, navigate to the root of your project, and run the Maven wrapper script to build your project:

For Windows:

```shell
mvnw package
```

For macOS/Linux:

```shell
./mvnw package
```

This command compiles your project and packages it into a `.jar` file located in the `target` directory.

### Step 4: Run the Application

After building the project, you can run the Spring Boot application using the following command:

For Windows:

```shell
java -jar target/hello-spring-boot-0.0.1-SNAPSHOT.jar
```

For macOS/Linux:

```shell
java -jar target/hello-spring-boot-0.0.1-SNAPSHOT.jar
```

### Step 5: Access the Application

Open a web browser and visit `http://localhost:8080`. You should see the message "Hello, Spring Boot!" displayed.

### Explanation

- **Spring Initializr:** A tool to quickly bootstrap a new Spring Boot project with your chosen dependencies.
- **RestController:** A Spring MVC annotation that marks the class as a controller where every method returns a domain object instead of a view. It's shorthand for including both `@Controller` and `@ResponseBody`.
- **GetMapping:** Annotation for mapping HTTP GET requests onto specific handler methods.
- **mvnw package:** A command that uses Maven Wrapper to compile your Java code, run any tests, and package the compiled code into a JAR file.
- **java -jar:** This command runs your Spring Boot application with Java, specifying the JAR file created by Maven as the program to run.

This example demonstrates the simplicity of creating and running a Spring Boot application from the command line, making it accessible for development and testing outside an IDE.

# Spring Boot Custom Application Properties Tutorial

This tutorial provides a comprehensive guide on utilizing custom application properties in a Spring Boot application. By the end of this tutorial, you'll understand how to define and inject custom properties, enhancing your application's configurability and maintainability.

## Table of Contents

- [Introduction](#introduction)
- [Defining Custom Application Properties](#defining-custom-application-properties)
- [Injecting Properties into Your Application](#injecting-properties-into-your-application)
- [Practical Example: Coding in Spring Boot](#practical-example-coding-in-spring-boot)
- [Common Issues and Fixes](#common-issues-and-fixes)
- [Additional Resources](#additional-resources)

## Introduction

Spring Boot simplifies the process of configuring applications by allowing developers to externalize properties. This means you can manage your application's configuration without hardcoding values, making your application adaptable to different environments.

### Key Concepts

- **application.properties**: The default file Spring Boot uses to read configuration properties.
- **@Value Annotation**: Used to inject property values into application components.

## Defining Custom Application Properties

1. **Location**: Place your `application.properties` file in the `src/main/resources` directory.
2. **Syntax**: Define properties using key-value pairs. For example:
   ```properties
   coach.name=Mickey Mouse
   team.name=The Mouse Club
   ```
3. **Flexibility**: You can define any number of custom properties.

## Injecting Properties into Your Application

1. **@Value Annotation**: Use this annotation to inject properties into your Spring Boot classes.
2. **Syntax**:
   ```java
   @Value("${property.name}")
   private String propertyName;
   ```
3. **Example**:
   Injecting `coach.name` and `team.name` into a Spring Boot application.

## Practical Example: Coding in Spring Boot

### Setup

1. **Define Properties**: In `application.properties`, add your custom properties.
   ```properties
   coach.name=Mickey Mouse
   team.name=The Mouse Club
   ```

### Code Implementation

1. **Create a Rest Controller**: Use the `@RestController` annotation to define a controller.
2. **Inject Properties**: Use the `@Value` annotation to inject the defined properties.

   ```java
   import org.springframework.beans.factory.annotation.Value;




   @RestController
   public class FunRestController {
       @Value("${coach.name}")
       private String coachName;

       @Value("${team.name}")
       private String teamName;

       @GetMapping("/teaminfo")
       public String getTeamInfo() {
           return "Coach: " + coachName + ", Team: " + teamName;
       }
   }
   ```

### Running Your Application

- Start your Spring Boot application and access `localhost:8080/teaminfo` to see the injected properties in action.

## Common Issues and Fixes

- **Typo in Property Names**: Ensure the property names in the `@Value` annotation exactly match those in the `application.properties` file.
- **Missing Curly Braces in @Value Annotation**: Proper syntax is crucial: `@Value("${property.name}")`.

## Additional Resources

- [Spring Boot Documentation](https://docs.spring.io/spring-boot/docs/current/reference/html/features.html#features.external-config)
- [Baeldung on Spring @Value](https://www.baeldung.com/spring-value-annotation)

This tutorial outlined the steps to define and inject custom application properties in a Spring Boot application. By utilizing the `application.properties` file and the `@Value` annotation, you can externalize configuration and make your application flexible and easy to configure for different environments. Remember to pay attention to the syntax and ensure your property names are consistent across your application.

# Examples

Certainly! Let's dive into two simple examples that illustrate how to define and inject custom application properties in a Spring Boot application.

### Example 1: Injecting a Simple Greeting Message

In this example, we'll configure a Spring Boot application to return a custom greeting message through a REST endpoint.

#### Step 1: Define the Property

In `src/main/resources/application.properties`, add the following property:

```properties
greeting.message=Hello, Spring Boot!
```

#### Step 2: Create a Rest Controller

Create a new Java class `GreetingController` with the following content:

```java
package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @Value("${greeting.message}")
    private String greetingMessage;

    @GetMapping("/greeting")
    public String getGreeting() {
        return greetingMessage;
    }
}
```

This controller injects the `greeting.message` property and returns it when the `/greeting` endpoint is accessed.

### Example 2: Configuring Database Connection Details

In this second example, we'll demonstrate how to configure and inject database connection details into a Spring Boot application.

#### Step 1: Define the Properties

Add the following properties to your `application.properties` file:

```properties
database.url=jdbc:mysql://localhost:3306/mydb
database.username=myuser
database.password=mypassword
```

#### Step 2: Configure a DataSource Bean

Create a configuration class `DatabaseConfig` to inject these properties into a DataSource bean:

```java
package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
public class DatabaseConfig {

    @Value("${database.url}")
    private String databaseUrl;

    @Value("${database.username}")
    private String databaseUsername;

    @Value("${database.password}")
    private String databasePassword;

    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setUrl(databaseUrl);
        dataSource.setUsername(databaseUsername);
        dataSource.setPassword(databasePassword);
        return dataSource;
    }
}
```

This configuration class uses the `@Value` annotation to inject the database properties into a `DataSource` bean, configuring it with the URL, username, and password defined in `application.properties`.

### Running Your Application

For both examples, after defining your properties and creating the respective classes, run your Spring Boot application. You can then:

- For Example 1: Access `localhost:8080/greeting` in your web browser or API client to see the custom greeting message.
- For Example 2: The application won't expose a new endpoint, but the `DataSource` bean will be configured with your custom database properties, ready for use in database operations.

These examples demonstrate the flexibility and power of Spring Boot's property injection mechanism, enabling easy configuration and customization of application behavior and external resources.



# 02.03.2024


# Spring Boot Configuration Git Documentation

This documentation is based on video transcripts provided, focusing on configuring Spring Boot applications through properties. It aims to enhance understanding by breaking down concepts, providing clear explanations, and incorporating examples for practical application.

## Introduction

- Spring Boot simplifies Java application development by providing defaults and auto-configuration options.
- Configuration is primarily done via the `application.properties` or `application.yml` files.
- Over 1000 properties are available, categorized into Core, Web, Security, Data, Actuator, Integration, DevTools, and Testing.
- Key operations include setting server ports, context paths, logging levels, and security settings.

## Key Concepts

### 1. Spring Boot Properties
- Central to customizing Spring Boot behavior.
- Can be overwhelming but are well-organized and documented.

### 2. Core Properties
- Focus on fundamental aspects like logging configurations.

### 3. Web Properties
- Include server port, context path, and session timeout settings.

### 4. Actuator Properties
- Control actuator endpoints, including security and visibility.

### 5. Security Properties
- Basic security settings for user name and password customization.

### 6. Data Properties
- Configuration for database connections, including URLs and credentials.

## Detailed Explanations and Examples

### Configuring Core Properties

#### Logging Level Configuration
- Use `application.properties` to set logging levels per package.
- Example:
  ```properties
  logging.level.org.springframework=DEBUG
  logging.level.org.hibernate=TRACE
  logging.level.com.luv2code=INFO
  ```
- Controls the verbosity of logs from various components.

#### Logging Output Configuration
- Direct log output to a file.
- Example:
  ```properties
  logging.file.name=my-crazy-stuff.log
  ```

### Configuring Web Properties

#### Server Port
- Default port is 8080; customize with `server.port`.
- Example:
  ```properties
  server.port=7070
  ```

#### Context Path
- Default is "/", but can be customized for application routing.
- Example:
  ```properties
  server.servlet.context-path=/mycoolapp
  ```
- http://localhost:7070/mycoolapp/teaminfo

### Actuator Endpoint Configuration

#### Include/Exclude Endpoints
- Customize visible Actuator endpoints.
- Example:
  ```properties
  management.endpoints.web.exposure.include=*
  management.endpoints.web.exposure.exclude=beans,mappings
  ```

#### Base Path Customization
- Default base path is `/actuator`.
- Example:
  ```properties
  management.endpoints.web.base-path=/admin
  ```

### Configuring Security Properties

#### Custom User Name and Password
- Override default security settings.
- Example:
  ```properties
  spring.security.user.name=admin
  spring.security.user.password=topsecret
  ```

### Configuring Data Properties

#### Database Connection
- Set JDBC URL, username, and password.
- Example:
  ```properties
  spring.datasource.url=jdbc:mysql://localhost:3306/ecommerce
  spring.datasource.username=scott
  spring.datasource.password=tiger
  ```

## Common Questions and Answers

- **Q: How do I change the server port for my Spring Boot application?**
  - A: Modify the `server.port` property in `application.properties`.
  
- **Q: Can I set logging levels for specific packages?**
  - A: Yes, use the `logging.level.<package>=<level>` format in `application.properties`.

- **Q: How do I customize Actuator endpoint visibility?**
  - A: Use `management.endpoints.web.exposure.include` and `.exclude` properties.

## Additional Resources

- **Spring Boot Official Documentation:** [Spring Boot Docs](https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/)
- **Spring Boot Properties Guide:** [Common Properties](https://www.luv2code.com/spring-boot-props)
- **Spring Boot Logging Configuration:** [Logging Guide](https://www.luv2code.com/spring-boot-logging)

This Git documentation aims to be a comprehensive guide for configuring Spring Boot applications, incorporating detailed explanations, practical examples, and addressing common configurations and issues. It should serve as a valuable resource for developers seeking to understand and leverage Spring Boot's extensive customization capabilities.
