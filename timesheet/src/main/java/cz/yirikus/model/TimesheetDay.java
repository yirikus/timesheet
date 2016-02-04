package cz.yirikus.model;

import java.time.LocalDate;
import java.util.List;

/**
 * Date with all tasks worked on that day
 */
public class TimesheetDay implements Comparable<TimesheetDay>, Summable{
    private LocalDate date;
    List<TrackedTask> trackedTasks;

    public TimesheetDay(LocalDate date) {
        this.date = date;
    }

    public LocalDate getDate() {
        return date;
    }

    public List<TrackedTask> getTrackedTasks() {
        return trackedTasks;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TimesheetDay that = (TimesheetDay) o;

        if (date != null ? !date.equals(that.date) : that.date != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return date != null ? date.hashCode() : 0;
    }

    @Override
    public int compareTo(TimesheetDay o) {
        return date.compareTo(o.getDate());
    }

    @Override
    public long sum() {
        long sum = 0;
        for(TrackedTask task : trackedTasks) {
            sum += task.getTimeTracked();
        }
        return sum;
    }
}
