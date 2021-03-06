package com.bl.employeewagecomputationproject;

public class EmployeeWageComputation {

    static final int IS_FULL_TIME = 1;
    static final int IS_PART_TIME = 2;
    static final int IS_ABSENT = 0;
    static final int EMP_WAGE_PER_HOUR = 20;
    static final int EMP_FULL_DAY_HOUR = 8;
    static final int EMP_HALF_DAY_HOUR = 4;
    static final int TOTAL_WORKING_DAYS = 20;
    static final int TOTAL_WORKING_HOURS = 100;

    int workingHour = 0;
    int countFullDaysWorking = 0;
    int countHalfDayWorking = 0;
    int countAbsentDays = 0;

    public static void main(String[] args) {

        System.out.println("Welcome to Employee Wage Computation Project");
        EmployeeWageComputation refVar = new EmployeeWageComputation();
        refVar.empAttendance();
        refVar.empWageCal();
    }

    void empAttendance() {

        for (int day = 0; day < TOTAL_WORKING_DAYS; day++) {
            if (workingHour > TOTAL_WORKING_HOURS) {
                workingHour = TOTAL_WORKING_HOURS;
                break;
            }
            double empCheck = Math.floor(Math.random() * 10) % 3;
            switch ((int) empCheck) {
                case IS_FULL_TIME:
                    workingHour += EMP_FULL_DAY_HOUR;
                    countFullDaysWorking++;
                    break;
                case IS_PART_TIME:
                    workingHour += EMP_HALF_DAY_HOUR;
                    countHalfDayWorking++;
                    break;
                case IS_ABSENT:
                    countAbsentDays++;
            }
        }
    }

    void empWageCal() {

        int employeeWage;
        int totalWorkingDays;

        if (countAbsentDays == TOTAL_WORKING_DAYS)
            System.out.println("Employee is absent for month");

        employeeWage = workingHour * EMP_WAGE_PER_HOUR;
        totalWorkingDays = countFullDaysWorking + countHalfDayWorking;
        System.out.println("Employee is Absent for : " + countAbsentDays + " days.");
        System.out.println("Employee is Half day present for : " + countHalfDayWorking + " days.");
        System.out.println("Employee is full day present for : " + countFullDaysWorking + " days.");
        System.out.println("Employee total working hour is : " + workingHour + " hrs");
        System.out.println("Employee is present for " + totalWorkingDays + " days in a month and wage is : " + employeeWage);
    }
}