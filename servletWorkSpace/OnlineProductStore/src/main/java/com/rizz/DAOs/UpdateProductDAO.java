package com.rizz.DAOs;
import java.sql.*;

import com.rizz.Beans.ProductBean;
public class UpdateProductDAO {

	int k=0;
	public int update(ProductBean pb) {
		try {
			Connection con = DBConnection.getCon();
			PreparedStatement ps = con.prepareStatement("update Product63 set pname=?,price=?,pqty=? where pcode=?");
			ps.setString(1, pb.getpName());
			ps.setDouble(2, pb.getPrice());
			ps.setInt(3, pb.getPqty());
			ps.setString(4, pb.getpCode());
			
			k=ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return k;
	}
}
