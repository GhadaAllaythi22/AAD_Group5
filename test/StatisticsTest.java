/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
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
public class StatisticsTest {
    public Statistics instance;
    public StatisticsTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        instance= new Statistics();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of setTotalVolunteers method, of class Statistics.
     */
//    @Test
//    public void testSetTotalVolunteers() {
//        System.out.println("setTotalVolunteers");
//        int totalVolunteers = 0;
//        Statistics instance = new Statistics();
//        instance.setTotalVolunteers(totalVolunteers);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of setTotalWorkHours method, of class Statistics.
     */
//    @Test
//    public void testSetTotalWorkHours() {
//        System.out.println("setTotalWorkHours");
//        ArrayList<Volunteer> volunteers = null;
//        Statistics instance = new Statistics();
//        instance.setTotalWorkHours(volunteers);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of getTotalVolunteers method, of class Statistics.
     */
//    @Test
//    public void testGetTotalVolunteers() {
//        System.out.println("getTotalVolunteers");
//        Statistics instance = new Statistics();
//        int expResult = 0;
//        int result = instance.getTotalVolunteers();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of getTotalWorkHours method, of class Statistics.
     */
//    @Test
//    public void testGetTotalWorkHours() {
//        System.out.println("getTotalWorkHours");
//        Statistics instance = new Statistics();
//        int expResult = 0;
//        int result = instance.getTotalWorkHours();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of CountVolunteerInCity method, of class Statistics.
     */
    // Maha testig for sprit 6
/*
   //    in this test method, it verifies the correctness of
    the CountVolunteerInCity method, which counts and displays the number of volunteers 
    in each city. first create an output then creates two Volunteer objects with the same 
    city "Jeddah", adds them to a list, and calls the CountVolunteerInCity method with the 
    list as an argument. Finally, it asserts that the output string matches the expected string,
    which contains the number of volunteers in each city. iin this test ensures that the CountVolunteerInCity 
    method correctly counts and displays the number of volunteers in each city based on the given data.
    */    
    @Test
    public void testCountVolunteerInCity6() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        
        Volunteer v1=new Volunteer("Maha", "Ali","F", "1", "1", "11", "05", "mm", "donor", "1", "3", "Jeddah");
        Volunteer v2=new Volunteer("Maya", "Ali","F", "1", "1", "11", "05", "mm", "donor", "1", "3", "Jeddah");
        
        ArrayList<Volunteer> volunteers = new ArrayList<>();
        volunteers.add(v1);
        volunteers.add(v2);
        
        instance.CountVolunteerInCity(volunteers);
        
        String expectedResult = ("Jeddah" + "\t" + "2"+System.lineSeparator()+"Mecca" + "\t" + "0"+System.lineSeparator()+"Yanbu" + "\t" + "0"+System.lineSeparator()+"Hail" + "\t" + "0"+System.lineSeparator()+"Dammam" + "\t" + "0"+System.lineSeparator()+"Riyadh" + "\t" + "0"+System.lineSeparator());
        assertEquals(expectedResult, out.toString());
                
        
        
            }


    
}
