package com.example.todo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * This is the main entry point for the Simple To-Do List Web Application.
 * It uses Spring Boot to set up the application and start the embedded server.
 */
@SpringBootApplication
public class ToDoWebApp {

    /**
     * The main method is the entry point of the Java application.
     * It runs the Spring Boot application, which initializes and starts the web server.
     * 
     * @param args Command-line arguments (not used in this application).
     */
    public static void main(String[] args) {
        // This line launches the Spring Boot application, setting up the context and server
        SpringApplication.run(ToDoWebApp.class, args);
    }
}
