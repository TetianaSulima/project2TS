/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */

import java.util.ArrayList;
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
public class SchoolTest {
    School s; 
    Students stu;
    Instructors ints; 
    
    public SchoolTest() {
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
        stu = new Students("1234", "Elizabeth");
        ints = new Instructors(123, "Mathew");
        s = new School();
        
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
    
    @Test 
    public void schoolTest(){
        ArrayList<Students> stu1 = new ArrayList();
        ArrayList<Instructors> ints1 = new ArrayList();
        stu1.add(stu);
        ints1.add(ints);
        s = new School(1, stu1, ints1);
    }
    
    @Test
    public void tostringTest(){
        s.toString();
    }
}
