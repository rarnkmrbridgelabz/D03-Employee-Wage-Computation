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
		int monthlyHours = 0;
		int days = 0;

		while (monthlyHours <= 100 && days <= 20) {
			int attendance = random.nextInt(3);
			wagePerDay = 0;
			switch (attendance) {
			case 0:
				System.out.println("Employee is Absent...");
				break;

			case 1:
				System.out.println("Employee is Present Part Time...");
				wagePerDay = wagePerHour * partTimeHours;
				monthlyHours = monthlyHours + partTimeHours;
				break;

			default:
				System.out.println("Employee is Present Full Time...");
				wagePerDay = wagePerHour * fullDayHours;
				monthlyHours = monthlyHours + fullDayHours;

			}
			monthlySalary = monthlySalary + wagePerDay;
			System.out.println("Day:" + days + " Monthly Hours:" + monthlyHours + " Monthly Salary : " + monthlySalary);
			days++;
		}

	}

}
