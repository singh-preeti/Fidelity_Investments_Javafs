package com.banking;

abstract class Account{
	abstract public void showBalance();
	
	public void showAccDetails() {
		String acc_number = "Acc001234";
		String acc_type = "Saving";
		String cust_name = "Preetii Singh";
		
		System.out.println(acc_number);
		System.out.println(acc_type);
		System.out.println(cust_name);
	}
}
class AbstractDemo extends Account{

	@Override
	public void showBalance() {
		double balance = 100.567;
		String acc_number ="Acc001234";
		System.out.println(acc_number+balance);
		
	}
	
	

}
