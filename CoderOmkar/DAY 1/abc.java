package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //1st we take input
        // 1st we declare first_num,second_num,nex_num then we intialize first two numbers.
        //then we can print first two numbers
        //after that we can use for loop bcause we know the exact value of how many times we want run loop
        //in that loop we intialize value of i
        //i less than or equal to user input,then we do increment of i

        int n,first_num=0,second_num=1,next_num,i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        n= sc.nextInt();
        System.out.print(first_num +" "+ second_num);//prints values of first_num and second_num
        for (i=2;i<n;++i){
            next_num = first_num+second_num;
            System.out.print(" "+next_num);
            first_num=second_num;
            second_num=next_num;

        }

    }
}
