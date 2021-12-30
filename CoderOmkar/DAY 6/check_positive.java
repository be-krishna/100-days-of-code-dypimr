package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the number : ");
        n = sc.nextInt();

        //if condition for check n is negative or not
        if(n<0){
            System.out.println("number is negative");
        }
        //if "if condition" fails then automatically else condition will run
        else{
            System.out.println("number is positive");
        }


    }


}
