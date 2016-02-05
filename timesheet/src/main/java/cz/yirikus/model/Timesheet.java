package cz.yirikus.model;

import java.time.LocalDate;
import java.time.YearMonth;
import java.time.temporal.ChronoUnit;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * Represents timesheet with infinite amount of days
 */
public class Timesheet {
    private SortedSet<TimesheetDay> days = new TreeSet<TimesheetDay>();
    private SortedSet<Task> tasks = new TreeSet<Task>();

    public SortedSet<TimesheetDay> getDays() {
        return days;
    }

    public SortedSet<Task> getTasks() {
        return tasks;
    }

    /**
     * Adds new period if possible
     * @param period
     */
    public void addPeriod(YearMonth period){
        LocalDate firstDay = LocalDate.of(period.getYear(), period.getMonth(), 1);
        if (days.contains(new TimesheetDay(firstDay))) {
            //already added
            return;
        }

        for (int i = 0; i < period.lengthOfMonth(); i++) {
            TimesheetDay day = new TimesheetDay(LocalDate.of(period.getYear(), period.getMonth(), i + 1));
            days.add(day);
        }
    }

    public SortedSet<TimesheetDay> getPeriod(YearMonth period) {
        TimesheetDay from = new TimesheetDay(LocalDate.of(period.getYear(), period.getMonth(), 1));
        YearMonth next = period.plus(1, ChronoUnit.MONTHS);
        TimesheetDay to = new TimesheetDay(LocalDate.of(next.getYear(), next.getMonth(), 1));
        return days.subSet(from, to);
    }
}
