/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author user
 */
public class VolunteerTest {
    
    public ArrayList<Volunteer> volunteersT;
    
    public VolunteerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        // Initialize the shared ArrayList for all tests
        volunteersT = new ArrayList<>();
        
//the constrecter of the volunteer  (String fname, String lname,String gender, String id, String password, String location, String phoneNumber, String email, String typeofvolunteer, String date, int workhoursnumber, String City) 
        volunteersT.add(new Volunteer("Bayan", "Alharbi", "Female","1", "12", "Jeddah", "050", "balharbi0398@stu.kau.edu.sa", "Environmental conservation", "15/10/2024", "30", "Jeddah"));
        volunteersT.add(new Volunteer("Bayan", "Alharbi", "Female","1", "12", "Jeddah", "050", "balharbi0398@stu.kau.edu.sa", "Environmental conservation", "15/10/2024", "13", "Jeddah")); //same person with new workhoursnumber
        volunteersT.add(new Volunteer("Hanin", "Aldosari", "Female","12", "123", "Jeddah", "050", "Hanin@stu.kau.edu.sa", "Environmental", "15/10/2024", "25", "Jeddah"));

        
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of setTypeofvolunteer method, of class Volunteer.
     */
    @Test
    public void testSetTypeofvolunteer() {
        System.out.println("setTypeofvolunteer");
        String typeofvolunteer = "";
        Volunteer instance = null;
        instance.setTypeofvolunteer(typeofvolunteer);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDate method, of class Volunteer.
     */
    @Test
    public void testSetDate() {
        System.out.println("setDate");
        String date = "";
        Volunteer instance = null;
        instance.setDate(date);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setWorkhoursnumber method, of class Volunteer.
     */
    @Test
    public void testSetWorkhoursnumber() {
        System.out.println("setWorkhoursnumber");
        String workhoursnumber ="0";
        Volunteer instance = null;
        instance.setWorkhoursnumber(workhoursnumber);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTypeofvolunteer method, of class Volunteer.
     */
    @Test
    public void testGetTypeofvolunteer() {
        System.out.println("getTypeofvolunteer");
        Volunteer instance = null;
        String expResult = "";
        String result = instance.getTypeofvolunteer();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDate method, of class Volunteer.
     */
    @Test
    public void testGetDate() {
        System.out.println("getDate");
        Volunteer instance = null;
        String expResult = "";
        String result = instance.getDate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getWorkhoursnumber method, of class Volunteer.
     */
    @Test
    public void testGetWorkhoursnumber() {
        System.out.println("getWorkhoursnumber");
        Volunteer instance = null;
        String expResult = "0";
        String result = instance.getWorkhoursnumber();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCity method, of class Volunteer.
     */
    @Test
    public void testGetCity() {
        System.out.println("getCity");
        Volunteer instance = null;
        String expResult = "";
        String result = instance.getCity();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of volunteeringRequest method, of class Volunteer.
     */
    @Test
    public void testVolunteeringRequest() {
        System.out.println("volunteeringRequest");
       ArrayList<Volunteer> volunteers = new ArrayList<>();
       volunteers.add(new Volunteer("Hadeel", "Alweldi", "Female","2", "H12345", "Jeddah", "051", "hadeel@gmail.com", "Medical", "1/5/2024", "22", "Jeddah"));
       
       String []input ={"Yes","Medical","22","1/5/2024","Jeddah"};
       
        assertEquals(1, volunteers.size());
        Volunteer volunteer = volunteers.get(0);
        assertEquals(input[1], volunteer.getTypeofvolunteer());
        assertEquals(input[2], volunteer.getWorkhoursnumber());
        assertEquals(input[3], volunteer.getDate());
        assertEquals(input[4], volunteer.getCity());  
    }

    /**
     * Test of CountVolunteerHoursWorking method, of class Volunteer.
     */
    @Test
    public void testCountVolunteerHoursWorking() {
        System.out.println("CountVolunteerHoursWorking");
        //testing data
        String id = "1"; //bayan's id
        //expexted data 
        int expResult = 43; //30+13 =43
        
        
        int result = Volunteer.CountVolunteerHoursWorking(id, volunteersT); // used the class neme to call it because its static method .
        assertEquals(expResult, result);
        
    }
    
 
    
}
