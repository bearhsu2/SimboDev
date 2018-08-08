package idv.kuma.fizzbuzz;

public class FizzBuzzGenerator {

    public String generate(int i) {

        if (isFizz(i, 3)) {
            return "fizz";
        }

        if (isBuzz(i, 5)) {
            return "buzz";
        }

        return String.valueOf(i);
    }

    private boolean isDivisiable(int i, int i2) {
        return 0 == i % i2;
    }

    private boolean isBuzz(int dividend, int divisor) {
        return isDivisiable(dividend, divisor);
    }


    private boolean isFizz(int i, int i2) {
        return isDivisiable(i, i2);
    }
}
