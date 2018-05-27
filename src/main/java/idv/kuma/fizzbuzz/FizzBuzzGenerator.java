package idv.kuma.fizzbuzz;

public class FizzBuzzGenerator {


    public String generate(int number) {


        StringBuilder sb = new StringBuilder();

        sb.append(tryDivisibleAndPut(number, 3, "fizz"));

        sb.append(tryDivisibleAndPut(number, 5, "buzz"));

        return (0 == sb.length() ? sb.append(number) : sb).toString();


    }

    private StringBuilder tryDivisibleAndPut(int divident, int divisor, String keyword) {

        return new StringBuilder().append(isDivisible(divident, divisor) ? keyword : "");

    }


    private boolean isDivisible(int dividend, int divisor) {
        return 0 == dividend % divisor;
    }

}
