package com.payment.dto;
//import java.util.ArrayList;
//import java.util.List;
public class UserRegistrationDetailsDto {
		private  int user_id;
		private String user_name;
		private String password;
		private String first_name;
		private String last_name;
		private String phone_number;
		private String email ;
		private String address;
		//private List<BankAccount> Banks ;
		public UserRegistrationDetailsDto(String user_name, String password, String first_name, String last_name, String phone_number,
				String email, String address) {
			super();
			this.user_name = user_name;
			this.password = password;
			this.first_name = first_name;
			this.last_name = last_name;
			this.phone_number = phone_number;
			this.email = email;
			this.address = address;
			//Banks=new ArrayList<>();
		}
		public void setUser_id(int user_id) {
			this.user_id = user_id;
		}
		public UserRegistrationDetailsDto() {
			super();
			// TODO Auto-generated constructor stub
		}
//		public List<BankAccount> getBanks() {
//			return Banks;
//		}
//		public void setBanks(BankAccount bank) {
//			Banks.add(bank);
//		}
		public int getUser_id() {
			return user_id;
		}
		public String getUser_name() {
			return user_name;
		}
		public void setUser_name(String user_name) {
			this.user_name = user_name;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getFirst_name() {
			return first_name;
		}
		public void setFirst_name(String first_name) {
			this.first_name = first_name;
		}
		public String getLast_name() {
			return last_name;
		}
		public void setLast_name(String last_name) {
			this.last_name = last_name;
		}
		public String getPhone_number() {
			return phone_number;
		}
		public void setPhone_number(String phone_number) {
			this.phone_number = phone_number;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		@Override
		public String toString() {
			return "Users [user_id=" + user_id + ", user_name=" + user_name + ", password=" + password + ", first_name="
					+ first_name + ", last_name=" + last_name + ", phone_number=" + phone_number + ", email=" + email
					+ ", address=" + address + "]";
		}
		

		
	}

