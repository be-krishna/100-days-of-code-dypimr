/*Write a program to print Fibonacci series of n terms where n is input by user*/

package Day_5;

import java.util.Scanner;

public class Que_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int input = sc.nextInt();
		
		int firstNumber = 0;
		int secondNumber = 1;
		
		System.out.print(firstNumber + " ");
		System.out.print( secondNumber + " ");
		
		for(int i=0 ; i < input-2 ; i++) {
			
			int lastNumber = firstNumber + secondNumber;
			System.out.print(lastNumber+ " ");
			firstNumber = secondNumber;
			secondNumber = lastNumber;
		}
	}

}
