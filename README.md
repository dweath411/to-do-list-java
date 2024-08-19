# to-do-list-java

**Goal:** Create a basic To-Do List web application where users can add, view, and delete tasks. This project will introduce fundamental concepts such as form handling, dynamic content rendering, basic CRUD operations (Create, Read, Delete), and the MVC (Model-View-Controller) pattern.

## Overview
This project is a simple To-Do List web application built with Java and Spring Boot. Users can add, view, and delete tasks. This project is designed to be beginner-friendly, focusing on fundamental web development concepts.

## Features
- **Add Tasks:** Users can add new tasks to the list.
- **View Tasks:** All tasks are displayed in a list.
- **Delete Tasks:** Users can delete tasks from the list.

## Technologies Used
- **Java**
- **Spring Boot**
- **Thymeleaf**
- **HTML/CSS**

## How to Run
1. **Clone the repository:** `git clone https://github.com/yourusername/ToDoWebApp.git`
2. **Navigate to the project directory:** `cd ToDoWebApp`
3. **Build and run the project:** `mvn spring-boot:run`
4. **Access the application:** Open `http://localhost:8080` in your web browser.
### if you re-run the project, you may need to close your terminal, run ‘mvn clean package’ and then rerun ‘mvn-spring-boot:run’

## How It Works
- **Controller:** Handles HTTP requests and manages the list of tasks.
- **Model:** The `Task` class represents a task in the to-do list.
- **View:** HTML templates render the user interface, displaying tasks and forms.

## DIY!
This project can be extended with additional features, such as:
- Editing tasks
- Marking tasks as complete
- Storing tasks in a database

