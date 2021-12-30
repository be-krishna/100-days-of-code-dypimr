/*Write a program to calculate the sum of following series where n is input by user.
 * 1 + 1/2 + 1/3 + 1/4 + 1/5 +…………1/n*/


package Day_5;

import java.util.Scanner;

public class Que_3 {

	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
		
		int input = sc.nextInt();
		float sum = 0;
		
		for(float i = 1; i <= input ; i++) {
			sum = sum + (1/i);
		}
		System.out.println("The Sum of n number is :" + sum);
       
	}

}
