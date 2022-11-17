package LambdaExp;

public class Employee implements Comparable<Employee>{

	private String empId;
    private String empName;
    private Integer salary;
    private String empRole;
    public Employee(String empId, String empName, Integer salary, String empRole) {
        this.empId=empId;
        this.empName=empName;
        this.salary=salary;
        this.empRole=empRole;
    }
    
    public String getEmpId() {
        return empId;
    }
    public void setEmpId(String empId) {
        this.empId = empId;
    }
    public String getEmpName() {
        return empName;
    }
    public void setEmpName(String empName) {
        this.empName = empName;
    }
    public Integer getSalary() {
        return salary;
    }
    public void setSalary(Integer salary) {
        this.salary = salary;
    }
    public String getEmpRole() {
        return empRole;
    }
    public void setEmpRole(String empRole) {
        this.empRole = empRole;
    }
    
    
    
    @Override
    public String toString() {
        return "Employee [empId=" + empId + ", empName=" + empName + ", salary=" + salary + ", empRole=" + empRole
                + "]";
    }



   public int compareTo(Employee object) {
        /**
         * compareTo() compares two string values lexicographically
         * and returns either 1, 0 or -1.
         * 0 if both the strings are same.
         * 1 if str1>str2 (in str1.compareTo(str2))
         * -1 if str1<str2 (in str1.compareTo(str2))
         */
        
        return this.empName.compareTo(object.empName);
    }
    

}
