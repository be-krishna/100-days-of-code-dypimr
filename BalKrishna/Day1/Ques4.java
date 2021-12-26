package BalKrishna.Day1;

import java.util.Scanner;

/**
 * Question 4. Take 2 numbers as inputs and find their HCF and LCM.
 */

public class Ques4 {
  public static void main(String[] args) {
    int first_number, second_number, lcm, hcf = 0;

    Scanner scanner = new Scanner(System.in);

    // Reading user inputs

    System.out.println("Enter first number:");
    first_number = Integer.valueOf(scanner.nextLine());

    System.out.println("Enter second number:");
    second_number = Integer.valueOf(scanner.nextLine());

    // For HCF loop from 1 to the highest of two numbers.

    for (int i = 1; i <= first_number && i <= second_number; i++) {

      // If the both numbers are completely divided by i then it is the hcf
      if (first_number % i == 0 && second_number % i == 0) {
        hcf = i;
      }
    }

    lcm = (first_number * second_number) / hcf;
    System.out.println("LCM = " + lcm + ", HCF = " + hcf);

    scanner.close();
  }
}
