package idv.kuma.fizzbuzz;

public class FizzBuzzGenerator {

    public String generate(int i) {

        if (isFizz(i)) {
            return "fizz";
        }

        if (isBuzz(i)) {
            return "buzz";
        }

        return "" + i;
    }

    private boolean isBuzz(int i) {
        return 0 == i % 5;
    }

    private boolean isFizz(int i) {
        return 0 == i % 3;
    }
}
