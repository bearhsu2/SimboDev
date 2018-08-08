package idv.kuma.fizzbuzz;

public class FizzBuzzGenerator {

    public String generate(int i) {

        StringBuilder sb = new StringBuilder();


        if (isDivisible(i, 3)) {
            sb.append("fizz");
        }

        if (isDivisible(i, 5)) {
            sb.append("buzz");
        }

        if ( 0 == sb.length() ) {
            sb.append(i);
        }

        return sb.toString();
    }

    private boolean isDivisible(int dividend, int divisor) {
        return 0 == dividend % divisor;
    }

}
