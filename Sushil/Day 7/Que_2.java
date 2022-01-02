/*Write a program in Java to make such a pattern like right angle triangle with a number which will repeat a number in a row.*/ 
package Day_7;

import java.util.Scanner;

public class Que_2 {

	public static void main(String[] args) {
		int num;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		num = sc.nextInt();
		
		for(int i = 1 ; i <= num ; i++) {
			for(int j = 1 ; j <= i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
     sc.close();
}
