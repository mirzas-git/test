package com.rizz.DAOs;

import java.sql.*;

import com.rizz.Beans.ProductBean;

public class AddProductDAO {
	int k = 0;

	public int addproduct(ProductBean pb) {

		try {
			Connection con = DBConnection.getCon();
			PreparedStatement ps = con.prepareStatement("insert into Product63 values(?,?,?,?)");
			ps.setString(1, pb.getpCode());
			ps.setString(2, pb.getpName());
			ps.setDouble(3, pb.getPrice());
			ps.setInt(4, pb.getPqty());

			k = ps.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return k;
	}
}
