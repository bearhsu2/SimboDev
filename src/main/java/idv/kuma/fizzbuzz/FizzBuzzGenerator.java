package idv.kuma.fizzbuzz;

public class FizzBuzzGenerator {

    public String generate(int i) {

        if (isDivisible(i , 3) && isDivisible(i, 5)) {
            return "fizzbuzz";
        }


        if (isDivisible(i, 3)) {
            return "fizz";
        }

        if (isDivisible(i, 5)) {
            return "buzz";
        }

        return String.valueOf(i);
    }

    private boolean isDivisible(int dividend, int divisor) {
        return 0 == dividend % divisor;
    }

}
