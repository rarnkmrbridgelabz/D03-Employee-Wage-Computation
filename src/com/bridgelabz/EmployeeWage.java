package com.bridgelabz;

import java.util.Random;

public class EmployeeWage {
	static final int EMP_FULL_TIME = 1;
	static final int EMP_PART_TIME = 2;

	private int numOfCompany = 0;
	private CompanyEmployeeWage[] empWageArray;

	public EmployeeWage() {
		empWageArray = new CompanyEmployeeWage[5];
	}

	private void addCompanyEmpWage(String company, int wagePerHour, int workingDay, int totalWorkHrs) {

		empWageArray[numOfCompany] = new CompanyEmployeeWage(company, wagePerHour, workingDay, totalWorkHrs);
		numOfCompany++;
	}

	private void calculateEmpWage() {
		for (int i = 0; i < numOfCompany; i++) {
			empWageArray[i].setTotalEmpWage(this.calculateEmpWage(empWageArray[i]));
			System.out.println(empWageArray[i]);
		}
	}

	public int calculateEmpWage(CompanyEmployeeWage companyEmployeeWage) {

		int empWage = 0;
		int totalWorkingHours = 0;
		int totalWorkingDays = 0;

		while (totalWorkingDays < companyEmployeeWage.workingDay && totalWorkingHours < companyEmployeeWage.totalWorkHrs) {

			Random random = new Random();
			int empPresent = random.nextInt(3);
			System.out.println("Random Value for Employee Attendance is :" + empPresent);

			int x;
			switch (empPresent) {

			case EMP_FULL_TIME:

				x = companyEmployeeWage.wagePerHour * 8;
				empWage = empWage + x;
				totalWorkingHours = totalWorkingHours + 8;
				System.out.println("Employee is present and the wage is : " + empWage);
				totalWorkingDays++;
				break;

			case EMP_PART_TIME:
				x = companyEmployeeWage.wagePerHour * 4;
				empWage = empWage + x;
				totalWorkingHours = totalWorkingHours + 4;
				System.out.println("Employee is Part time present and the wage is : " + empWage);
				totalWorkingDays++;
				break;

			default:
				System.out.println("Employee is absent and the wage is : " + empWage);
				break;

			}

		}

		System.out.println("Total Working Days :" + totalWorkingDays);
		System.out.println("Total Working Hours :" + companyEmployeeWage.totalWorkHrs);
		System.out.println("Total Employee Wage for company " + companyEmployeeWage.company + " is :" + empWage);
		System.out.println("---------------------------------------");
		return empWage;
		
	}


	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage calculation");
		System.out.println("---------------------------------------");
		EmployeeWage empWage = new EmployeeWage();
		empWage.addCompanyEmpWage("BIG BASKET", 40, 22, 140);
		empWage.addCompanyEmpWage("AMAZON", 90, 21, 222);
		empWage.addCompanyEmpWage("TARGET", 58, 22, 175);
		empWage.calculateEmpWage();
		System.out.println("---------------------------------------");
	}

}
