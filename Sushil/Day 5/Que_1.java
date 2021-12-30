/*Write a program that prompts the user to input an integer and then outputs the number with the digits reversed. */

package Day_5;

import java.util.Scanner;

public class Que_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Numbers: ");
    
		int num = sc.nextInt();
		int input = num; 
		int reversedNumber = 0;
	
		while( input > 0) {
			int lastDigit = input % 10;   
			
			reversedNumber = reversedNumber * 10 + lastDigit;
			input = input/10;
		}
       System.out.println("The Reverse of Given Number is:" + reversedNumber);
       sc.close();
	}

}
