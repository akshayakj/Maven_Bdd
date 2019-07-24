package com.amdocs.bdd;

public class ATM {
	
	public String check(double amount) {
		if(amount==5000 || amount==10000)
			return "Deliver cash";
		else
			return "Cash is Not available";
		
	}
}
