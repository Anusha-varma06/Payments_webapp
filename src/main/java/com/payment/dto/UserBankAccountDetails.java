package com.payment.dto;
public class UserBankAccountDetails {
		private long bankAccountId;
		private final long accountNumber ;
		private final String ifscCode;
		private String actStatus;
		private final String bankName;
		private String bankAccountBranchLocation;
		private double currentBalance;
		private int userId;
		public UserBankAccountDetails(long accountNumber, String ifscCode, String actStatus, String bankName,
				String bankAccountBranchLocation,double currentBalance,int userId){
			super();
			this.accountNumber = accountNumber;
			this.ifscCode = ifscCode;
			this.actStatus = actStatus;
			this.bankName = bankName;
			this.bankAccountBranchLocation = bankAccountBranchLocation;
			this.setCurrentBalance(currentBalance);
			this.userId=userId;
		}
		
		public long getBankAccountId() {
			return bankAccountId;
		}
		public void setBankAccountId(long bankAccountId) {
			this.bankAccountId=bankAccountId;
		}
		public long getAccountNumber() {
			return accountNumber;
		}
		public String getIfscCode() {
			return ifscCode;
		}
		public String getBankName() {
			return bankName;
		}
		public String getBankAccountBranchLocation() {
			return bankAccountBranchLocation;
		}
		public void setBankAccountBranchLocation(String bankAccountBranchLocation) {
			this.bankAccountBranchLocation = bankAccountBranchLocation;
		}
		public String getActStatus() {
			return actStatus;
		}
		public void setActStatus(String actStatus) {
			this.actStatus = actStatus;
		}
		public  int getUserId() {
			return userId;
		}
		public void setUserId(int userId) {
			this.userId=userId;
		}

		public double getCurrentBalance() {
			return currentBalance;
		}

		public void setCurrentBalance(double currentBalance) {
			this.currentBalance = currentBalance;
		}
	}


