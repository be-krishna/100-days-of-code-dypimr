/*Right Angled Triangle Star Pattern in java. */ 

import java.util.Scanner;

public class Que_2 {
    public static void main(String[] args) {
       
        int number , row , col ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        number = sc.nextInt();

        for(row = 1; row <= number ; row++){

            for(col = 1; col <= row ; col++){
                System.out.print("* ");
            }

            System.out.println();
        }
        sc.close();
    }
}
