package com.epam.training.assignment.Investo;

import java.util.Scanner;

public class Retirement {
	Scanner s = new Scanner(System.in);

	public void FillDetails(int age) {
		System.out.println("Enter Your Retirement Age");
		int retireage = s.nextInt();
		if (retireage < 50 || retireage > 80) {
			System.out.println("Retirement Age should be between 50 and 80 years");
			FillDetails(age);
		} else
			RetirePlans(age,retireage);
	}

	public void RetirePlans(int age,int retireage) {
		System.out.println("1-Retirement Plans Ex:- 1000000 deposit");
		int plan = s.nextInt();
		if (plan == 1) {
			Calculations1(age,retireage);
		}
	}
	
	public void Calculations1(int age,int retireage){
				System.out.println("Make some calculation and print Pension");
	}

}