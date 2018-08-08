package idv.kuma.fizzbuzz;

public class FizzBuzzGenerator {


    public String generate(int i) {

        StringBuilder sb = new StringBuilder();

        if (isDivided(i, 3)) {
            sb.append("fizz");
        }

        if (isDivided(i, 5)) {
            sb.append("buzz");
        }

        return 0 == sb.length() ? sb.append(i).toString() : sb.toString();

    }

    private boolean isDivided(int dividend, int dividentor) {
        return 0 == dividend % dividentor;
    }


}
