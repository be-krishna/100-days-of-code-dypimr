package BalKrishna.Day1;

import java.util.Scanner;

/**
 * Question3. Take a number as input and print the multiplication table for it.
 */

public class Ques3 {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    // Reading user input
    System.out.println("Enter a number:");
    int number = Integer.valueOf(scanner.nextLine());

    // Looping from 1 to 10, multiplying and printing
    for (int i = 1; i < 11; i++) {
      int product = number * i;

      System.out.println(number + " X " + i + " = " + product);
    }

    scanner.close();

  }
}
