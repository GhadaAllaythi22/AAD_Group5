/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author DELL
 */
public class MangerTest {
    
    public MangerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of setReportID method, of class Manger.
     */
    @Test
    public void testSetReportID() {
        System.out.println("setReportID");
        String reportID = "";
        Manger instance = null;
        instance.setReportID(reportID);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNumberOfVoluntters method, of class Manger.
     */
    @Test
    public void testSetNumberOfVoluntters() {
        System.out.println("setNumberOfVoluntters");
        int numberOfVoluntters = 0;
        Manger instance = null;
        instance.setNumberOfVoluntters(numberOfVoluntters);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNumberOfDonors method, of class Manger.
     */
    @Test
    public void testSetNumberOfDonors() {
        System.out.println("setNumberOfDonors");
        int numberOfDonors = 0;
        Manger instance = null;
        instance.setNumberOfDonors(numberOfDonors);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setActivityStatistics method, of class Manger.
     */
    @Test
    public void testSetActivityStatistics() {
        System.out.println("setActivityStatistics");
        String[] activityStatistics = null;
        Manger instance = null;
        instance.setActivityStatistics(activityStatistics);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCurrentDate method, of class Manger.
     */
    @Test
    public void testSetCurrentDate() {
        System.out.println("setCurrentDate");
        Date currentDate = null;
        Manger.setCurrentDate(currentDate);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumberOfVoluntters method, of class Manger.
     */
    @Test
    public void testGetNumberOfVoluntters() {
        System.out.println("getNumberOfVoluntters");
        Manger instance = null;
        int expResult = 0;
        int result = instance.getNumberOfVoluntters();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getReportID method, of class Manger.
     */
    @Test
    public void testGetReportID() {
        System.out.println("getReportID");
        Manger instance = null;
        String expResult = "";
        String result = instance.getReportID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumberOfDonors method, of class Manger.
     */
    @Test
    public void testGetNumberOfDonors() {
        System.out.println("getNumberOfDonors");
        Manger instance = null;
        int expResult = 0;
        int result = instance.getNumberOfDonors();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getActivityStatistics method, of class Manger.
     */
    @Test
    public void testGetActivityStatistics() {
        System.out.println("getActivityStatistics");
        Manger instance = null;
        String[] expResult = null;
        String[] result = instance.getActivityStatistics();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCurrentDate method, of class Manger.
     */
    @Test
    public void testGetCurrentDate() {
        System.out.println("getCurrentDate");
        Date expResult = null;
        Date result = Manger.getCurrentDate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of viewStatistics method, of class Manger.
     */
    @Test
    public void testViewStatistics() {
        System.out.println("viewStatistics");
        ArrayList<Volunteer> volunteers = null;
        Manger.viewStatistics(volunteers);
        assertNotNull(this);
    }
    
}
