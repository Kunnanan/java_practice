import java.util.ArrayList;
import java.util.Scanner;

public class ToDoListApp {
    private static ArrayList<String> tasks = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.println("=== Welcome to To-Do List Application ===");
        
        while (true) {
            displayMenu();
            int choice = getUserChoice();
            
            switch (choice) {
                case 1:
                    addTask();
                    break;
                case 2:
                    displayTasks();
                    break;
                case 3:
                    removeTask();
                    break;
                case 4:
                    exitApplication();
                    return;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
    
    // Display the main menu
    private static void displayMenu() {
        System.out.println("\n--- To-Do List Menu ---");
        System.out.println("1. Add new task");
        System.out.println("2. Display all tasks");
        System.out.println("3. Remove a task");
        System.out.println("4. Exit application");
        System.out.print("Enter your choice (1-4): ");
    }
    
    // Get user's menu choice with input validation
    private static int getUserChoice() {
        try {
            return Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            return -1; // Invalid input
        }
    }
    
    // Add a new task to the list
    private static void addTask() {
        System.out.print("Enter the task description: ");
        String task = scanner.nextLine().trim();
        
        if (!task.isEmpty()) {
            tasks.add(task);
            System.out.println("Task added successfully!");
        } else {
            System.out.println("Task cannot be empty!");
        }
    }
    
    // Display all tasks in the list
    private static void displayTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks in your to-do list.");
            return;
        }
        
        System.out.println("\n--- Your Tasks ---");
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i + 1) + ". " + tasks.get(i));
        }
    }
    
    // Remove a task by index or name
    private static void removeTask() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks to remove.");
            return;
        }
        
        displayTasks();
        System.out.println("\nChoose removal method:");
        System.out.println("1. Remove by number");
        System.out.println("2. Remove by task name");
        System.out.print("Enter your choice (1-2): ");
        
        int method = getUserChoice();
        
        switch (method) {
            case 1:
                removeByIndex();
                break;
            case 2:
                removeByName();
                break;
            default:
                System.out.println("Invalid choice!");
        }
    }
    
    // Remove task by index
    private static void removeByIndex() {
        System.out.print("Enter task number to remove: ");
        int index = getUserChoice();
        
        if (index >= 1 && index <= tasks.size()) {
            String removedTask = tasks.remove(index - 1);
            System.out.println("Removed task: " + removedTask);
        } else {
            System.out.println("Invalid task number!");
        }
    }
    
    // Remove task by name
    private static void removeByName() {
        System.out.print("Enter task name to remove: ");
        String taskName = scanner.nextLine().trim();
        
        boolean removed = tasks.remove(taskName);
        if (removed) {
            System.out.println("Task removed successfully!");
        } else {
            System.out.println("Task not found!");
        }
    }
    
    // Exit the application gracefully
    private static void exitApplication() {
        System.out.println("Thank you for using To-Do List Application!");
        System.out.println("Goodbye!");
        scanner.close();
    }
}