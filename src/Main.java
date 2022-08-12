import java.util.function.BiFunction;
import java.util.function.IntFunction;

import static java.lang.Math.sqrt;

public class Main {
    public static void main(String[] args) {

        //Task 1
        System.out.println("Task1");
        BiFunction<Integer, Integer, Integer> compare = (Integer _a, Integer _b) -> {
            if (_a > _b) {
                return _a;
            } else return _b;
        };
        System.out.println("Max: " + compare.apply(7, 15));

        //Task2
        System.out.println("Task2");
        StringsAddAble result = (s1, s2, s3, s4, s5, s6, s7) -> (s1 + s2 + s3 + s4 + s5 + s6 + s7).toUpperCase();
        System.out.println(result.concatenatiate("Good", "evening ", "we ", "are ", "from ", "Ukraine", "!"));

        //Task3
        System.out.println("Task3");
        BiFunction<Integer, Integer, Integer> factorialInRange = (a, b) ->
        {
            for (int i = a; i < b; i++) a *= (i + 1);
            return a;
        };
        System.out.println(factorialInRange.apply(3, 7));

        //Task4
        System.out.println("Task4");

        IntFunction<Boolean> isSimple = (int a) -> {
            if (a < 2) {
                return false;
            }
            double s = sqrt(a);
            for (int i = 2; i <= s; i++) {
                if (a % i == 0)
                    return false;
            }
            return true;
        };
        System.out.println("Is simple num? " + isSimple.apply(4));

        //Task5
        System.out.println("Task5");
        IntFunction<Integer> calcFactorial = (int n) -> {
            int factorial = 1;
            for (int i = 1; i <= n; i++) {
                factorial = factorial * i;
            }
            return factorial;
        };
        System.out.println("Factorial: " + calcFactorial.apply(5));
    }
}
