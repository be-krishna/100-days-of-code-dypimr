import java.util.Scanner;

public class Greeting {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);      
	      System.out.println("Enter Your Name:");      
	      String name = s.nextLine();
	      System.out.println("Welcome to the world of Coding " + name);
	}
}
