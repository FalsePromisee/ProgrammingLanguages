import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Enter number of the week or, /q to quit: ");
        if (sc.hasNextInt()) {
            int number = sc.nextInt();
            

            switch (number) {
                case 1:
                    System.out.println("Monday");
                    continue;
                case 2:
                    System.out.println("Tuesday");
                    continue;
                case 3:
                    System.out.println("Wednesday");
                    continue;
                case 4:
                    System.out.println("Thursday");
                    continue;
                case 5:
                    System.out.println("Friday");
                    continue;
                case 6:
                    System.out.println("Saturday");
                    continue;
                case 7:
                    System.out.println("Sunday");
                    continue;                    
                default:
                    System.out.println("Invalid number");
                    continue;                    
                }            

            }
            if(sc.hasNextLine()){
                String line = sc.nextLine();
                if(line.equals("/q")){
                    return;
                }
                else {
                    System.out.println("Invalid value");
                }

            }
        }
        
        
        
    }
}
