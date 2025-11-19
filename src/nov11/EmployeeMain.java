package nov11;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class EmployeeMain {
    public static void main(String[] args) {
        List<Employee> emp = new ArrayList<>();
        emp.add(new Employee( "Zeel","Zeel@gmail.com",1234567890));
        emp.add(new Employee( "Vinit","Vinit@gmail.com",1234567890));
        emp.add(new Employee("Khushi","Khushi@gmail.com",1234567890));
        emp.add(new Employee( "Zeel","Zeel@gmail.com",1234567890));

        HashSet<Employee> set = new HashSet<>(emp);
        for (Employee e : set) {
            System.out.println(e);
        }
    }
}
