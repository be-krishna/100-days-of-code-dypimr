
package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n, row, col, inc=1;


        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number : ");
        n = sc.nextInt();

        for (row = 1; row <= n; row++) {

            for (col = 1; col <= row ; col++) {
                System.out.print(inc++ + " ");
            }

            System.out.println();
        }
    }

}

enter the number : 4
1 
2 3 
4 5 6 
7 8 9 10 
 
