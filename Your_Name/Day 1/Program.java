package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int sum = 0;
        int x=0;  //initialize both sum and x at 0
        Scanner scan = new Scanner(System.in);
        do {                     //code to be executed  
            System.out.println("enter the number : "+x);
            x=scan.nextInt();    //user input              
            sum=sum+x;           //formula (also as sum+=x) 
        }
        while(x!=0);          
        {
            System.out.println("the sum is : " + sum);   //if this loop condition will true then loop terminate and print this result ,otherwise loop will be execute and take user input
        }
    }
}
