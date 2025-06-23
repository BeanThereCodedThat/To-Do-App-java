public class Todo {
    private static int count = 0;  // Tracks the last assigned task ID
    private final int id;           // Unique ID for each task
    private final String task;      // Task description

    public Todo(String task) {
        this.task = task;
        this.id = ++count;          // Increment count and assign unique ID
    }

    public int getId() {
        return id;
    }

    public String getTask() {
        return task;
    }

    @Override
    public String toString() {
        return id + ". " + task;
    }
}
