package Task_2;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {        
        Scanner sc = new Scanner(System.in);
        
        while(true){
            System.out.printf("Enter integer to check if it is even or, /q to quit : ");
            if(sc.hasNextInt()){
                int number = sc.nextInt();
                System.out.printf("The number '%s' is %s%n", number, ifNumberIsEven(number) ? "even" : "odd" );
                sc.nextLine();
                continue;
            }
            if(sc.hasNextLine()){
                String line = sc.nextLine();

                if(line.equals("/q")){
                    return;                    
                }
                else{
                    System.out.println("Invalid input");
                }
            }
        }
        
    }
    public static Boolean ifNumberIsEven(int number){
        return number % 2 == 0;
    }


}