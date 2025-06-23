import java.util.*;

public class TodoManager {
    private List<Todo> todos = new ArrayList<>();

    public void addTask(String task) {
        todos.add(new Todo(task));
        System.out.println("Task added successfully!");
    }

    public void viewTasks() {
        if (todos.isEmpty()) {
            System.out.println("No tasks available.");
            return;
        }
        System.out.println("\nCurrent Tasks:");
        for (Todo todo : todos) {
            System.out.println(todo);
        }
    }

    public boolean deleteTask(int id) {
        boolean removed = todos.removeIf(todo -> todo.getId() == id);
        return removed;
    }
}
