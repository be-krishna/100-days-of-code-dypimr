package BalKrishna.Day9;

import java.util.Scanner;

public class Ques2 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the number of rows: ");
    int rows = scanner.nextInt();

    for (int i = 1; i <= rows; i++) {
      System.out.println();
      for (int j = 1; j < i; j++) {
        System.out.print(" ");
      }
      for (int j = 0; j <= rows - i; j++) {
        System.out.print("* ");
      }
    }

    for (int i = 1; i < rows; i++) {
      System.out.println();
      for (int j = 1; j < rows - i; j++) {
        System.out.print(" ");
      }
      for (int j = 0; j <= i; j++) {
        System.out.print("* ");
      }
    }
    System.out.println();
  }
}
