package BalKrishna.Day6;

import java.util.Scanner;

/**
 * Question 1: Take three numbers from the user and print the greatest number?
 * 
 * Input the 1st number: 25
 * Input the 2nd number: 78
 * Input the 3rd number: 87
 * 
 * Expected Output :
 * The greatest: 87
 */

public class Ques1 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Please enter integers to be compared:");
    System.out.println("First number:");
    int first_number = Integer.valueOf(scanner.nextLine());
    System.out.println("Second number:");
    int second_number = Integer.valueOf(scanner.nextLine());
    System.out.println("Third number:");
    int third_number = Integer.valueOf(scanner.nextLine());

    if (first_number >= second_number && first_number >= third_number) {
      System.out.println("The greatest: " + first_number);
    } else if (second_number >= first_number && second_number >= third_number) {
      System.out.println("The greatest: " + second_number);
    } else {
      System.out.println("The greatest: " + third_number);
    }

    scanner.close();
  }
}
