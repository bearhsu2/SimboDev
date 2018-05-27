package idv.kuma.fizzbuzz;

public class FizzBuzzConverter {

    public String convert(int number) {

        StringBuilder result = new StringBuilder();

        if (isDividable(number , 3)) {
            result.append("fizz");
        }

        if (isDividable(number, 5)) {
            result.append("buzz");
        }

        if (0 == result.length()) {
            result.append(number);
        }
        
        return result.toString();

    }

    private boolean isDividable(int dividend, int divisor) {
        return 0 == dividend % divisor;
    }
}
