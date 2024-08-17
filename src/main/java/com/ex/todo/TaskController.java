package com.example.todo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * This controller handles HTTP requests for managing tasks in the To-Do List application.
 * It provides endpoints for adding, viewing, and deleting tasks.
 */
@Controller
@RequestMapping("/tasks") // Base URL for all task-related requests
public class TaskController {

    // A list that holds all the tasks created by the user
    private List<Task> tasks = new ArrayList<>();

    /**
     * Handles GET requests to "/tasks".
     * 
     * @param model The Model object used to pass data to the view.
     * @return The name of the view template ("task_list.html") to be rendered.
     */
    @GetMapping
    public String getTasks(Model model) {
        // Adds the list of tasks to the model so it can be accessed in the view
        model.addAttribute("tasks", tasks);
        return "task_list"; // Returns the "task_list.html" template to display the tasks
    }

    /**
     * Handles POST requests to "/tasks/add" to add a new task.
     * 
     * @param description The description of the task to be added.
     * @return A redirect to the "/tasks" URL to display the updated list of tasks.
     */
    @PostMapping("/add")
    public String addTask(@RequestParam("description") String description) {
        // Creates a new task with the provided description and adds it to the list
        tasks.add(new Task(description));
        return "redirect:/tasks"; // Redirects the user back to the task list page
    }

    /**
     * Handles POST requests to "/tasks/delete" to delete an existing task.
     * 
     * @param description The description of the task to be deleted.
     * @return A redirect to the "/tasks" URL to display the updated list of tasks.
     */
    @PostMapping("/delete")
    public String deleteTask(@RequestParam("description") String description) {
        // Removes the task from the list if its description matches the provided one
        tasks.removeIf(task -> task.getDescription().equals(description));
        return "redirect:/tasks"; // Redirects the user back to the task list page
    }
}
