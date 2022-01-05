package BalKrishna.Day9;

import java.util.Scanner;

/**
 * Question 1: Write a program to print pascal triangle
 */
public class Ques1 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the number of rows: ");
    int rows = scanner.nextInt();

    for (int i = 0; i < rows; i++) {
      for (int j = 0; j <= i; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
    for (int i = rows; i >= 0; i--) {
      for (int j = i; j >= 0; j--) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }
}