package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //declare and initialize elements
        int n,first_num=0,second_num=1,next_num;


        //scanner class
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the nth term : ");
        n= sc.nextInt();

        //using while loop bcoz we don't know the range
        while(n>=first_num){

            System.out.print(first_num+" ");
            
            //formula
            next_num=first_num+second_num;
            first_num=second_num;
            second_num=next_num;


        }


    }
}

Output : 
Enter the nth term : 
10
0 1 1 2 3 5 8 
