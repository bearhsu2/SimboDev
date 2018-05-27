package idv.kuma.fizzbuzz;

public class FizzBuzzGenerator {


    public String generate(int number) {

        if (isDivisible(number, 15)) {
            return "fizzbuzz";
        }

        if (isDivisible(number, 3)) {
            return "fizz";
        }

        if (isDivisible(number, 5)) {
            return "buzz";
        }



        return String.valueOf(number);

    }

    private boolean isDivisible(int dividend, int divisor) {
        return 0 == dividend % divisor;
    }

}
