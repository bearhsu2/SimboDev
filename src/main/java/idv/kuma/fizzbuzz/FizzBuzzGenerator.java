package idv.kuma.fizzbuzz;

public class FizzBuzzGenerator {


    public String generate(int i) {

        StringBuilder sb = new StringBuilder();

        sb.append(isDivided(i, 3, "fizz"));

        sb.append(isDivided(i, 5, "buzz"));

        return 0 == sb.length() ? sb.append(i).toString() : sb.toString();

    }

    private String isDivided(int dividend, int dividentor, String value) {
        if (isDivided(dividend, dividentor)) {
            return value;
        }

        return "";
    }

    private boolean isDivided(int dividend, int dividentor) {
        return 0 == dividend % dividentor;
    }


}
