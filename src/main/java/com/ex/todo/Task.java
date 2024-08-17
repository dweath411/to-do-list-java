package com.example.todo;

/**
 * This class represents a Task in the To-Do List application.
 * Each task has a description that details what the task is.
 */
public class Task {

    // A private field that holds the description of the task
    private String description;

    /**
     * Constructor that initializes the task with a description.
     * 
     * @param description A string representing the task's description.
     */
    public Task(String description) {
        this.description = description;  // Assigns the provided description to the task
    }

    /**
     * Getter method for the description.
     * 
     * @return The description of the task.
     */
    public String getDescription() {
        return description;  // Returns the description of the task
    }

    /**
     * Setter method for the description.
     * 
     * @param description A new description to update the task with.
     */
    public void setDescription(String description) {
        this.description = description;  // Updates the task's description with the provided value
    }
}
