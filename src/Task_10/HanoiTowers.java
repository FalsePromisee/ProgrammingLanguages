package Task_10;
import java.util.Scanner;

public class HanoiTowers {
    static int moveCount = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numDisks = scanner.nextInt();
        int targetPeg = scanner.nextInt();

        if (targetPeg != 2 && targetPeg != 3) {
            return;
        }

        hanoi(numDisks, 1, targetPeg, 6 - 1 - targetPeg);
        System.out.println(moveCount);
    }

    public static void hanoi(int n, int fromPeg, int toPeg, int auxPeg) {
        if (n == 0) return;

        hanoi(n - 1, fromPeg, auxPeg, toPeg);
        System.out.println("Перемістіть диск " + n + " з голки " + fromPeg + " на голку " + toPeg);
        moveCount++;
        hanoi(n - 1, auxPeg, toPeg, fromPeg);
    }
}
