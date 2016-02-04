package cz.yirikus.service;

import cz.yirikus.model.Timesheet;

import java.time.YearMonth;

/**
 * Service that provides access to a model
 */
public class TimesheetService {
    private static final TimesheetService instance = new TimesheetService();
    private Timesheet timesheet = new Timesheet();

    private TimesheetService(){

    }

    public static TimesheetService instance() {
        return instance;
    }

    public void initTimesheet() {
        timesheet.addPeriod(YearMonth.now());
    }

    public Timesheet getTimesheet() {
        return timesheet;
    }
}
