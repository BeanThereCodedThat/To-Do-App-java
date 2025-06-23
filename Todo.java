public class Todo 
{
    private static int count = 0;
    private int id;
    private String task;

    public Todo(String task) 
    {
        this.task = task;
        this.id = ++count;
    }

    public int getId() 
    {
        return id;
    }

    public String getTask() 
    {
        return task;
    }

    @Override
    public String toString() 
    {
        return id + ". " + task;
    }
}
