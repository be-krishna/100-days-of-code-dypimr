package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //declare n initialize cn as 0
        int n,cn=0;
        //scanner class
        Scanner sc= new Scanner(System.in);

       //while statement bcause we don't know the range
        while (true) {
            //taking user input
            System.out.print("Write numbers :   ");
            n = sc.nextInt();
            //if n is equal to -1 then loop will be stop and prints the following statement
            if (n == -1) {
                System.out.println("Thx! Bye!");
                break;
            }

        }


    }
}
