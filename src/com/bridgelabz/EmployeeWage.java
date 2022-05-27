package com.bridgelabz;

import java.util.Random;

public class EmployeeWage {

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation");
//UC-1-attendance -check
		Random random = new Random();
		int attendance = random.nextInt(2);

		int wagePerHour = 20;
		int fullDayHours = 8;
		int wagePerDay = 0;

		if (attendance == 1) {
			System.out.println("Employee is Present...");
			wagePerDay = wagePerHour * fullDayHours;
		} else
			System.out.println("Employee is Absent...");
		System.out.println("Employee Wage Per Day: " + wagePerDay);
	}

}
