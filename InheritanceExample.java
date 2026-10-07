package com.banking;
class CalculatorAdd{
	
	public  int addition(int a,int b) {
		int result = a+b;
		System.out.println(result);
		return result;
	}
}
class CalculatorSubAndAdd extends CalculatorAdd{
	
	public int subtraction(int a,int b){
		int result = a-b;
		System.out.println(result);
		return result;
	}
	
}
public class InheritanceExample {
	public static void main(String[] args) {
		CalculatorAdd add = new CalculatorAdd();
		add.addition(10, 10);
		CalculatorSubAndAdd sub_add = new CalculatorSubAndAdd();
		sub_add.addition(20, 20);
		sub_add.subtraction(20, 10);
		
	}

}
