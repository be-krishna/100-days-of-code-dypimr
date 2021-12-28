package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int point;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the points:");
        point= sc.nextInt();
        if(point<0)
            System.out.println("Grade : Impossible");
        else if(point<=49)
            System.out.println("Grade : Failed");
        else if(point<=59)
            System.out.println("Grade : 1");
        else if(point<=69)
            System.out.println("Grade : 2");
        else if(point<=79)
            System.out.println("Grade : 3");
        else if(point<=89)
            System.out.println("Grade : 4");
        else if(point<=100)
            System.out.println("Grade : 5");
        else
            System.out.println("Grade : Incredible");
    }
}
