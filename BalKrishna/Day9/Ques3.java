package BalKrishna.Day9;

import java.util.Scanner;

public class Ques3 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the number of rows: ");
    int rows = scanner.nextInt();

    for (int i = 0; i < rows; i++) {
      System.out.println();
      for (int j = 1; j < rows - i; j++) {
        System.out.print(" ");
      }
      // if first or last row print stars equal to row number
      if (i == 0 || i == rows - 1) {
        for (int j = 0; j <= i; j++) {
          System.out.print("* ");
        }
      } else {
        // for rows other than first and last, print stars with spaces between them
        // increasing oddly, i.e 1, 3, 5...
        System.out.print("*");
        for (int j = 0; j < (i * 2 - 1); j++) {
          System.out.print(" ");
        }
        System.out.print("*");
      }
    }
    System.out.println();
    scanner.close();
  }
}
