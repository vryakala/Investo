package com.epam.training.assignment.Investo;

import java.util.Scanner;
import com.epam.training.assignment.Investo.*;

public class Investo {

	public static Growth growth;
	public static Child child;
	public static Retirement retire;
	//public static Withdraw withdraw;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		growth = new Growth();
		child = new Child();
		retire = new Retirement();
		//withdraw = new Withdraw();

		System.out.println("Enter Your Name");
		Scanner s = new Scanner(System.in);
		String name = s.nextLine();
		System.out.println("Enter Your Age");
		int age = s.nextInt();
		if (age < 18) {
			System.out.println("Age should be more than 18 years to make investments");
			main(null);
		}
		System.out.println("Enter Your Annual Income");
		int income = s.nextInt();
		if (income < 300000) {
			System.out.println("Annual Income should be more than 3,00,000 to make investments");
			main(null);
		}
		category();
		int input = s.nextInt();
		if (input == 1) {
			System.out.println("You have selected GROWTH INVESTMENT");
			growth.FillDetails(age);
		} else if (input == 2) {
			System.out.println("You have selected CHILD FUTURE");
			child.FillDetails(age);
		} else if (input == 3) {
			System.out.println("You have selected RETIRED LIFE");
			retire.FillDetails(age);
		} //else if (input == 4) {
			//System.out.println("You have chosed to withdraw amount");
			//withdraw.FillDetails(age);
		//} 
		else {
			System.out.println("Invalid Input");
			category();
		}
	}

	public static void category() {
		System.out.println("Please select the category:-");
		System.out.println("1 - Growth Investment");
		System.out.println("2 - Child Future");
		System.out.println("3 - Retired Life");
		System.out.println("4 - Withdraw");
	}
}
