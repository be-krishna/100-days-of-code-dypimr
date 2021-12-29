package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //declare n initialize sum as 1
        int n,sum=0,count=0,even=0,odd=0;
        double avg=0;
        
        //scanner class
        Scanner sc= new Scanner(System.in);

       //while statement bcause we don't know the range
        while (true) {
            //taking user input
            System.out.print("Write numbers :   ");
            n = sc.nextInt();
            
            //if condition                      QUE. 1
            if (n==-1) {
                System.out.println("Thx! Bye!");
                break;
            } 
            
            //formula for sum of n numbers      QUE. 2
            sum=sum+n;
           
            //increase counter by 1             QUE. 3
            //after that we want to count number of n ,alternatively we also do cn+=1,(cn=cn+1)
            count++;
            
            //average formula                   QUE. 4
            avg=(double)sum/count; //typecasting of sum and count into double

            // counts even no. in user input    QUE. 5
            if (n%2==0) {
                even++;
            }
            //counts odd no. in user input
            else{
                odd++;
            }


        }
        //prints sum of all user inputs
        System.out.println("sum is : "+sum);
       
        //prints no.of numbers
        System.out.println("Numbers are : "+count);
       
        //prints average of numbers
        System.out.println("Average is : "+avg);
        
        //prints no. of even numbers
        System.out.println("even numbers : "+even);
        
        //prints no. of odd numbers
        System.out.println("even numbers : "+odd);
    }
}
