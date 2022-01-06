package BalKrishna.Day10;

import java.util.Arrays;

/**
 * Question 1:
 * Original numeric array : [1789, 2035, 1899, 1456, 2013, 1458, 2458, 1254,
 * 1472, 2365, 1456, 2165, 1457, 2456] // if you Input this type
 * Sorted numeric array : [1254, 1456, 1456, 1457, 1458, 1472, 1789, 1899, 2013,
 * 2035, 2165, 2365, 2456, 2458] // after sorting it will look like this
 */
public class Ques1 {

  public static void main(String[] args) {
    int[] original = new int[] { 1789, 2035, 1899, 1456, 2013, 1458, 2458, 1254, 1472, 2365, 1456, 2165, 1457, 2456 };

    System.out.println("Original numeric array: ");
    for (int i : original) {
      System.out.print(i + " ");
    }

    System.out.println();

    Arrays.sort(original);

    System.out.println("Sorted numeric array: ");
    for (int i : original) {
      System.out.print(i + " ");
    }

    System.out.println();
  }
}