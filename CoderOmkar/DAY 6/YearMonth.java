package com.company;

//imported this package for this problem
import java.time.YearMonth;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int year,month;
        //Scanner class
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Year : ");
        year = sc.nextInt();

        System.out.println("Enter the Month : ");
        month = sc.nextInt();

        //created object named as "yearMonthObject" and Syntax of java.time.YearMonth;
        YearMonth yearMonthObject = YearMonth.of(year, month);
        //declare daysInMonth as "yearMonthObject"object and added method lengthOfMonth()
        int daysInMonth = yearMonthObject.lengthOfMonth();
        System.out.println(daysInMonth);
    }


}
