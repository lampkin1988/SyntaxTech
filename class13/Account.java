package com.syntax.class13;

public class Account {

	String accountId;
	String userName;
	String password;
	String balance;
	String typeOfAccount;
	String limit;

	public static void main(String[] args) {

	// Account

	/*
	 * Write a method that takes the amount that user wants to transfer. It deducts
	 * the amount from your balance and returns the amount of transfer in case if
	 * success or a 0 in case of failure
	 */

double amountToTranser(double amountToTransfer) {
	if(amountToTranser<balance) {
		return balance=balance-amountToTransfer;
	}else {
		return=0;
	}

boolean login(String enteredUserName,String enteredPassword) {
	if (enteredUserName.equals(enteredUserName) && enteredPassword.equals(enteredPassword)) {
		return true;
	}else {
			return false;
			
			
			//Bank application
			
			Account burjusAccount = new Account(); 
			
			burjusAccount.accountId="123";
			burjusAccount.userName="Burju";
			burjusAccount.password="pass123";
			burjusAccount.balance="1000000";
			burjusAccount.typeOfAccount="checking";
			burjusAccount.limit="125";
			
			boolean isLoggedIn = burjusAccount.login(enteredUserName:"Burju", enteredpassword:"pass123");
			
			
			
			if (isLoggedIn) {
				System.out.println("Welcome to Syntanx Bank");
			}else {
				System.out.println("Invalid user name or password");
			}
			
			
			
			double amountToTranser=burjusAccount.amountTranser(amountToTranser:100){
				if(amountToTranser==0) {
					System.out.println("Insufficient balance");
				}else {
					System.out.println(amountToTranser= "Transfered");
				}
				
			
			Account eliassAccount=new Account();
			eliassAccount.accountId="125";
			eliassAccount.userName="Elias";
			eliassAccount.password="pass123";
			eliassAccount.balance="1500";
			eliassAccount.typeOfAccount="savings";
			eliassAccount.limit="100";
			
			
		
			

	}

}
	}
}
