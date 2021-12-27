package BalKrishna.Day2;

import java.util.Scanner;

/**
 * Question 3: Write a program to input principal, time, and rate (P, T, R) from
 * the user and find Simple Interest.
 */
public class Ques3 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Read required input from user

    System.out.println("Principal Amount: ");
    int principal = Integer.valueOf(scanner.nextLine());

    System.out.println("Time in year: ");
    int time = Integer.valueOf(scanner.nextLine());

    System.out.println("Rate of interest: ");
    float rate = Float.valueOf(scanner.nextLine());

    // Calulate the interest
    float simple_interest = (principal * rate * time) / 100;

    System.out.println("Calcuated Interest: " + simple_interest);

    scanner.close();
  }

}