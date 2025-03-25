package com.servlets;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;

import com.daoimplementations.RegistrationDaoImplementation;
import com.databaseconnectivity.Dbconnection;
import com.payment.dto.UserRegistrationDetailsDto;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/RegistrationServlet")
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public RegistrationServlet() {
        super();
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			Connection con=Dbconnection.connect();
			PrintWriter pw=response.getWriter();
			response.setContentType("text/html");
			String username=request.getParameter("name");
			String password=request.getParameter("password");
			String firstname=request.getParameter("fname");
			String lastname=request.getParameter("lname");
			String mobile=request.getParameter("phno");
			String email=request.getParameter("email");
			String address=request.getParameter("address");
			UserRegistrationDetailsDto robj=new UserRegistrationDetailsDto(username,password,firstname,lastname,mobile,email,address);
			RegistrationDaoImplementation reg=new RegistrationDaoImplementation();
			int res=reg.registerUser(robj);
			if(res>0) {
				pw.print("Registered Successfully");
				RequestDispatcher rd=request.getRequestDispatcher("index.html");
				rd.include(request, response);
			}
			else {
				pw.print("Registration failed");
				RequestDispatcher rd=request.getRequestDispatcher("registration.html");
				rd.include(request, response);
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
