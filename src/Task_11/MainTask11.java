package Task_11;

public class MainTask11 {
    public static void main(String[] args) {
        
        LambdaCalc calculator = new LambdaCalc();

        MathOperations addition = (a, b) -> a + b;
        MathOperations subtraction = (a, b) -> a - b;
        MathOperations multiplication = (a, b) -> a * b;
        MathOperations division = (a, b) -> {
            if (b == 0) {
                System.out.println("Wrong one! You can't divide by 0");
                return 0;
            }
            return a / b;
        };

        
        double addResult = calculator.calculate(addition, 5, 3);
        double subtractResult = calculator.calculate(subtraction, 5, 3);
        double multiplyResult = calculator.calculate(multiplication, 5, 3);
        double divideResult = calculator.calculate(division, 5, 3);

        
        System.out.println("Sum: " + addResult);
        System.out.println("Diff: " + subtractResult);
        System.out.println("Multiply: " + multiplyResult);
        System.out.println("Divide: " + divideResult);
    }
}
