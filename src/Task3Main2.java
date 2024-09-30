import java.util.ArrayList;
import java.util.List;

public class Task3Main2 {
    public static void main(String[] args) {
        findFriendlyNumbers(10000);
    }

    private static List<Integer> getAllFactorsForNumber(int number) {
        List<Integer> factors = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                factors.add(i);

                if (number / i != i && number / i < number) {
                    factors.add(number / i);
                }
            }
        }
        return factors;
    }

    static int getSumOfFactors(int number) {
        List<Integer> factors = getAllFactorsForNumber(number);
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    static void findFriendlyNumbers(int limit) {
        for (int i = 1; i < limit; i++) {
            int sum1 = getSumOfFactors(i);
            if (sum1 > i && sum1 < limit) {
                int sum2 = getSumOfFactors(sum1);
                if (sum2 == i) {
                    System.out.println(i + " і " + sum1 + " є дружніми числами");
                }
            }
        }
    }


}