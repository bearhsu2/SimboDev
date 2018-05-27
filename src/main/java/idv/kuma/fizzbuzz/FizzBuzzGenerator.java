package idv.kuma.fizzbuzz;

public class FizzBuzzGenerator {


    public String generate(int number) {

        if (isDivisible5(number, 3)) {
            return "fizz";
        }

        if (isDivisible5(number, 5)) {
            return "buzz";
        }

        return String.valueOf(number);

    }

    private boolean isDivisible5(int dividend, int divisor) {
        return 0 == dividend % divisor;
    }

}
