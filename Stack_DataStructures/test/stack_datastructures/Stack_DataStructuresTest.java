/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack_datastructures;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author chaitali
 */
public class Stack_DataStructuresTest {
    Stack_DataStructures instance;
    
    public Stack_DataStructuresTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
          instance = new Stack_DataStructures(2);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class Stack_DataStructures.
     */
    @Ignore
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Stack_DataStructures.main(args);
    }

    /**
     * Test of push method, of class Stack_DataStructures.
     */
    @Test
    public void testPush() throws Exception {
        char[] tempCharArray = new char[1] ;
        tempCharArray[0] = 'A';
        //assertEquals(1,tempCharArray.length);
        
        System.out.println("Calling push");
        
        instance.push('B');
        assertEquals(1,tempCharArray.length);
        
  
        
    }

    /**
     * 
     * Test of pop method, of class Stack_DataStructures.
     */
    @Test
    public void testPop() throws Exception {
        System.out.println("pop");
        Stack_DataStructures instance = null;
        char expResult = ' ';
        char result = instance.pop();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isStackFull method, of class Stack_DataStructures.
     */
    @Test
    public void testIsStackFull() {
        System.out.println("isStackFull");
        Stack_DataStructures instance = null;
        boolean expResult = false;
        boolean result = instance.isStackFull();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isStackEmpty method, of class Stack_DataStructures.
     */
    @Test
    public void testIsStackEmpty() {
        System.out.println("isStackEmpty");
        Stack_DataStructures instance = null;
        boolean expResult = false;
        boolean result = instance.isStackEmpty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
