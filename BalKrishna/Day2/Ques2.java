package BalKrishna.Day2;

import java.util.Scanner;

/**
 * Ques2
 */
public class Ques2 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Hi, what is your name?");
    String name = scanner.nextLine();

    System.out.println("Hello, " + name + "! How are you?");

    scanner.close();
  }
}