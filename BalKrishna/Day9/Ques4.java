package BalKrishna.Day9;

import java.util.Scanner;

public class Ques4 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String character = "*";

    // size of individual square
    int size = 5;

    System.out.println("Enter dimension:");
    // dimension of output i.e. dimension x dimension
    // e.g. 2 -> 2 x 2
    int dimension = scanner.nextInt();

    // loop for no of rows
    for (int i = 0; i <= size * dimension; i++) {
      // calculate amount of space for even distribution
      int space = (size * dimension * 2 - 3) / dimension;

      // for top and bottom vertices
      if (i == 0 || i == (size * dimension)) {
        for (int j = 0; j <= size * dimension; j++) {
          System.out.print(character + " ");
        }
        System.out.println();
        continue;
      }

      // for horizontal rows
      // if current row is multiple of spacce, then divide
      if (i % size == 0) {
        for (int j = 0; j <= size * dimension; j++) {
          System.out.print(character + " ");
        }
        System.out.println();
      } else {
        // for vertical rows

        // for left most vertex
        System.out.print(character);

        // for middle vertices

        // creates string of spaces
        String mid = " ".repeat(space);
        for (int j = 0; j < dimension; j++) {

          System.out.print(mid);
          System.out.print(character);
        }
        System.out.println();
      }
    }

    scanner.close();
  }
}
