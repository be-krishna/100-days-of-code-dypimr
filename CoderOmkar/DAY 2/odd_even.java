package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int a;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number : ");
        a= sc.nextInt();
        if(a%2==0){
            System.out.println("This is an even number");
        }
        else{
            System.out.println("This is an odd number");
        }
    }
}
