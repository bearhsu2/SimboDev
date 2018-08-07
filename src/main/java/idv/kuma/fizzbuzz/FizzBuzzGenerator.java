package idv.kuma.fizzbuzz;

public class FizzBuzzGenerator {

    public String generate(int i) {

        if (isDivided(i,3) &&
                isDivided(i, 5)) {
            return "fizzbuzz";
        }


        if (isFizz(i)) {
            return "fizz";
        }

        if (isBuzz(i)) {
            return "buzz";
        }

        return "" + i;
    }

    private boolean isBuzz(int i) {
        return isDivided(i, 5);
    }

    private boolean isDivided(int dividend, int dividistor) {
        return 0 == dividend % dividistor;
    }

    private boolean isFizz(int i) {
        return isDivided(i, 3);
    }
}
