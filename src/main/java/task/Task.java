package task;

import javax.print.DocFlavor;

/**
 * Represents a Task in the list kept by Duke
 */
public abstract class Task {
    protected String description;
    protected boolean isDone;
    private static int numberOfTasksInList;
    /**
     * Creates a new Task with the given description
     * Default value for isDone is false
     *
     * @param description of the Task created
     */
    public Task(String description) {
        this.description = description;
        this.isDone = false;
        numberOfTasksInList++;
    }

    public static int getNumberOfTasksInList() {
        return numberOfTasksInList;
    }

    public static void reduceNumberOfTaskInList() {
        numberOfTasksInList--;
    }

    /**
     * Get the status of isDone of the Task and returns an icon
     *
     * @return tick or cross icon
     */
    public String getStatusIcon() {
        return (isDone ? "[\u2713]" : "[\u2718]"); //return tick or X symbols
    }

    /**
     * Changes the boolean isDone to true
     */
    public void markAsDone() {
        this.isDone = true;
    }

    @Override
    public abstract String toString();

    /**
     * Print done response message
     */
    public abstract String getDoneResponseMessage(int itemIndexRequested);

    /**
     * get description of Task
     *
     * @return description of Task
     */
    public String getDescription() {
        return description;
    }

    public String isDone() {
        return (isDone ? "[Y]" : "[N]");
    }

    public abstract String getEventType();

    public abstract String getTaskTime();
}