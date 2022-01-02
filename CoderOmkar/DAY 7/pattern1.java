package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n, row, col;


        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number : ");
        n = sc.nextInt();

        for (row = 1; row <= n; row++) {

            for (col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }

            System.out.println();
        }
    }

}


Output : 
enter the number : 5
1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5 
