package cz.yirikus;

import cz.yirikus.model.TimesheetPeriod;
import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class TimesheetPeriodTest {
    @Test
     public void testCompare(){
        Assert.assertTrue(new TimesheetPeriod(1, 2000).compareTo(
                          new TimesheetPeriod(1, 2000)) == 0);

        Assert.assertTrue(new TimesheetPeriod(12, 1999).compareTo(
                new TimesheetPeriod(1, 2000)) < 0);

        Assert.assertTrue(new TimesheetPeriod(2, 2000).compareTo(
                new TimesheetPeriod(1, 2000)) > 0);
    }

}
