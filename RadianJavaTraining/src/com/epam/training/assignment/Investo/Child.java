package com.epam.training.assignment.Investo;

import java.util.Scanner;

public class Child {
	Scanner s = new Scanner(System.in);

	public void FillDetails(int age) {
		System.out.println("Enter Required Details");
		ChildPlans(age);
	}

	public void ChildPlans(int age) {
		System.out.println("1-Child Plans Ex:- 100000 deposit");
		int res = s.nextInt();
		if (res == 1)
			Calculations1(age);
		else {
			System.out.println("Invalid input");
			ChildPlans(age);
		}
	}

	public void Calculations1(int age) {
		System.out.println("make some calculations and print details");
	}
}