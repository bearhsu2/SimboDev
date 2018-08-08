package idv.kuma.fizzbuzz;

public class FizzBuzzGenerator {


    public String generate(int i) {

        if (isDivided(i,3) && isDivided(i , 5)) {
            return "fizzbuzz";
        }

        if (isDivided(i, 3)) {
            return "fizz";
        }

        if (isDivided(i, 5)) {
            return "buzz";
        }

        return "" + i;
    }

    private boolean isDivided(int dividend, int dividentor) {
        return 0 == dividend % dividentor;
    }


}
