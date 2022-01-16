
import java.util.Scanner;

/**
 * Question 4. Write a Java program that reads an integer and check whether it
 * is negative, zero, or positive.
 * Input a number: 7
 * Expected Output :
 * 
 * Number is positive
 */

public class Ques4 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Input a number:");
    int number = Integer.valueOf(scanner.nextLine());

    if (number > 0) {
      System.out.println("Number is positive");
    } else if (number < 0) {
      System.out.println("Number is negative");
    } else {
      System.out.println("Number is zero");
    }

    scanner.close();
  }
}
