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
