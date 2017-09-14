package com.epam.training.assignment.Investo;

import java.util.Scanner;

public class Growth {
	Scanner s = new Scanner(System.in);

	public void FillDetails(int age) {
		System.out.println("Enter Required Details");
		GrowthPlans(age);
	}

	public void GrowthPlans(int age) {
		System.out.println("1- Growth Plan Ex:-100000 deposit");
		int res = s.nextInt();
		if (res == 1)
			Calculations(age);
		else {
			System.out.println("Invalid input");
			GrowthPlans(age);
		}
	}

	public void Calculations(int age) {
		System.out.println("Make some calculations and Print amount");
	}

}
