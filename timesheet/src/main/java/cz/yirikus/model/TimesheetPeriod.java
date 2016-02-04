package cz.yirikus.model;

import java.time.LocalDate;
import java.time.YearMonth;
import java.time.temporal.ChronoField;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * Model of a month period
 */
public class TimesheetPeriod implements Comparable<TimesheetPeriod>{

    private LocalDate firstDay;
    private YearMonth yearMonth;

    public TimesheetPeriod() {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.DAY_OF_MONTH,1);
        int periodMonth = cal.get(Calendar.MONTH);
        int periodYear = cal.get(Calendar.YEAR);
        firstDay = LocalDate.of(periodYear, periodMonth, 1);
        //firstDay.get(ChronoField.DAY_OF_WEEK);
        yearMonth = YearMonth.now();

        cal.getTime();
    }

    /**
     * Creates period set to given month and year
     * @param periodMonth month, values: 0 - 11
     * @param periodYear year
     */
    public TimesheetPeriod(int periodMonth, int periodYear) {
        yearMonth = YearMonth.of(periodYear, periodMonth);
    }

    public int getPeriodMonth() {
        return yearMonth.getMonth().getValue();
    }

    public int getPeriodYear() {
        return yearMonth.getYear();
    }

    public LocalDate getFirstDay() {
        return firstDay;
    }

    public YearMonth getYearMonth() {
        return yearMonth;
    }

    @Override
    public int compareTo(TimesheetPeriod o) {
        return (getPeriodYear()*100 + getPeriodMonth()) - (o.getPeriodYear()*100 + o.getPeriodMonth());
    }
}
