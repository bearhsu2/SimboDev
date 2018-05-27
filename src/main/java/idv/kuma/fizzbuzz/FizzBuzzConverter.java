package idv.kuma.fizzbuzz;

public class FizzBuzzConverter {

    public String convert(int number) {

        if (0 == number % 3){
            return "fizz";
        }

        if (0 == number % 5) {
            return "buzz";
        }

        return String.valueOf(number);

    }
}
