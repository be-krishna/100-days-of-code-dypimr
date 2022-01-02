/*Write a program in Java to make such a pattern like right angle triangle with number increased by 1.*/ 

package Day_7;

import java.util.Scanner;

public class Que_3 {

	public static void main(String[] args) {
		int num ;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Number: ");
		num = sc.nextInt();
		int sum = 1;
		
		for(int i= 1; i<= num ; i++){
			for(int j= 1  ; j <= i ; j++) {
				System.out.print(sum + "");
				sum += 1;
			}
			System.out.println();
		}
     sc.close();
	}

}
