package com.bridgelabz;

import java.util.ArrayList;
import java.util.Random;

public class EmployeeWage implements IEmployeeWage {
	static final int EMP_FULL_TIME = 1;
    static final int EMP_PART_TIME = 2;

    private ArrayList<CompanyEmployeeWage> companyEmployeeWageArrayList;

    public EmployeeWage() {
    	companyEmployeeWageArrayList = new ArrayList<CompanyEmployeeWage>();
    }

    public void addCompanyEmpWage(String company, int wagePerHour, int workingDay, int totalWorkHrs) {

    	CompanyEmployeeWage employeeWage1 = new CompanyEmployeeWage (company, wagePerHour, workingDay, totalWorkHrs);
    	companyEmployeeWageArrayList.add(employeeWage1);
    }

    public void calculateEmpWage() {
        for(int i=0; i < companyEmployeeWageArrayList.size(); i++) {
        	CompanyEmployeeWage companyEmployeeWage = companyEmployeeWageArrayList.get(i);
        	companyEmployeeWage.setTotalEmpWage(this.calculateEmpWage(companyEmployeeWage));
            System.out.println(companyEmployeeWage.company +" Total Wage is "+ companyEmployeeWage.totalWage);
        }
    }

    public int calculateEmpWage(CompanyEmployeeWage companyEmployeeWage){

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

            return empWage;
    }


    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage calculation");
        System.out.println("------------------------------------");
        EmployeeWage empWage = new EmployeeWage();
        empWage.addCompanyEmpWage("BIG BASKET", 40, 22, 140);
        empWage.addCompanyEmpWage("AMAZON", 90, 21,222);
        empWage.addCompanyEmpWage("TARGET", 58, 22, 175);
        empWage.calculateEmpWage();

    }

}
