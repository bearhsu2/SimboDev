package idv.kuma.fizzbuzz;

public class FizzBuzzGenerator {


    public String generate(int number) {


        StringBuilder sb = new StringBuilder();

        sb.append(tryAndPut(number, 3, "fizz"));

        sb.append(tryAndPut(number, 5, "buzz"));

        if (0 == sb.length()) {
            sb.append(number);
        }

        return sb.toString();


    }

    private StringBuilder tryAndPut5(int number) {
        return tryAndPut(number, 5, "buzz");
    }

    private StringBuilder tryAndPut(int divident, int divisor, String keyword) {

        if (shouldPut(divident, divisor)) {
            return new StringBuilder().append(keyword);
        } else {
            return new StringBuilder();
        }
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
