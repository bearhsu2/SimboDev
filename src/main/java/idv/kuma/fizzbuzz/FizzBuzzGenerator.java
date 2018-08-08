package idv.kuma.fizzbuzz;

public class FizzBuzzGenerator {

    public String generate(int i) {

        StringBuilder sb = new StringBuilder();

        sb.append(isDivisible(i, 3, "fizz"));

        sb.append(isDivisible(i, 5, "buzz"));

        return isEmptyString(sb.length()) ? sb.append(i).toString() : sb.toString();
    }

    private boolean isEmptyString(int length) {
        return 0 == length;
    }

    private String isDivisible(int i, int i2, String fizz) {
        if (isDivisible(i, i2)) {
            return fizz;
        }

        return "";
    }


    private boolean isDivisible(int dividend, int divisor) {
        return 0 == dividend % divisor;
    }

}
