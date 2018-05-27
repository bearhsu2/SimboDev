package idv.kuma.fizzbuzz;

public class FizzBuzzGenerator {


    public String generate(int number) {

        if (3 == number) {
            return "fizz";
        }

        if (5 == number) {
            return "buzz";
        }

        return String.valueOf(number);

    }
}
