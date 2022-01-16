
import java.time.YearMonth;
import java.util.Scanner;

/**
 * Question 2: Write a Java program to find the number of days in a month.
 * Input a month number: 2
 * Input a year: 2016
 * 
 * Expected Output :
 * February 2016 has 29 days
 */

public class Ques2 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String[] monthName = new String[] { "January", "February", "March", "April", "May", "June", "July", "August",
        "September", "October", "November", "December" };

    System.out.println("Input a month number:");
    int month = Integer.valueOf(scanner.nextLine());

    System.out.println("Input a year:");
    int year = Integer.valueOf(scanner.nextLine());

    YearMonth yearMonthOf = YearMonth.of(year, month);
    int daysInMonth = yearMonthOf.lengthOfMonth();

    System.out.println(String.format("%s %d has %d days", monthName[month - 1], year, daysInMonth));

    scanner.close();
  }
}
