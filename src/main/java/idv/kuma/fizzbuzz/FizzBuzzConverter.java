package idv.kuma.fizzbuzz;

public class FizzBuzzConverter {

    public String convert(int number) {

        if (isDividable(number, 3)){
            return "fizz";
        }

        if (isDividable(number, 5)) {
            return "buzz";
        }

        return String.valueOf(number);

    }

    private boolean isDividable(int dividend, int divisor) {
        return 0 == dividend % divisor;
    }
}
