package idv.kuma.fizzbuzz;

public class FizzBuzzConverter {

    public String convert(int number) {

        StringBuilder sb = new StringBuilder();

        sb.append(appendIfDividable(number, 3, "fizz"));

        sb.append(appendIfDividable(number,5, "buzz"));

        return isEmptyAppender(sb) ? sb.append(number).toString() : sb.toString();

    }

    private boolean isEmptyAppender(StringBuilder sb) {
        return 0 == sb.length();
    }

    private StringBuilder appendIfDividable(int number, int divisor, String keyword) {
        return new StringBuilder(isDividable(number, divisor) ? keyword : "");
    }


    private boolean isDividable(int dividend, int divisor) {
        return 0 == dividend % divisor;
    }
}
