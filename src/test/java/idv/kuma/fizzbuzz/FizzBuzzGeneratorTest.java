package idv.kuma.fizzbuzz;

import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzGeneratorTest {


    @Test
    public void Test_1_1() {

        runAndCheck("1", 1);

    }

    @Test
    public void Test_2_2() {

        runAndCheck("2", 2);

    }


    @Test
    public void Test_3_fizz() {

        runAndCheck("fizz", 3);

    }

    @Test
    public void Test_5_buzz() {

        runAndCheck("buzz", 5);
    }

    @Test
    public void Test_6_fizz() {

        runAndCheck("fizz", 6);
    }

    private void runAndCheck(String fizz, int i) {
        Assert.assertEquals(fizz, new FizzBuzzGenerator().generate(i));
    }


}
