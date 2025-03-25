package com.servlets;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.daoimplementations.LoginDaoImplementation;
import com.databaseconnectivity.Dbconnection;
import com.payment.dto.UserRegistrationDetailsDto;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public LoginServlet() {
        super();
        
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			Connection cons=Dbconnection.connect();
			PrintWriter pw=response.getWriter();
			response.setContentType("text/html");
			String email=request.getParameter("email");
			String password=(String)request.getParameter("password");
			LoginDaoImplementation login=new LoginDaoImplementation();
			UserRegistrationDetailsDto userDetails=login.loginUser(email,password);
			if(userDetails!=null) {
				HttpSession hs=request.getSession();
				hs.setAttribute("userdetails",userDetails);
				pw.print("Logged in successfully");
		    	RequestDispatcher rd=request.getRequestDispatcher("Profile.jsp");
		    	rd.include(request, response);
		    }
		    else {
		    	pw.print("invalid credentials");
		    	RequestDispatcher rd=request.getRequestDispatcher("Login.html");
		    	rd.include(request, response);
		    }
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
