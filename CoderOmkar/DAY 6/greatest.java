package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n1,n2,n3;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("enter the 1st number :");
        n1 = sc.nextInt();

        System.out.println("enter the 2nd number :");
        n2 = sc.nextInt();

        System.out.println("enter the 3rd number :");
        n3 = sc.nextInt();
        
        //if condition for n1 checking 
        if (n1>n2 && n1>n3){
            System.out.println("n1 is greatest number");
        }
        //else if condition for n2 checking
       else if (n2>n1 && n2>n3){
            System.out.println("n2 is greatest number");
        }
        //else condition for n3 checking
       else {
            System.out.println("n3 is greatest number");
        }
    }


}
