package com.bridgelabz;

import java.util.Random;

public class EmployeeWage {

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation");
//UC-1-attendance -check
		Random random = new Random();
		int attendance = random.nextInt(2);

		if (attendance == 1)
			System.out.println("Employee is Present...");
		else
			System.out.println("Employee is Absent...");

	}

}
