
import java.util.Scanner;

/**
 * Question 3: Write a Java program that keeps a number from the user and
 * generates an integer between 1 and 7 and displays the name of the weekday.
 * Input number: 3
 * 
 * Expected Output :
 * Wednesday
 */

public class Ques3 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String[] weeks = new String[] { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };

    System.out.println("Input number:");

    int weekNo = Integer.valueOf(scanner.nextLine());

    System.out.println(weeks[weekNo - 1]);

    scanner.close();

  }
}
