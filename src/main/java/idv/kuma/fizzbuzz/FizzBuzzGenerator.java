package idv.kuma.fizzbuzz;

public class FizzBuzzGenerator {

    public String generate(int i) {

        StringBuilder sb = new StringBuilder();

        sb.append(isDivided(i, 3, "fizz"));

        sb.append(isDivided(i, 5, "buzz"));

        return 0 == sb.length() ? sb.append(i).toString() : sb.toString();
    }

    private String isDivided(int dividend, int dividistor, String value) {
        if (isDivided(dividend, dividistor)) {
            return value;
        }

        return "";
    }

    private boolean isDivided(int dividend, int dividistor) {
        return 0 == dividend % dividistor;
    }

}
