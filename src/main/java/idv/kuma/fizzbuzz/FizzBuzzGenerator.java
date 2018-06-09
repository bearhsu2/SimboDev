package idv.kuma.fizzbuzz;

public class FizzBuzzGenerator {


    public String generate(int number) {


        if (number % 15 == 0){
            return "fizzbuzz";
        } else if (number % 3 == 0){
            return "fizz";
        } else if (number % 5 == 0){
            return "buzz";
        }

        return "" + number;

    }


}
