package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //declare and initialize elements
        int n,rev=0,rem;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Numbers: ");
         n = sc.nextInt();
         //if number is 123
        while(n!=0)
        {
            // divide by 10 and get the last digit as remainder
            rem=n%10;
            // loop 1: remainder = 3 i.e. ( 123 % 10 )
            // loop 2: remainder = 2 i.e. ( 12 % 10 )
            // loop 3: remainder = 1 i.e. ( 1 % 10 )

            // for each place, multiply the value by 10 and add the remainder
            rev=rev*10+rem;
            // loop 1: 0 * 10 + 3 = 3
            // loop 2: 3 * 10 + 2 = 32
            // loop 3: 32 * 10 + 1 = 321

            // divide the number by 10 to eiliminate a digit
            n=n/10;
            // loop 1: 123 / 10 = 12
            // loop 2: 12 / 10 = 1
            // loop 3: 1 / 10 = 0 i.e loop break here

        }
        System.out.print("Reverse number is : "+rev);
    }


}
