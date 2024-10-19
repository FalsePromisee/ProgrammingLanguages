package Task_3;
import java.util.List;
import java.util.ArrayList;


public class Task3Main {
    public static void main(String[] args) {
        List<Integer> perfectNumbersList = new ArrayList<>();
        for (Integer i = 1; i < 10000; i++) {
            List<Integer> factors = getAllFactorsForNumber(i);
            if (i == factors.stream().mapToInt(Integer::intValue).sum()) {
                perfectNumbersList.add(i);
            }
        }
        perfectNumbersList.forEach(System.out::println);
    }

    private static List<Integer> getAllFactorsForNumber(int number) {
        List<Integer> factors = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                factors.add(i);

                if (number / i < number)  factors.add(number / i);
            }
        }

        return factors;
    }
}