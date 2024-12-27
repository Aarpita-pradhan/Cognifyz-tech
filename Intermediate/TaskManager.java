import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Task {
    private int id;
    private String title;
    private String description;
    private boolean isCompleted;

    public Task(int id, String title, String description) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.isCompleted = false;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Title: " + title + ", Description: " + description + ", Completed: " + isCompleted;
    }
}

public class TaskManager {
    private static List<Task> tasks = new ArrayList<>();
    private static int nextId = 1;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nTask Manager");
            System.out.println("1. Create Task");
            System.out.println("2. Read Tasks");
            System.out.println("3. Update Task");
            System.out.println("4. Delete Task");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    createTask(scanner);
                    break;
                case "2":
                    readTasks();
                    break;
                case "3":
                    updateTask(scanner);
                    break;
                case "4":
                    deleteTask(scanner);
                    break;
                case "5":
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        }
    }

    private static void createTask(Scanner scanner) {
        System.out.print("Enter task title: ");
        String title = scanner.nextLine();
        System.out.print("Enter task description: ");
        String description = scanner.nextLine();

        Task newTask = new Task(nextId++, title, description);
        tasks.add(newTask);
        System.out.println("Task created successfully.");
    }

    private static void readTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks available.");
            return;
        }

        System.out.println("\nTasks:");
        for (Task task : tasks) {
            System.out.println(task);
        }
    }

    private static void updateTask(Scanner scanner) {
        System.out.print("Enter task ID to update: ");
        if (scanner.hasNextInt()) {
            int id = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            Task taskToUpdate = tasks.stream().filter(t -> t.getId() == id).findFirst().orElse(null);
            if (taskToUpdate != null) {
                System.out.print("Enter new title (leave blank to keep current): ");
                String newTitle = scanner.nextLine();
                System.out.print("Enter new description (leave blank to keep current): ");
                String newDescription = scanner.nextLine();

                if (!newTitle.isEmpty()) {
                    taskToUpdate.setTitle(newTitle);
                }
                if (!newDescription.isEmpty()) {
                    taskToUpdate.setDescription(newDescription);
                }

                System.out.println("Task updated successfully.");
            } else {
                System.out.println("Task not found.");
            }
        } else {
            System.out.println("Invalid ID.");
            scanner.nextLine(); // Consume invalid input
        }
    }

    private static void deleteTask(Scanner scanner) {
        System.out.print("Enter task ID to delete: ");
        if (scanner.hasNextInt()) {
            int id = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            Task taskToDelete = tasks.stream().filter(t -> t.getId() == id).findFirst().orElse(null);
            if (taskToDelete != null) {
                tasks.remove(taskToDelete);
                System.out.println("Task deleted successfully.");
            } else {
                System.out.println("Task not found.");
            }
        } else {
            System.out.println("Invalid ID.");
            scanner.nextLine(); // Consume invalid input
        }
    }
}
