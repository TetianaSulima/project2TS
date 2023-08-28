/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */

import com.mycompany.ractangleng.Ractangle;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author navat
 */
public class RactangleTest {
    
    Ractangle r; 
    
    public RactangleTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
        r = new Ractangle(15.00, 12.00);
    }
    

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
    
    @Test
    public void AreaTest(){
        double area = r.Area();
        assertEquals(area, 144.00);    
    }
    
    @Test
    public void periTest(){
        double peri = r.Perimether();
        assertEquals(peri, 360.0);
    }
    
    @Test
    public void stringTest(){
        r = new Ractangle();
        r.toString();
    }
}
