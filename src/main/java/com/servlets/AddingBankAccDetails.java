package com.servlets;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.sql.Connection;

import com.databaseconnectivity.Dbconnection;
import com.payment.dto.UserBankAccountDetails;
import com.payment.dto.UserRegistrationDetailsDto;

@WebServlet("/AddingBankAccDetails")
public class AddingBankAccDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;   
    public AddingBankAccDetails() {
        super();
      
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			Connection con=Dbconnection.connect();
			HttpSession hs=request.getSession();
			long bankacc_number =Long.parseLong(request.getParameter("Bankacc_number"));
			String bank_name =request.getParameter("Bank_name");
			String ifsc_code=request.getParameter("ifsc_code");
			String account_status =request.getParameter("AccountStatus");
			String account_branchlocation =request.getParameter("Account_branchlocation");
			double current_balance=Double.parseDouble(request.getParameter("Current_balance"));
			int user_id=((UserRegistrationDetailsDto)hs.getAttribute("userdetails")).getUser_id();
			UserBankAccountDetails bankacc=new UserBankAccountDetails(bankacc_number,ifsc_code,account_status,bank_name,account_branchlocation,current_balance,user_id);
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
