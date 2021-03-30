package com.utest.register.models;

public class UserFirstFields {
	   String firstname;
	   String lastname;
	   String emailaddress;
	   String dateofbirthmouth;
	   String dateofbirthday;
	   String dateofbirthyear;
	   
	   public UserFirstFields( String firstname,	String lastname,String emailaddress,
	   String dateofbirthmouth, String dateofbirthday, String dateofbirthyear) {
		   super();
	   }

	public String getFirstname() {
		return firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public String getEmailaddress() {
		return emailaddress;
	}

	public String getDateofbirthMouth() {
		return dateofbirthmouth;
	}

	public String getDateofbirthDay() {
		return dateofbirthday;
	}

	public String getDateofbirthYear() {
		return dateofbirthyear;
	}
	   
	   
}
