 /*Write a Java program to sum values of an array.*/ 

public class Que_2 {
 public static void main(String[] args) {
    System.out.print("Original array: " );
		
    int[] input = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    for(int i = 0; i < input.length ; i++) {
        System.out.print(input[i] + " ");
    }
    System.out.println();
    
    int sum = 0;
    //Loop through the array 
    for(int i=0; i<input.length; i++) {
        sum = sum + input[i];
    }
    System.out.println("The sum is " + sum);
     }
}
