package com.core.atmproject;

import java.text.DecimalFormat;
import java.util.Scanner;

public class UserAccount {
	
	Scanner userInput = new Scanner(System.in);
	DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");
	
	private int customerAccountNumber;
	private int customerPinNumber;
	private double checkingBalance = 0;
	private double savingBalance = 0;
	
	public int getCustomerAccountNumber() {
		return customerAccountNumber;
	}
	public int setCustomerAccountNumber(int customerAccountNumber) {
		this.customerAccountNumber = customerAccountNumber;
		return customerAccountNumber;
	}
	public int getCustomerPinNumber() {
		return customerPinNumber;
	}
	public int setCustomerPinNumber(int customerPinNumber) {
		this.customerPinNumber = customerPinNumber;
		return customerPinNumber;
	}
	public double getCheckingBalance() {
		return checkingBalance;
	}
	public void setCheckingBalance(double checkingBalance) {
		this.checkingBalance = checkingBalance;
	}
	public double getSavingBalance() {
		return savingBalance;
	}
	public void setSavingBalance(double savingBalance) {
		this.savingBalance = savingBalance;
	}
	
	/****************Checking & Saving Withdraw & Deposit methods*************************/
	//Calculate checking account withdrawal
	public double calcCheckingWithdrawal(double amount) {
		checkingBalance = (checkingBalance - amount);
		return checkingBalance;
	}
	
	//Calculate saving account withdrawal
	public double calcSavingWithdrawal(double amount) {
		savingBalance = (savingBalance - amount);
		return savingBalance;
	}
	
	//Calculate checking account deposit
		public double calcCheckingDeposit(double amount) {
			checkingBalance = (checkingBalance + amount);
			return checkingBalance;
		}
		
		//Calculate saving account deposit
				public double calcSavingDeposit(double amount) {
					savingBalance = (savingBalance + amount);
					return savingBalance;
				}
				/****************Checking & Saving Withdraw & Deposit methods ENDS*************************/		
	
				
	//Customer checking acc withdraw input
				public void getCheckingWithdrawInput() {
					
					System.out.println("Checking Account Balance: "+ moneyFormat.format(checkingBalance));
					System.out.println("Amount you want to withdraw from checking account?");
					double amount = userInput.nextDouble();
					
					if((checkingBalance - amount) >= 0) {
						calcCheckingWithdrawal(amount);
						System.out.println("New Checking Account Balance: "+ moneyFormat.format(checkingBalance));
					}
					else {
						System.out.println("Balance cannot be negative!" + "\n");
					}
				}
				
				
				//Customer saving acc withdraw input
				public void getSavingWithdrawInput() {
					
					System.out.println("Saving Account Balance: "+ moneyFormat.format(savingBalance));
					System.out.println("Amount you want to withdraw from saving account?");
					double amount = userInput.nextDouble();
					
					if((savingBalance - amount) >= 0) {
						calcSavingWithdrawal(amount);
						System.out.println("New Saving Account Balance: "+ moneyFormat.format(savingBalance));
					}
					else {
						System.out.println("Balance cannot be negative!" + "\n");
					}
				}
				
				
				//Customer checking acc deposit input
					public void getCheckingDepositInput() {
					
					System.out.println("Checking Account Balance: "+ moneyFormat.format(checkingBalance));
					System.out.println("Amount you want to withdraw from checking account?");
					double amount = userInput.nextDouble();
					
					if((checkingBalance + amount) >= 0) {
						calcCheckingDeposit(amount);
						System.out.println("New Checking Account Balance: "+ moneyFormat.format(checkingBalance));
					}
					else {
						System.out.println("Balance cannot be negative!" + "\n");
					}
				}
					
					
					//Customer saving acc deposit input
					public void getSavingDepositInput() {
						
						System.out.println("Saving Account Balance: "+ moneyFormat.format(savingBalance));
						System.out.println("Amount you want to withdraw from saving account?");
						double amount = userInput.nextDouble();
						
						if((savingBalance + amount) >= 0) {
							calcSavingDeposit(amount);
							System.out.println("New Saving Account Balance: "+ moneyFormat.format(savingBalance));
						}
						else {
							System.out.println("Balance cannot be negative!" + "\n");
						}
					}
		
		
	
	

}
