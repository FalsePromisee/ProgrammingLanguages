
import java.util.Scanner;

public class Task4Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of array: ");

        if (sc.hasNextInt()) {
            int usersArrayLength = sc.nextInt();
            sc.nextLine();
            if (usersArrayLength > 0) {
                int[] usersArray = new int[usersArrayLength];
                for (int i = 0; i < usersArrayLength; i++) {
                    System.out.println("Enter array element: ");
                    if (sc.hasNextInt()) {
                        usersArray[i] = sc.nextInt();
                        sc.nextLine();
                    } else {
                        sc.nextLine();
                        i--;
                        System.out.println("Wrong input ");

                    }
                }
                System.out.println("Your Array in reverse order: ");
                for (int i = usersArrayLength - 1; i >= 0; i--) {
                    System.out.print(usersArray[i] + "; ");
                }

            } else {
                System.out.println("Invalid Input");
            }
        } else {
            System.out.println("Invalid Input");
        }
        sc.close();
    }
}
