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
public class StudyProgramTest {
    
    public StudyProgramTest() {
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
     * Test of getMajor method, of class StudyProgram.
     */
    @org.junit.jupiter.api.Test
    public void testGetMajor() {
        System.out.println("getMajor");
        StudyProgram instance = new StudyProgram();
        String expResult = "";
        String result = instance.getMajor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDegree method, of class StudyProgram.
     */
    @org.junit.jupiter.api.Test
    public void testGetDegree() {
        System.out.println("getDegree");
        StudyProgram instance = new StudyProgram();
        String expResult = "";
        String result = instance.getDegree();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getGradYear method, of class StudyProgram.
     */
    @org.junit.jupiter.api.Test
    public void testGetGradYear() {
        System.out.println("getGradYear");
        StudyProgram instance = new StudyProgram();
        int expResult = 0;
        int result = instance.getGradYear();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class StudyProgram.
     */
    @org.junit.jupiter.api.Test
    public void testToString() {
        System.out.println("toString");
        StudyProgram instance = new StudyProgram();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
