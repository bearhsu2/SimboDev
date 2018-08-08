package idv.kuma.fizzbuzz;

public class FizzBuzzGenerator {

    public String generate(int i) {

        if ( 3 == i ) {
            return "fizz";
        }

        if ( 5 == i ) {
            return "buzz";
        }

        return String.valueOf(i);
    }
}
