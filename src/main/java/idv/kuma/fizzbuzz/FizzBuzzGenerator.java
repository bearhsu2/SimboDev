package idv.kuma.fizzbuzz;

public class FizzBuzzGenerator {

    public String generate(int i) {

        StringBuilder sb = new StringBuilder();

        sb.append(isDivided(i, 3, "fizz"));

        sb.append(isDivided(i, 5, "buzz"));

        return isEmpty(sb.length()) ? sb.append(i).toString() : sb.toString();
    }

    private boolean isEmpty(int length) {
        return 0 == length;
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
