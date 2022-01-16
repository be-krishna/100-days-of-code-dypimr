/*Write a Java program to calculate the average value of array elements.*/ 

public class Que_3 {

	 public static void main(String[] args) {
	        System.out.print("Original array: " );
	            
	        int[] input = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	        for(int i = 0; i < input.length ; i++) {
	            System.out.print(input[i] + " ");
	        }
	        System.out.println();
	        int sum = 0;
	        //Loop through the array to get the sum
	        for(int i=0; i<input.length; i++) {
	            sum = sum + input[i] ;
	        }
	        // now will divide the sum by the length to get average
	       float Average = (float) sum / (float) input.length;
	        System.out.println("The sum is " + Average);
	       }

}
