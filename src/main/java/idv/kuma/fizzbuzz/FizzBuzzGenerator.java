package idv.kuma.fizzbuzz;

public class FizzBuzzGenerator {


    public String generate(int number) {

        if (shouldPut(number, 15)) return "fizzbuzz";

        if (shouldPut(number, 3)) return "fizz";

        if (shouldPut(number, 5)) return "buzz";

        return String.valueOf(number);

    }

    private boolean shouldPut(int number, int i) {
        if (isDivisible(number, i)) {
            return true;
        }
        return false;
    }

    private boolean isDivisible(int dividend, int divisor) {
        return 0 == dividend % divisor;
    }

}
