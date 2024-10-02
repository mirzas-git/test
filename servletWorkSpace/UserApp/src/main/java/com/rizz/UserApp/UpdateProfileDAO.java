package com.rizz.UserApp;

import java.sql.*;

public class UpdateProfileDAO {

	public int update(UserBean ub) {
		int i = 0;
		try {

			Connection con = DBConnection.getCon();
			PreparedStatement ps = con
					.prepareStatement("update UserReg63 set fname=?, email=?, phno=? where uname=? and pword=?");
			ps.setString(1, ub.getfName());
			ps.setString(2, ub.getMailId());
			ps.setLong(3, ub.getPhNo());
			ps.setString(4, ub.getuName());
			ps.setString(5, ub.getpWord());

			i = ps.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return i;
	}
}
