package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n;
        //scanner class
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the number : ");
        n = sc.nextInt();

        //if condition for check n is negative or not
        if(n<0){
            System.out.println("number is Negative");
        }
        
        //if "if condition" fails then else if condition will run
        else if(n==0){
            System.out.println("Neutral");
        }
        
        //if "if condition","else if condition" fails then finally else condition will run
        else{
            System.out.println("number is Positive");
        }


    }


}
