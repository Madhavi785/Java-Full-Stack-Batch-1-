package com.verizon;

public abstract class Loan {
	
	abstract void applyLoan(String name,double amount);
	abstract void submitDocs();
	abstract int getEmi();

}
