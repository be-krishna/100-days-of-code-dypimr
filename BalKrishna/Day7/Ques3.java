import java.util.Scanner;

public class Ques3 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter no of rows: ");

        int rows = scanner.nextInt();
        int value = 1;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(value + " ");
                value += 1;
            }
            System.out.println();
        }

        scanner.close();
    }
}
