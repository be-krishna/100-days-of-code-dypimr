/*Write a Java program that keeps a number from the user and generates an integer between 1 and 7 and displays the name of the weekday. */

package Day_6;

import java.util.Scanner;

public class Que_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number from 1 - 7 :");
		int Input = sc.nextInt();
		
		switch(Input) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thusday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		default: 
			System.out.println("Your Input is incorret:");
		}
		sc.close();
	}

}
