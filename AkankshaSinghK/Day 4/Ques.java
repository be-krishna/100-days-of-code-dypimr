package com.company;

import java.util.Scanner;

public class day4 {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int number=0;
        int sum=0;
        int count=0;
        int evencount=0;
        int oddcount=0;

        while(true){

            System.out.println("enter the number and input -1 to stop");
            number=sc.nextInt();

            // Ques1 : print when user input -1
            if(number == -1)
            {
                System.out.println("Thnx! Bye!");
                break;
            }

            // Ques 5: find even and odd numbers count
            if(number % 2==0)
            {
                evencount++;
            }
            else
            {
                oddcount++;
            }

            //Ques 3: Number of inputs count
            count++;

            //Ques 2: Sum of all inputs except -1
            sum += number;
        }
        System.out.println("Sum of the numbers :" + sum);
        System.out.println("Number of Inputs :" + count);

        //Ques 4: Find Average of the given inputs

        double average =(double)sum/count;

        System.out.println("AVERAGE :" +average);
        System.out.println("Even :" + evencount);
        System.out.println("Odd :" +oddcount);

    }
}
