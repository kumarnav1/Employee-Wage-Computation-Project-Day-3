package com.bl.employeewagecomputationproject;

public class EmployeeWageComputation {

    static final int IS_PRESENT = 1;
    static final int EMP_WAGE_PER_HOUR = 20;
    static final int EMP_FULL_DAY_HOUR = 8;

    public static void main(String[] args) {
        int employeeWage;
        System.out.println("Welcome to Employee Wage Computation Project");
        double empCheck = Math.floor(Math.random() * 10) % 2;
        if (empCheck == IS_PRESENT) {
            System.out.println("Employee is Present");
            employeeWage = EMP_WAGE_PER_HOUR * EMP_FULL_DAY_HOUR;
            System.out.println("Employee Daily Wage is : " + employeeWage);
        } else
            System.out.println("Employee is Absent");
    }
}