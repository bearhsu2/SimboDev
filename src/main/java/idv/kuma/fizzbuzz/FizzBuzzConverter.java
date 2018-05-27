package idv.kuma.fizzbuzz;

public class FizzBuzzConverter {

    public String convert(int number) {

        if (3 == number){
            return "fizz";
        }

        return String.valueOf(number);

    }
}
