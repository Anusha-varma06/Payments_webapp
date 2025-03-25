package com.daoimplementations;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.databaseconnectivity.Dbconnection;
import com.payment.dto.UserRegistrationDetailsDto;

public class RegistrationDaoImplementation {
	public int registerUser(UserRegistrationDetailsDto robj) throws Exception {
		Connection con=Dbconnection.connect();
		String query="insert into User_details (user_name,password,first_name,last_name,phone_number,email,address)values(?,?,?,?,?,?,?)";
		PreparedStatement ps=con.prepareStatement(query);
		ps.setString(1, robj.getUser_name());
		ps.setString(2, robj.getPassword());
		ps.setString(3, robj.getFirst_name());
		ps.setString(4, robj.getLast_name());
		ps.setString(5, robj.getPhone_number());
		ps.setString(6, robj.getEmail());
		ps.setString(7, robj.getAddress());
		int res=ps.executeUpdate();
		return res;
	}
	
}
