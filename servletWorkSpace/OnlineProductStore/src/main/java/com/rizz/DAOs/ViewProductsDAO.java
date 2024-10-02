package com.rizz.DAOs;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.util.ArrayList;

import com.rizz.Beans.ProductBean;

public class ViewProductsDAO {

	ArrayList<ProductBean> al= new ArrayList<ProductBean>();

	public ArrayList<ProductBean> getProducts()  {
	
		try {
			
			Connection con = DBConnection.getCon();
			PreparedStatement ps = con.prepareStatement("select * from Product63");
			ResultSet rs = ps.executeQuery();
		     while (rs.next()) {
				ProductBean p = new ProductBean();
				p.setpCode(rs.getString(1));
				p.setpName(rs.getString(2));
				p.setPrice(rs.getDouble(3));
				p.setPqty(rs.getInt(4));
				al.add(p);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}

		

		return al;

	}
}
