import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TodoManager manager = new TodoManager();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- TO-DO LIST ---");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Delete Task");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            // Check if input is an integer
            if (!sc.hasNextInt()) {
                System.out.println("Please enter a valid number.");
                sc.next(); // consume invalid input
                continue;
            }
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter task: ");
                    String task = sc.nextLine();
                    if (task.trim().isEmpty()) {
                        System.out.println("Task cannot be empty!");
                    } else {
                        manager.addTask(task);
                        System.out.println("Task added successfully.");
                    }
                    break;
                case 2:
                    manager.viewTasks();
                    break;
                case 3:
                    System.out.print("Enter task ID to delete: ");
                    if (!sc.hasNextInt()) {
                        System.out.println("Please enter a valid task ID.");
                        sc.next(); // consume invalid input
                    } else {
                        int id = sc.nextInt();
                        sc.nextLine();
                        boolean deleted = manager.deleteTask(id);
                        if (deleted) {
                            System.out.println("Task deleted successfully.");
                        } else {
                            System.out.println("Task ID not found.");
                        }
                    }
                    break;
                case 4:
                    System.out.println("Exiting... Goodbye!");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
