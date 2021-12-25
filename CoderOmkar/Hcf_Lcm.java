package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n1,n2, gcd = 1;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the First number");
        n1= sc.nextInt();

        System.out.println("Enter the Second number");
        n2= sc.nextInt();
        for(int i = 1; i <= n1 && i <= n2; ++i) {
            // Checks if i is factor of both integers
            if(n1 % i == 0 && n2 % i == 0)
                gcd = i;

        }
        int lcm = (n1 * n2) / gcd;
        System.out.println("The LCM of These numbers are : "+lcm);
        System.out.println("The GCD of These numbers are : "+gcd);
    }
}
