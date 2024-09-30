
    import java.util.Arrays;
    import java.util.Scanner;
    
    public class Task4Main {
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
                    int usersAverageArithmetic = Arrays.stream(usersArray).sum() / usersArrayLength;
    
                    System.out.println("Average arithmetic number of your Array: " + usersAverageArithmetic);
                } else {
                    System.out.println("Invalid Input");
                }
            } else {
                System.out.println("Invalid Input");
            }
            sc.close();
        }
    }