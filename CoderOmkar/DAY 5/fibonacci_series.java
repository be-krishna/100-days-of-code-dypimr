package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //declare and initialize elements
        int n,first_num=0,second_num=1,next_num,i;


        //scanner class
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the no. of terms : ");
        n= sc.nextInt();

        //prints 1st and 2nd term
        System.out.print(first_num+" "+second_num);

        //using for loop bcoz we know the range
        for (i=2;i<=n;i++){                         //the loop starting from two bcoz we already print 1st and 2nd term
            next_num=first_num+second_num;

            System.out.print(" "+next_num);

            first_num=second_num;
            second_num=next_num;
        }
    }


}
Output : 
Enter the no. of terms : 10
0 1 1 2 3 5 8 13 21 34 55
