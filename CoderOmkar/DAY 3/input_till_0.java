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
            System.out.print("enter the number : ");
            n= sc.nextInt();
           //if n is equal to 0 then loop will be stop
            if(n==0){
                break;
            }
            //increase by counter 1
            //after that we want to count number of n ,alternatively we also do cn+=1,(cn=cn+1)
            cn++;
 }
        //prints the value of cn
        System.out.println("number of inputs : "+cn);

    }
}
