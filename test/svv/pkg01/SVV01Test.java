/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package svv.pkg01;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author MegaDS
 */
public class SVV01Test {
    
    public SVV01Test() {
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
     * Test of main method, of class SVV01.
     */
    //@Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        SVV01.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkTriType method, of class SVV01.
     */
    @Test
    public void testCheckTriType() {
        System.out.println("checkTriType");
        double[] a = {1 , 5 , 4 , 100};
        double[] b = {1 , 5 , 3 , 5 };
        double[] c = {1 , 8 , 2 , 6 };
        SVV01 instance = new SVV01();
        String[] expResult = {"Equilateral Triangle","Isosceles Triangle","Scalene","Invalid"};
        
        for ( int i = 0 ; i < 4 ; i++ ){
            String result = instance.checkTriType(a[i], b[i], c[i]);
            assertEquals(expResult[i], result);
        }
    }
}