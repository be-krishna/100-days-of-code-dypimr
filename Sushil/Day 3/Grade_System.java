package Day_3;

import java.util.Scanner;

public class Grade_System {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Given Grades[0-100]:");
		int grades = sc.nextInt();       // Tale Use Input
    
    //Here we start if else if statment to handle all our cases and the default one at last if Input Exceed the given range 
		if(grades<0) {
			System.out.println("Impossible");
		}else if(grades <= 49){
			System.out.println("Failed");
		}else if(grades <= 59){
			System.out.println("1");
		}else if(grades <= 69){
			System.out.println("2");
		}else if(grades <= 79){
			System.out.println("3");
		}else if(grades <= 89){
			System.out.println("4");
		}else if(grades <= 100){
			System.out.println("5");
		}else {
			System.out.println("Incredible!");
		}	
		sc.close();
	}

}
