import java.util.Random;
import java.util.Scanner;

public class LiabraryToTask6 {

    public void printName(String name) {
        for (int i = 0; i < 10; i++) {
            System.out.println(name);
        }
    }

    public void printOddSquares() {
        for (int i = 1; i <= 9; i += 2) {
            System.out.println(i + "^2 = " + (i * i));
        }
    }

    public void sumOfFirstNIntegers() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть кількість чисел: ");
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("Сума перших " + n + " цілих додатних чисел: " + sum);
    }

    public void sumOfOddSeries() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть кількість членів ряду: ");
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += (2 * i + 1);
        }
        System.out.println("Сума перших " + n + " членів ряду: " + sum);
    }

    public void sumOfHarmonicSeries() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть кількість членів ряду: ");
        int n = scanner.nextInt();
        double sum = 0.0;
        for (int i = 1; i <= n; i++) {
            sum += 1.0 / i;
        }
        System.out.println("Сума перших " + n + " членів гармонійного ряду: " + sum);
    }

    public void printPowersOfTwo() {
        for (int i = 0; i <= 10; i++) {
            System.out.println("2^" + i + " = " + (int) Math.pow(2, i));
        }
    }

    public void calculateFactorial() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть число для обчислення факторіалу: ");
        int n = scanner.nextInt();
        System.out.println(n + "! = " + factorial(n));
    }

    private int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public void printFunctionValues() {
        double step = 0.25;
        for (double x = -2; x <= 2; x += step) {
            double y = -2.4 * Math.pow(x, 2) + 5 * x - 3;
            System.out.printf("y(%.2f) = %.2f%n", x, y);
        }
    }

    public void generateRandomNumbers() {
        Random random = new Random();
        int sum = 0;
        System.out.print("Згенеровані числа: ");
        for (int i = 0; i < 10; i++) {
            int num = random.nextInt(10) + 1;
            System.out.print(num + " ");
            sum += num;
        }
        System.out.println("\nСереднє арифметичне: " + (double) sum / 10);
    }

    public void isPrimeNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть число для перевірки на простоту: ");
        int n = scanner.nextInt();
        if (isPrime(n)) {
            System.out.println(n + " є простим числом.");
        } else {
            System.out.println(n + " не є простим числом.");
        }
    }

    private boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}