package Task_11;

public class LambdaCalc {
    public double calculate(MathOperations operation, double a, double b) 
    {
        return operation.execute(a, b);
    }
}
