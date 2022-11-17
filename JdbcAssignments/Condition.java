package JdbcAssignments;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Condition {

	
	static String URL = "jdbc:mysql://localhost:3306/jdbctemplate";
	static String USERNAME = "root";
	static String PASSWORD = "root";

	public static void main(String[] args) throws Exception {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Department");
		String b=sc.next();
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        Statement st=conn.createStatement();
	
	String sql="select employee.ename,department.dname, employee.designation from employee join department on employee.deptid=department.deptid where department.dname='"+b+"'";
	ResultSet rs=st.executeQuery(sql);
	while(rs.next()) {
		
		System.out.println("Employee name is = "+rs.getString("ename")+", Department name is = "+rs.getString("dname")+" whose Designation is = "+rs.getString("designation"));
	}
}
}
