package BalKrishna.Day2;

import java.util.Scanner;

/**
 * Question 2. Take name as input and print a greeting message for that name.
 */
public class Ques2 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    // Read input from user
    System.out.println("Hi, what is your name?");
    String name = scanner.nextLine();

    // concatenate the input with message of your choice
    System.out.println("Hello, " + name + "! How are you?");

    scanner.close();
  }
}