import java.util.Scanner;

public class comp_three_no {
    public static void main(String[] args) {
     
     
  Scanner sc = new Scanner(System.in);
 
  System.out.print("Enter 1st number: ");
  int num1 = sc.nextInt();
 
  System.out.print("Enter 2nd number: ");
  int num2 = sc.nextInt();
 
  System.out.print("Enter 3rd number: ");
  int num3 = sc.nextInt();
 
 
    if (num1 > num2)
    if (num1 > num3)
    System.out.println("The greatest: " + num1);
 
    if (num2 > num1)
    if (num2 > num3)
    System.out.println("The greatest: " + num2);
 
    if (num3 > num1)
    if (num3 > num2)
    System.out.println("The greatest numbers is : " + num3);
 
        


    }
}
