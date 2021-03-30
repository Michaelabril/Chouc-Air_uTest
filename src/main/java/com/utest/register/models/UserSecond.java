package com.utest.register.models;

public class UserSecond {
   String cityfield;
   String ziporpostalcodefield;
   String country;
   
   public UserSecond(  String cityfield,  String ziporpostalcodefield,String country) 
   {
	   super();
	   this.cityfield=cityfield;
	   this.ziporpostalcodefield=ziporpostalcodefield;
	   this.country=country;
   }

	public String getCityfield() {
		return cityfield;
	}
	
	public String getZiporpostalcodefield() {
		return ziporpostalcodefield;
	}

	public String getCountry() {
		return country;
	}

		
	
}
