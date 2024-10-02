package com.rizz.servletTask4;

import java.util.*;
import java.sql.*;

public class EmployeeDAO {
	
	

	public  int registerEmployee(EmployeeBean eb)  {
		int k=0;
		try{
			// Loading DB driver into JVM memory
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// Creating Connection b/w DB-javaProgram.
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "mirza", "shaza");	
			PreparedStatement ps1=con.prepareStatement("insert into empData values(?,?,?,?,?,?,?,?)");
			
			ps1.setInt(1, eb.getEmployeeId());
			ps1.setString(2, eb.getEmployeeName());
			ps1.setDouble(3, eb.getEmployeeSalary());
			ps1.setString(4, eb.getEmployeeGender());
			ps1.setString(5, eb.getEmployeeProfile());
			ps1.setString(6, eb.getEmployeeState());
			ps1.setString(7, eb.getEmployeeAddress());
			ps1.setString(8, eb.getEmployeehobbies());
						
			k = ps1.executeUpdate();
			
		}catch(Exception e) {
			
			System.out.println(e.toString());
		}
		
		return k;
	}     
	
	
	public  List<EmployeeBean> retrieveEmployee(){
		List<EmployeeBean> listOfEmployees=new ArrayList<EmployeeBean>();
		try {
			// Loading DB driver into JVM memory
		
			Class.forName("oracle.jdbc.driver.OracleDriver");


			// Creating Connection b/w DB-javaProgram.
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "mirza", "shaza");
			PreparedStatement ps2=con.prepareStatement("select * from empData");
			ResultSet rs1=ps2.executeQuery();
			while(rs1.next()) {
				EmployeeBean eb=new EmployeeBean();
				eb.setEmployeeId(rs1.getInt(1));
				eb.setEmployeeName(rs1.getString(2));
				eb.setEmployeeSalary(rs1.getDouble(3));
				eb.setEmployeeGender(rs1.getString(4));
				eb.setEmployeeProfile(rs1.getString(5));
				eb.setEmployeeState(rs1.getString(6));
				eb.setEmployeeAddress(rs1.getNString(7));
				eb.setEmployeehobbies(rs1.getString(8));
				
				listOfEmployees.add(eb);  
				
			}
			
		}catch(Exception e) {
			System.out.println(e.toString());
		}
		return listOfEmployees;
	}
}
