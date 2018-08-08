package idv.kuma.fizzbuzz;

public class FizzBuzzGenerator {


    public String generate(int i) {



        if (isFizz(i, 3)) {
            return "fizz";
        }

        if (isBuzz(i, 5)) {
            return "buzz";
        }

        return "" + i;
    }

    private boolean isBuzz(int i, int i2) {
        return isDivided(i, 5);
    }

    private boolean isDivided(int i, int i2) {
        return 0 == i % i2;
    }

    private boolean isFizz(int i, int i2) {
        return isDivided(i, 3);
    }
}
