package com.rizz.UserApp;


import java.sql.*;

public class RegisterDAO {

	public int k = 0;

	public int insert(UserBean ub) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DBConnection.getCon();
			PreparedStatement ps = con.prepareStatement("insert into UserReg63 values(?,?,?,?,?,?,?)");
			ps.setString(1, ub.getuName());
			ps.setString(2, ub.getpWord());
			ps.setString(3, ub.getfName());
			ps.setString(4, ub.getlName());
			ps.setString(5, ub.getAddress());
			ps.setString(6, ub.getMailId());
			ps.setLong(7, ub.getPhNo());

			k = ps.executeUpdate();

		} catch (Exception e) {
			System.out.println(e.toString());
		}
		return k;
	}
}
