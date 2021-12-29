import java.util.Scanner;
public class even_odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;  //Declare a variable
        System.out.println("Enter a number:");
        num = sc.nextInt();
    
        //If number is divisible by 2 then it's an even number
        //else odd number
        if ( num % 2 == 0 )
            System.out.println("The entered number is even");
         else
            System.out.println("The entered number is odd");
     
    }
}
