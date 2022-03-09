package ie.gmit.exam;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EmployeeTests {
    private Employee myEmployee;

    @Test
    void testTitle(){
        myEmployee = new Employee("Mr", "Shane", "945623", "0875858585", "Full Time", 22);
        assertEquals("Mr", myEmployee.getTitle());
    }
    @Test
    void testName(){
        myEmployee = new Employee("Mr", "Shane", "945623", "0875858585", "Full Time", 22);
        assertEquals("Joe", myEmployee.getName());
    }

    @Test
    void testPPS(){
        myEmployee = new Employee("Mr", "Shane", "945623", "0875858585", "Full Time", 22);
        assertEquals("945623", myEmployee.getPPS());
    }

    @Test
    void testPhoneNo(){
        myEmployee = new Employee("Mr", "Shane", "945623", "0875858585", "Full Time", 22);
        assertEquals("0875858585", myEmployee.getPhoneNo());
    }

    @Test
    void testEmploymentType(){
        myEmployee = new Employee("Mr", "Shane", "945623", "0875858585", "Full Time", 22);
        assertEquals("Full Time", myEmployee.getEmploymentType());
    }

    @Test
    void testAge(){
        myEmployee = new Employee("Mr", "Shane", "945623", "0875858585", "Full Time", 22);
        assertEquals(22, myEmployee.getAge());
    }



}
