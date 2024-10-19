package Task_5;
import java.util.Scanner;

public class Task5Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            int steps = 0;

            System.out.println("Starting number: " + n);

            while (n != 1) {
                if (n % 2 == 0) {
                    n = n / 2;
                } else {
                    n = 3 * n + 1;
                }
                steps++;
                System.out.println("Next number: " + n);
            }

            System.out.println("Total steps: " + steps);
        }

        sc.close();
    }
}