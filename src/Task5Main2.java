
import java.util.Scanner;

public class Task5Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        boolean firstInput = true;

        System.out.println("Enter numbers (enter 0 to stop):");

        while (true) {
            String input = sc.nextLine();

            if (input.equals("0") || input.equalsIgnoreCase("stop")) {
                break;
            }

            try {
                int number = Integer.parseInt(input);

                if (firstInput) {

                    min = max = number;
                    firstInput = false;
                } else {
                    if (number < min) {
                        min = number;
                    }
                    if (number > max) {
                        max = number;
                    }
                }

            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid integer or '0'/'stop' to finish.");
            }
        }
        if (firstInput) {
            System.out.println("No numbers were entered.");
        } else if (min == max) {
            System.out.println("The only number entered is both the minimum and the maximum: " + min);
        } else {
            System.out.println("Minimum number: " + min);
            System.out.println("Maximum number: " + max);
        }

        sc.close();
    }
}