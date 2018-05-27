package idv.kuma.fizzbuzz;

public class FizzBuzzGenerator {


    public String generate(int number) {

        if (isDivisible(number)) {
            return "fizz";
        }

        if (isDiviisble5(number)) {
            return "buzz";
        }

        return String.valueOf(number);

    }

    private boolean isDiviisble5(int number) {
        return 0 == number % 5;
    }

    private boolean isDivisible(int number) {
        return 0 == number % 3;
    }
}
