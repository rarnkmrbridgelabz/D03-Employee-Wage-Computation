package com.bridgelabz;

import java.util.Iterator;
import java.util.Random;

public class EmployeeWage {

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation");

		Random random = new Random();

		int wagePerHour = 20;
		int fullDayHours = 8;
		int partTimeHours = 4;
		int wagePerDay = 0;
		int monthlySalary = 0;
//UC-4-using-switch-case	
		for (int day = 1; day <= 20; day++) {
			int attendance = random.nextInt(3);
			wagePerDay = 0;
			switch (attendance) {
			case 0:
				System.out.println("Employee is Absent...");
				break;

			case 1:
				System.out.println("Employee is Present Part Time...");
				wagePerDay = wagePerHour * partTimeHours;
				break;

			default:
				System.out.println("Employee is Present Full Time...");
				wagePerDay = wagePerHour * fullDayHours;

			}
			monthlySalary = monthlySalary + wagePerDay;
			System.out.println(day + " : " + monthlySalary);
		}

	}
}
