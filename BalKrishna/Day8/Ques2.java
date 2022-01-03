package BalKrishna.Day8;

import java.util.Scanner;

/**
 * Question 2: Print Right Angled Triangle Star Pattern in java.
 * The pattern like:
 * 
 * |*
 * |* *
 * |* * *
 * |* * * *
 */

public class Ques2 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter no of rows:");
    int rows = scanner.nextInt();

    for (int i = 1; i <= rows; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }
}
