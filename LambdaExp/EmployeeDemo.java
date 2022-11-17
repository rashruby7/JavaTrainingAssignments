package LambdaExp;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

public class EmployeeDemo {

public static void main(String args[]) {
        
        List<Employee> empList = Arrays.asList(new Employee("T1001","Arnold",50000,"Manager"),
                new Employee("T1002","Zarvis",35000,"Consultant"),new Employee("T1003","Mathew",65000,"Manager"),
                new Employee("T1004","Santana",40000,"Associate"));
        Collections.sort(empList);
        Consumer<Employee> empDisplay=(emp)->{System.out.println(emp.getEmpName()+" has salary "+emp.getSalary());};
        for(Employee e:empList) {
            //Displaying Salary of all Employees before Increment using "Consumer":
            empDisplay.accept(e);
}
}
}