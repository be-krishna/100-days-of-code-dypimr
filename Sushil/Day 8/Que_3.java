// package Day_8;

import java.util.Scanner;

public class Que_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value: ");
		int num = sc.nextInt();
		
		for(int i =1; i<=num; i++) {
			for(int j = 1; j <= num - i; j++) {
				System.out.print("  ");
			}
			for(int j = 1; j <= i ; j++) {
				System.out.print("*  ");
			}
			System.out.println();
		}
        sc.close();
	}

}
