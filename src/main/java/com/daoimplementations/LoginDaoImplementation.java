package com.daoimplementations;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.databaseconnectivity.Dbconnection;
import com.payment.dto.UserRegistrationDetailsDto;

public class LoginDaoImplementation {
	public UserRegistrationDetailsDto loginUser(String email,String password) throws Exception {
		UserRegistrationDetailsDto userDetails=null;
		Connection cons=Dbconnection.connect();
		String query="select * from User_details where email=? and password=?";
		PreparedStatement ps=cons.prepareStatement(query);
		ps.setString(1,email);
		ps.setString(2,password);
		ResultSet rs=ps.executeQuery();
		if(rs.next()) {
			userDetails=new UserRegistrationDetailsDto(rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8));
			userDetails.setUser_id(rs.getInt(1));
		}
		return userDetails;
	}
	
}
