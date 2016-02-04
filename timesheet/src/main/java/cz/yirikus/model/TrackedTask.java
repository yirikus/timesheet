package cz.yirikus.model;

/**
 * Model of a task nad time worked on this task
 */
public class TrackedTask {
    private long timeTracked;
    private Task task;

    public long getTimeTracked() {
        return timeTracked;
    }

    public Task getTask() {
        return task;
    }

    public void setTimeTracked(long timeTracked) {
        this.timeTracked = timeTracked;
    }

    public void addTime(long timeToAdd) {
        this.timeTracked += timeToAdd;
    }
}
