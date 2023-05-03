package org.launchcode.techjobs.oo.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;

import static org.junit.Assert.*;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {
    @Test
    public void testSettingJobId() {
    Job test_Job = new Job();
    Job test_Job1 = new Job();
    assertNotEquals(test_Job, test_Job1);
    }
    @Test
    public void testJobConstructorSetsAllFields() {
        Job test_Job3 = new Job("Product tester",
                new Employer("ACME"),
                new Location("Desert"),
                new PositionType("Quality control"),
                new CoreCompetency("Persistence"));
//        assertTrue(test_Job3.getJob() instanceof Job);
//        assertEquals("Product tester", test_Job3.getJob().getValue());

        assertTrue(test_Job3.getEmployer() instanceof Employer);
        assertEquals("ACME", test_Job3.getEmployer().getValue());

        assertTrue(test_Job3.getLocation() instanceof Location);
        assertEquals("Desert", test_Job3.getLocation().getValue() );

        assertTrue(test_Job3.getPositionType() instanceof PositionType);
        assertEquals("Quality control", test_Job3.getPositionType().getValue());

        assertTrue(test_Job3.getCoreCompetency() instanceof CoreCompetency);
        assertEquals("Persistence", test_Job3.getCoreCompetency().getValue());
    }
    @Test
    public void testJobsForEquality() {
        Job test_job1 = new Job("ACME");
        Job test_job2 = new Job("ACME");
        assertFalse(test_job1.equals(test_job2));
    }
}
