package idv.kuma.fizzbuzz;

public class FizzBuzzGenerator {


    public String generate(int i) {

        StringBuilder sb  = new StringBuilder();

        sb.append(isDivisible(i, 3, "fizz"));

        sb.append(isDivisible(i, 5, "buzz"));

        if ( 0 == sb.length() ) {
            sb.append(i);
        }

        return sb.toString();
    }

    private String isDivisible(int i, int i2, String fizz) {
        if (isDivided(i, i2)) {
            return fizz;
        }

        return "";
    }

    private boolean isDivided(int i, int i2) {
        return 0 == i % i2;
    }

}
