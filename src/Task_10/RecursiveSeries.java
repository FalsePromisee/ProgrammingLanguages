package Task_10;
import java.util.Scanner;

public class RecursiveSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть число K: ");
        int k = scanner.nextInt();

        int sum = 0;
        for (int n = 0; n <= k; n++) {
            sum += series(n);
        }

        System.out.println("Сума ряду: " + sum);
    }

    public static int series(int n) {
        if (n == 0 || n == 1) return 1;
        if (n == 2) return 2;
        return series(n - 1) + series(n - 3);
    }
}