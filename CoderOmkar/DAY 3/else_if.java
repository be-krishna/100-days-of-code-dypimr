package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //firstly we can take user input
        //after that we use if and else if statement for this code
         int n;

         Scanner sc =new Scanner(System.in);
        System.out.println("enter the number : ");
          n= sc.nextInt();

        
          if (n<0){
              System.out.println("Impossible");
          }

           else if (n<=49){
                System.out.println("failed");
            }

            else if (n<=59){
                System.out.println("1");
            }

            else if (n<=69){
                System.out.println("2");
            }

           else if (n<=79){
                System.out.println("3");
            }

           else if (n<=89){
                System.out.println("4");
            }

           else if (n<=99){
                System.out.println("5");
            }

            else{
                System.out.println("incredible!");
            }
       }
}
