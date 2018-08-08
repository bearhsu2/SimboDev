package idv.kuma.fizzbuzz;

public class FizzBuzzGenerator {


    public String generate(int i) {

        StringBuilder sb  = new StringBuilder();

        if (isDivided(i, 3)) {
            sb.append("fizz");
        }

        if (isDivided(i, 5)) {
            sb.append("buzz");
        }

        if ( 0 == sb.length() ) {
            sb.append(i);
        }

        return sb.toString();
    }

    private boolean isDivided(int i, int i2) {
        return 0 == i % i2;
    }

}
