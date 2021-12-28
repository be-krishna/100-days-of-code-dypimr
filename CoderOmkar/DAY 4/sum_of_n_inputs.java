package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //declare n initialize sum as 1
        int n,sum=1;
        //scanner class
        Scanner sc= new Scanner(System.in);

       //while statement bcause we don't know the range
        while (true) {
            //taking user input
            System.out.print("Write numbers :   ");
            n = sc.nextInt();
            //formula for sum of n numbers
            sum=sum+n;
            //if condition 
            if (n==-1) {
                System.out.println("Thx! Bye!");
                break;
            }
        }
        //prints sum of all user inputs
        System.out.println("sum is : "+sum);
    }
}
