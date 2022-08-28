package org.bank;

public class BankInfo {
public void saving(){
	System.out.println("saving");
}
public void fixed(){
	System.out.println("fixed");
}
public static void main(String[] args) {
	BankInfo b = new BankInfo();
	b.saving();
	b.fixed();
}
}
