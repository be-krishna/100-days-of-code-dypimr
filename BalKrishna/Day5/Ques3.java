package BalKrishna.Day5;

import java.util.Scanner;

/**
 * Question 3: Write a program to calculate the sum of following series where n
 * is input by user.
 * 1 + 1/2 + 1/3 + 1/4 + 1/5 +…………1/n
 */

public class Ques3 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a number:");
    int number = Integer.valueOf(scanner.nextLine());
    float sum = 0;

    for (float i = 1; i <= number; i++) {
      sum = sum + (1 / i);
    }

    System.out.println("Sum is: " + sum);

    scanner.close();
  }
}
