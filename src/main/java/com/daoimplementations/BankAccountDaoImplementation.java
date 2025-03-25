package com.daoimplementations;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.databaseconnectivity.Dbconnection;
import com.payment.dto.UserBankAccountDetails;

public class BankAccountDaoImplementation {
	public void addBankAcc(UserBankAccountDetails bankacc) throws Exception {
		Connection cons=Dbconnection.connect();
		String query="insert into Bank_accounts(user_id,account_number,ifsc_code,is_active,bank_name,bank_account_branch_location,current_balance) values(?,?,?,?,?,?,?)";
		PreparedStatement ps=cons.prepareStatement(query);
		ps.setInt(1,bankacc.getUserId());
		ps.setLong(2, bankacc.getAccountNumber());
		ps.setString(3, bankacc.getIfscCode());
		ps.setString(4, bankacc.getActStatus());
		ps.setString(5, bankacc.getBankName());
		ps.setString(6, bankacc.getBankAccountBranchLocation());
		ps.setDouble(7, bankacc.getCurrentBalance());
		int res=ps.executeUpdate();
		if(res>0) {
			
		}
	}
}
