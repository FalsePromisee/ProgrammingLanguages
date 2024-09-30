
import java.util.Random;
import java.util.Scanner;

public class Task4Main3 {
    public static void main(String[] args) {

        int firstRow, secondRow, firstCol, secondCol; // створюємо колонки та рядки, які заповнить юзер
        Scanner userInput = new Scanner(System.in);

        System.out.println("Your columns in first matrix has to equals your rows in second matrix or program won't work!");

        System.out.println("Enter number of rows in first Matrix: ");
        if (userInput.hasNextInt()) {   //Просимо юзера заповнити колонки та стовпчики. А також робимо велику перевирку вводу
            firstRow = userInput.nextInt();
            userInput.nextLine();
            if (firstRow > 0) { //Після кожного вводу перевиряємо чи там числа які нас задовольняють
                System.out.println("Enter number of columns in first Matrix: ");
                if (userInput.hasNextInt()) {
                    firstCol = userInput.nextInt();
                    userInput.nextLine();
                    if (firstCol > 0) {
                        System.out.println("Enter number of rows in second Matrix: ");
                        if (userInput.hasNextInt()) {
                            secondRow = userInput.nextInt();
                            userInput.nextLine();
                            if (secondRow > 0) {
                                System.out.println("Enter number of columns in second Matrix: ");
                                if (userInput.hasNextInt()) {
                                    secondCol = userInput.nextInt();
                                    userInput.nextLine();
                                    if (secondCol > 0) {

                                        if (firstCol != secondRow) {                           //Перевиряємо чи виконується умова для множення матриць
                                            System.out.println("Multiplication impossible with this rows and columns");
                                        } else {
                                            Random random = new Random();                        //Створюємо генератор рандомних значень
                                            int[][] firstMatrix = new int[firstRow][firstCol];   //Створюємо матриці
                                            int[][] secondMatrix = new int[secondRow][secondCol];
                                            int[][] resultOfMatrixMultiply = new int[firstRow][secondCol];


                                            System.out.println("Enter range of numbers that will be in Matrix. From first number range will start");
                                            System.out.println("Enter start of range: ");  //Задаємо діапазон для рандому значень самої матриці
                                            if (userInput.hasNextInt()) {                  //Знову перевиряємо чи вводить користувач все правильно
                                                int startRangeFirstMatrix = userInput.nextInt();
                                                userInput.nextLine();


                                                System.out.println("Enter end of range: ");

                                                if (userInput.hasNextInt()) {
                                                    int endRangeFirstMatrix = userInput.nextInt();
                                                    userInput.nextLine();


                                                    for (int i = 0; i < firstRow; i++) { //Створюємо 2 цикли, щоб в кожну колонку двовимірного масива задати значення
                                                        for (int j = 0; j < firstCol; j++) {

                                                            firstMatrix[i][j] = random.nextInt(endRangeFirstMatrix) + startRangeFirstMatrix;

                                                        }

                                                    }

                                                } else {
                                                    System.out.println("Wrong Input");
                                                    return;
                                                }


                                            } else {
                                                System.out.println("Wrong Input");
                                            }


                                            System.out.println("Enter numbers for second Matrix: "); //все теж саме, але для другої матриці
                                            System.out.println("Enter start of range: ");
                                            if (userInput.hasNextInt()) {
                                                int startRangeSecondMatrix = userInput.nextInt();
                                                userInput.nextLine();
                                                System.out.println("Enter end of range: ");
                                                if (userInput.hasNextInt()) {
                                                    int endRangeSecondMatrix = userInput.nextInt();
                                                    userInput.nextLine();
                                                    for (int i = 0; i < secondRow; i++) {
                                                        for (int j = 0; j < secondCol; j++) {

                                                            secondMatrix[i][j] = random.nextInt(endRangeSecondMatrix) + startRangeSecondMatrix;

                                                        }
                                                    }

                                                    System.out.println("Your result: ");
                                                    //Створюємо на цей раз 3 массиви, щоб помножити один масив на другий
                                                    for (int i = 0; i < firstRow; i++) { //Один массив відповідає за рядки
                                                        for (int j = 0; j < secondCol; j++) { //Другий массив відповідає за ствопчики
                                                            resultOfMatrixMultiply[i][j] = 0;
                                                            for (int k = 0; k < firstCol; k++) { //Третій массив обчислює значення, та записує
                                                                resultOfMatrixMultiply[i][j] += firstMatrix[i][k] * secondMatrix[k][j];
                                                            }

                                                            System.out.print(resultOfMatrixMultiply[i][j] + " ");
                                                        }
                                                        System.out.println();
                                                    }
                                                } else {
                                                    System.out.println("Wrong input");
                                                }

                                            } else {
                                                System.out.println("Wrong input");
                                            }
                                        }

                                    } else {
                                        System.out.println("Wrong number");
                                    }
                                } else {
                                    System.out.println("Wrong input");
                                }
                            } else {
                                System.out.println("Wrong number");
                            }
                        } else {
                            System.out.println("Wrong input");
                        }
                    } else {
                        System.out.println("Wrong number");
                    }
                } else {
                    System.out.println("Wrong input");
                }

            } else {
                System.out.println("Wrong number");
            }
        } else {
            System.out.println("Wrong input");
        }
        userInput.close();
    }
}