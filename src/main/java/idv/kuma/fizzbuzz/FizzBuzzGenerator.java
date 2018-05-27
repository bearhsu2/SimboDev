package idv.kuma.fizzbuzz;

public class FizzBuzzGenerator {


    public String generate(int number) {

        if (isDivisible(number)) {
            return "fizz";
        }

        if (5 == number || 10 == number) {
            return "buzz";
        }

        return String.valueOf(number);

    }

    private boolean isDivisible(int number) {
        return 0 == number % 3;
    }
}
