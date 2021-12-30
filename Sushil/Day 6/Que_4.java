/*Write a Java program that reads an integer and check whether it is negative, zero, or positive. */

package Day_6;

import java.util.Scanner;

public class Que_4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number: ");
		int input = sc.nextInt();
		
		if(input > 0) {
			System.out.println("The Number is Positive");
		}else if(input < 0) {
			System.out.println("The Number is Negative");
		} else {
			System.out.println("The Number is zero");
		}
		sc.close();
	}

}
