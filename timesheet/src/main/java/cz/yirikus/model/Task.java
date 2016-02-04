package cz.yirikus.model;

/**
 * Model representing a task
 */
public class Task implements Comparable<Task>{
    /**
     * label of task displayed to user
     */
    private String label;

    /**
     * Work type, for example: analysis, development, consulting...
     */
    private String workType;

    /**
     * Scope of task, for example number of release.
     */
    private String scope;

    /**
     * If false, user will not see it in timesheet combobox
     */
    private boolean active;

    public Task(String label, String workType, String scope) {
        this.label = label;
        this.workType = workType;
        this.scope = scope;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getLabel() {
        return label;
    }

    public void setWorkType(String workType) {
        this.workType = workType;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public String getWorkType() {
        return workType;
    }

    public String getScope() {
        return scope;
    }

    public boolean isActive() {
        return active;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Task task = (Task) o;

        if (label != null ? !label.equals(task.label) : task.label != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return label != null ? label.hashCode() : 0;
    }

    @Override
    public int compareTo(Task o) {
        return label.compareTo(o.getLabel());
    }
}
