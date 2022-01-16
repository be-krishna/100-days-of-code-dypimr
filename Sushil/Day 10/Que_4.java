/*Write a Java program to print the 10 x 10 grid. */ 

import java.util.Scanner;

public class Que_4 {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enters size of grid: ");
		int size = sc.nextInt();
		
		for(int i = 0; i< size ; i++) {
			
			for(int j = 0 ; j < size ; j++) {
				System.out.print("- ");
			}
			System.out.println();
		}
		System.out.println();
		sc.close();

	}
}
