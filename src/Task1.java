import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("Please enter ur mark or type /q to quit: ");
            if(sc.hasNextInt()){
                int mark = sc.nextInt();

        if (mark >= 91 && mark <= 100) {
            System.out.println("Excellent");
            continue;
        } else if (mark >= 81 && mark <= 90) {
            System.out.println("Very good");
            continue;
        } else if (mark >= 71 && mark <= 80) {
            System.out.println("Good");
            continue;
        } else if (mark >= 66 && mark <= 70) {
            System.out.println("Satisfactorily");
            continue;
        }else if(mark >= 60 && mark <= 65){
            System.out.println("Weakly");
            continue;
        } else if (mark >= 30 && mark <= 59) {
            System.out.println("Bad");
            continue;
        } else if (mark >= 0 && mark <= 29) {
            System.out.println("Very bad");
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


