package com.bridgelabz;

import java.util.Random;

public class EmployeeWage {

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation");

		Random random = new Random();
		int attendance = random.nextInt(3);

		int wagePerHour = 20;
		int fullDayHours = 8;
		int partTimeHours = 4;
		int wagePerDay = 0;
//UC-4-using-switch-case		
		switch (attendance) {
		case 0:
			System.out.println("Employee is Absent...");
			break;

		case 1:
			System.out.println("Employee is Present Part Time...");
			wagePerDay = wagePerHour * partTimeHours;
			break;

		case 2:
			System.out.println("Employee is Present Full Time...");
			wagePerDay = wagePerHour * fullDayHours;
			break;
		}

		System.out.println("Employee Wage Per Day: " + wagePerDay);

	}
}
