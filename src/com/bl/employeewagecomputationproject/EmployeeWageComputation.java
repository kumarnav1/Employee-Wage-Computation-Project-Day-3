package com.bl.employeewagecomputationproject;

public class EmployeeWageComputation {

    static final int IS_FULL_TIME = 1;
    static final int IS_PART_TIME = 2;
    static final int EMP_WAGE_PER_HOUR = 20;
    static final int EMP_FULL_DAY_HOUR = 8;
    static final int EMP_HALF_DAY_HOUR = 4;

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Project");
        double empCheck = Math.floor(Math.random() * 10) % 3;
        int employeeWage;
        switch ((int) empCheck) {
            case IS_FULL_TIME:
                System.out.println("Employee is Present Full time");
                employeeWage = EMP_WAGE_PER_HOUR * EMP_FULL_DAY_HOUR;
                System.out.println("Employee Daily Wage is : " + employeeWage);
                break;
            case IS_PART_TIME:
                System.out.println("Employee is Present Part time");
                employeeWage = EMP_WAGE_PER_HOUR * EMP_HALF_DAY_HOUR;
                System.out.println("Employee Daily wage is : " + employeeWage);
                break;
            default:
                System.out.println("Employee is Absent");
        }
    }
}