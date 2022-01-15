import java.util.Scanner;

public class Ques1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number of rows: ");
        int rows = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= rows; i++) {
            System.out.println();
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
        }

        scanner.close();
    }
}
