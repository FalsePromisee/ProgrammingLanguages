package Task_10;
import java.util.Scanner;

public class FibonacciRecursive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть максимальне значення числа Фібоначчі: ");
        int limit = scanner.nextInt();

        int index = 0;
        while (true) {
            int fib = fibonacci(index);
            if (fib >= limit) break;

            System.out.println(index + " - " + fib);
            index++;
        }
    }

    public static int fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
