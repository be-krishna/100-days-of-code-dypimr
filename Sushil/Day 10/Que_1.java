/*Write a Java program to sort a numeric array and a string array.*/ 
import java.util.Arrays;

public class Que_1 {
    public static void main(String[] args) {
        
        System.out.print("Original numeric array: ");
    	// user input array
         int[] input = {1789, 2035, 1899, 1456, 2013, 1458, 2458, 1254, 1472, 2365, 1456, 2165, 1457, 2456};
        
         for(int i = 0; i < input.length ; i++) {
        	 System.out.print(input[i] + " ");
         }
       
         System.out.println();
         
         System.out.print("Sorted numeric array: ");
         //Sorted the array in ascending order   (By default)
         Arrays.sort(input);
         
       //Displaying elements of array after sorting 
         for (int i = 0; i < input.length; i++) {     
             System.out.print(input[i] + " ");    
         }    
         
         System.out.println();
         
    }
}
