package com.company;

import java.time.YearMonth;
import java.util.Scanner;

public class no_of_days {

    public static void main(String[] args)
    {
        int year, month;
        Scanner sc = new Scanner(System.in);

        String[] monthName = new String[] {"January", "February", "March", "April", "May", "June", "July",
                "August", "September", "October", "November", "December"};

        System.out.println("Enter the year : ");
        year = sc.nextInt();

        System.out.println("Enter the month : ");
        month = sc.nextInt();

        YearMonth yearMonthObject = YearMonth.of(year, month);
        int daysInMonth = yearMonthObject.lengthOfMonth();

        System.out.println(monthName[month - 1] + " " + year +" has " + daysInMonth + " days ");
    }
}
