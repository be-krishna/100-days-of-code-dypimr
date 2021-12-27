package BalKrishna.Day3;

import java.util.Scanner;

/**
 * 1. The table below describes how the grade for a particular course is
 * determined. Write a program that gives a course grade according to the
 * provided table.
 * | points | grade |
 * | ------ | ----------- |
 * | < 0 | impossible! |
 * | 0-49 | failed |
 * | 50-59 | 1 |
 * | 60-69 | 2 |
 * | 70-79 | 3 |
 * | 80-89 | 4 |
 * | 90-100 | 5 |
 * | > 100 | incredible! |
 */
public class Ques1 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Read input from user
    System.out.println("Give points [0-100]:");
    int points = Integer.valueOf(scanner.nextLine());

    // check the input against conditions
    if (points < 0) {
      System.out.println("impossible!");
    } else if (points <= 49) {
      System.out.println("failed");
    } else if (points <= 59) {
      System.out.println("1");
    } else if (points <= 69) {
      System.out.println("2");
    } else if (points <= 79) {
      System.out.println("3");
    } else if (points <= 89) {
      System.out.println("4");
    } else if (points <= 100) {
      System.out.println("5");
    } else {
      System.out.println("incredible!");
    }

    scanner.close();
  }
}