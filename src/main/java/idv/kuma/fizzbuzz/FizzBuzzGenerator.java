package idv.kuma.fizzbuzz;

public class FizzBuzzGenerator {


    public String generate(int number) {


        StringBuilder sb = new StringBuilder();

        sb.append(tryAndPut(number));

        if (shouldPut(number, 5)) {
            sb.append("buzz");
        }

        if (0 == sb.length()) {
            sb.append(number);
        }

        return sb.toString();


    }

    private StringBuilder tryAndPut(int number) {

        if (shouldPut(number, 3)) {
            return new StringBuilder().append("fizz");
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
