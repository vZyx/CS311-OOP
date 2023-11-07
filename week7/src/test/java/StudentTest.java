/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Ziyad
 */
public class StudentTest {
    
    public StudentTest() {
    }

    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of setID method, of class Student.
     */
    @org.junit.jupiter.api.Test
    public void testSetID() {
        System.out.println("setID");
        String ID = "";
        Student instance = new Student();
        instance.setID(ID);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getID method, of class Student.
     */
    @org.junit.jupiter.api.Test
    public void testGetID() {
        System.out.println("getID");
        Student instance = new Student();
        String expResult = "";
        String result = instance.getID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFirstName method, of class Student.
     */
    @org.junit.jupiter.api.Test
    public void testSetFirstName() {
        System.out.println("setFirstName");
        String FirstName = "";
        Student instance = new Student();
        instance.setFirstName(FirstName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFirstName method, of class Student.
     */
    @org.junit.jupiter.api.Test
    public void testGetFirstName() {
        System.out.println("getFirstName");
        Student instance = new Student();
        String expResult = "";
        String result = instance.getFirstName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLastName method, of class Student.
     */
    @org.junit.jupiter.api.Test
    public void testSetLastName() {
        System.out.println("setLastName");
        String LastName = "";
        Student instance = new Student();
        instance.setLastName(LastName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLastName method, of class Student.
     */
    @org.junit.jupiter.api.Test
    public void testGetLastName() {
        System.out.println("getLastName");
        Student instance = new Student();
        String expResult = "";
        String result = instance.getLastName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setGPA method, of class Student.
     */
    @org.junit.jupiter.api.Test
    public void testSetGPA() {
        System.out.println("setGPA");
        float GPA = 0.0F;
        Student instance = new Student();
        instance.setGPA(GPA);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getGPA method, of class Student.
     */
    @org.junit.jupiter.api.Test
    public void testGetGPA() {
        System.out.println("getGPA");
        Student instance = new Student();
        double expResult = 0.0;
        double result = instance.getGPA();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBDate method, of class Student.
     */
    @org.junit.jupiter.api.Test
    public void testSetBDate() {
        System.out.println("setBDate");
        Object BDate = null;
        Student instance = new Student();
        instance.setBDate(BDate);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBDate method, of class Student.
     */
    @org.junit.jupiter.api.Test
    public void testGetBDate() {
        System.out.println("getBDate");
        Student instance = new Student();
        Object expResult = null;
        Object result = instance.getBDate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setQualification method, of class Student.
     */
    @org.junit.jupiter.api.Test
    public void testSetQualification() {
        System.out.println("setQualification");
        StudyProgram program = null;
        Student instance = new Student();
        instance.setQualification(program);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getQualification method, of class Student.
     */
    @org.junit.jupiter.api.Test
    public void testGetQualification() {
        System.out.println("getQualification");
        Student instance = new Student();
        StudyProgram expResult = null;
        StudyProgram result = instance.getQualification();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class Student.
     */
    @org.junit.jupiter.api.Test
    public void testGetName() {
        System.out.println("getName");
        Student instance = new Student();
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAge method, of class Student.
     */
    @org.junit.jupiter.api.Test
    public void testGetAge() {
        System.out.println("getAge");
        Student instance = new Student();
        int expResult = 0;
        int result = instance.getAge();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateGPA method, of class Student.
     */
    @org.junit.jupiter.api.Test
    public void testUpdateGPA() {
        System.out.println("updateGPA");
        float newGPA = 0.0F;
        Student instance = new Student();
        instance.updateGPA(newGPA);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
