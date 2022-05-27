package com.bridgelabz;

import java.util.Random;

public class EmployeeWage {

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation");
//UC-1-attendance-check
		Random random = new Random();
		int attendance = random.nextInt(3);

		int wagePerHour = 20;
		int fullDayHours = 8;
		int partTimeHours=4;
		int wagePerDay = 0;

		if (attendance == 0) 
			System.out.println("Employee is Absent...");
//UC-3-calculate-daily-wage-part time
		else if(attendance==1){
			System.out.println("Employee is Present Part Time...");
			wagePerDay = wagePerHour * partTimeHours;
		}
//UC-2-calculate-daily-wage-full time
		 else {
			System.out.println("Employee is Present Full Time...");
			wagePerDay = wagePerHour * fullDayHours;
		 }
		System.out.println("Employee Wage Per Day: " + wagePerDay);
	}

}
