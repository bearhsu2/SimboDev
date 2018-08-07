package idv.kuma.fizzbuzz;

public class FizzBuzzGenerator {

    public String generate(int i) {

        StringBuilder sb = new StringBuilder();

        if (isFizz(i)) {
            sb.append("fizz");
        }

        if (isBuzz(i)) {
            sb.append("buzz");
        }

        return 0 == sb.length() ? sb.append(i).toString() : sb.toString();
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
