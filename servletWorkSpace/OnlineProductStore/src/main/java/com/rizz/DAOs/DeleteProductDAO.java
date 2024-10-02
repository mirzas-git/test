package com.rizz.DAOs;
import java.sql.*;
public class DeleteProductDAO {

	int k=0;
	public int delete(String pCode){
		try {
			Connection con = DBConnection.getCon();
			PreparedStatement ps = con.prepareStatement("delete from Product63 where pcode=?");
			ps.setString(1, pCode);
			k=ps.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}	
		
		return k;
	}
}
