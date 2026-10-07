package com.banking;
interface Account1{
	// only abstract methods 
	public void showBalance();
}
class AccountBalance  implements Account1{

	
	public void showBalance() {
		double balance = 10000.00;
		System.out.println(balance);
	}
	
}
public class InterfaceExample  {
public static void main(String[] args) {
	AccountBalance acc_bal = new AccountBalance();
	acc_bal.showBalance();
}
}
