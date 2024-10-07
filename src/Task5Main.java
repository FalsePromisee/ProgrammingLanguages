
import java.util.Scanner;

public class Task5Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first int number: ");
        int squareValue = 2;
        if(sc.hasNextInt()){
            double firstInput = sc.nextInt();

            System.out.println("Enter second int number: ");

            if(sc.hasNextInt()){
                double secondInput = sc.nextInt();
                double result = Math.sqrt(Math.pow(firstInput, squareValue) + Math.pow(secondInput, squareValue));
                System.out.println("Sum of squares: ");
                System.out.println(result);
            }else {
                System.out.println("Invalid input");
            }
        } else{
            System.out.println("Invalid input");
        }

    }
}