package com.core.atmproject;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class OptionMenu extends UserAccount {
	
	Scanner input = new Scanner(System.in);
	DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");
	
	HashMap<Integer, Integer> userData = new HashMap<Integer, Integer>();
	
	//Validating customer login info
	public void getLogin() throws IOException {
		
		int x = 1;
		
		do {
			
			try {
				
				userData.put(9876543, 9876);
				userData.put(3456789, 3456);
//				userData.put(9101, 0113);
//				userData.put(1123, 0114);
				
				System.out.println("Welcome to ATM project");
				
				System.out.println("Enter your Account number");
				setCustomerAccountNumber(userInput.nextInt());
				
				System.out.println("Enter your Pin number");
				setCustomerPinNumber(userInput.nextInt());
			}
			catch (Exception e) {
				System.out.println("Please enter the valid account details?");
				x = 2;
			}
			
			//Verifying whether account details is correct or not
			for(Entry<Integer, Integer> accountInfo : userData.entrySet()) {
				if(accountInfo.getKey() == getCustomerAccountNumber() && accountInfo.getValue() == getCustomerPinNumber()) {
					getAccountType();
				}
			}
			System.out.println("\n" + "Wrong Account number or Pin number! " + "\n");
		}while(x == 1);
	}
	
	
	//Display Account Type Menu with Selection
	public void getAccountType() {
		
		System.out.println("Select the Account you want to access..");
		System.out.println("Type 1 - Checking Account");
		System.out.println("Type 2 - Saving Account");
		System.out.println("Type 3 - Exit");
		System.out.println("Choice: ");
		
		int selection = userInput.nextInt();
		
		switch (selection) {
		case 1:
			getChecking();
			break;
			
		case 2:
			getSaving();
			break;
			
		case 3:
			System.out.println("Thank you for using the MAchine..Good Bye");
			break;
			
		default:
			System.out.println("\n" + "Invalid choice " + "\n");
			getAccountType();
		}
	}
	
	//Display Checking Account Menu with Selection
	public void getChecking() {
		
		System.out.println("Checking Account..");
		System.out.println("Type 1 - View balance");
		System.out.println("Type 2 - Withdraw Funds");
		System.out.println("Type 3 - Deposit Funds");
		System.out.println("Type 4 - Exit");
		System.out.print("Choice: ");
		
		int selection = userInput.nextInt();
		
		switch(selection) {
		
			case 1:
				System.out.println("Checking Account balance: " + moneyFormat.format(getCheckingBalance()));
				getAccountType();
				break;
				
			case 2:
				getCheckingWithdrawInput();
				getAccountType();
				break;
				
			case 3:
				getCheckingDepositInput();
				getAccountType();
				break;
				
			case 4:
				System.out.println("Thank you for using the MAchine..See you again..");
				break;
				
			default:
				System.out.println("\n" + "Invalid choice " + "\n");
				getChecking();
				
		}
		
	}
	
	
	//Display Saving Account Menu with Selection
		public void getSaving() {
			
			System.out.println("Saving Account..");
			System.out.println("Type 1 - View balance");
			System.out.println("Type 2 - Withdraw Funds");
			System.out.println("Type 3 - Deposit Funds");
			System.out.println("Type 4 - Exit");
			System.out.print("Choice: ");
			
			int selection = userInput.nextInt();
			
			switch(selection) {
			
				case 1:
					System.out.println("Saving Account balance: " + moneyFormat.format(getSavingBalance()));
					getAccountType();
					break;
					
				case 2:
					getSavingWithdrawInput();
					getAccountType();
					break;
					
				case 3:
					getSavingDepositInput();
					getAccountType();
					break;
					
				case 4:
					System.out.println("Thank you for using the MAchine..See you again..");
					break;
					
				default:
					System.out.println("\n" + "Invalid choice " + "\n");
					getSaving();
					
			}
			
		}

}
