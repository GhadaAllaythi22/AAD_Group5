/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
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
 * @author LENOVO
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
     * Test of viewStatistics method, of class Manger.
     */
/*  in this test method, it verifies the correctness of the viewStatistics
    method, which displays the statistics of a list of volunteers. first creates a list 
    of Volunteer objects with the same city "Jeddah". then sets up an output  then creates a Manger 
    object and calls the viewStatistics method with the list as an argument.
    Finally, it asserts that the output string matches the expected string, which
    contains the statistics of the volunteers. This test ensures that the viewStatistics method correctly 
    displays the statistics of the volunteers based on the given data."
 */    
    @Test
    public void testViewStatistics() {
         // إعداد البيانات الثابتة للاختبار
        ArrayList<Volunteer> volunteers = new ArrayList<>();
        volunteers.add(new Volunteer("Maha", "Ali","F", "1", "1", "11", "05", "mm", "donor", "1", "3", "Jeddah"));
        volunteers.add(new Volunteer("Halah", "Hamdi","F", "1", "1", "11", "05", "mm", "donor", "1", "3", "Jeddah"));
        volunteers.add(new Volunteer("Alaa", "Ahamed","F", "1", "1", "11", "05", "mm", "donor", "1", "3", "Jeddah"));

        // تحويل الإخراج من الكونسول إلى ByteArrayOutputStream
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        // إعداد الميثود التي سنختبرها
        
        Manger instance = new Manger();
        instance.viewStatistics(volunteers);
   
 
        // التحقق من النتائج المتوقعة
        String expectedOutput =   System.lineSeparator() +
                "-------------------- Statistics -----------------" + System.lineSeparator() +
                "> Number of all Volunteers are : 3" + System.lineSeparator() +
                "-------------------------------------" + System.lineSeparator() +
                "> Number of Volunteers in each City" + System.lineSeparator() +
                "Jeddah"+"\t"+"3" + System.lineSeparator() +
                "Mecca"+"\t"+"0" + System.lineSeparator() +
                "Yanbu"+"\t"+"0" + System.lineSeparator() +
                "Hail"+"\t"+"0" + System.lineSeparator() +
                "Dammam"+"\t"+"0" + System.lineSeparator() +
                "Riyadh"+"\t"+"0" + System.lineSeparator() +
                "-------------------------------------" + System.lineSeparator() +
                "> Total Volunteers's Work Hourse are:9" + System.lineSeparator() +
                "-------------------------------------" + System.lineSeparator();

        assertEquals(expectedOutput,out.toString());
        
        
    }   
    
}


