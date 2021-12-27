package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //firstly we can take user input
        //after that we use if and else if statement for this code
        //first checking a number is divide by 3 and 5 both then print fizzbuzz and loop stop
        //if 1st condition false then checking a 2nd condition if true then print fizz
        //if 2nd condition false then checking a 2nd condition if true then print buzz
        //if all conditions false then code will be print a else statement i.e. "error"

         int n;

         Scanner sc =new Scanner(System.in);
        System.out.println("enter the number : ");
          n= sc.nextInt();

          if (n%3==0 && n%5==0){
            System.out.println("fizzbuzz");
            }
           else if (n%3==0){
              System.out.println("fizz");
            }
          else if (n%5==0){
            System.out.println("buzz");
            }
           else{
              System.out.println("error");
          }




    }
}
