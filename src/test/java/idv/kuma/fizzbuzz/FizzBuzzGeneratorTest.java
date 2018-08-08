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


    private void runAndCheck(String s, int i) {
        Assert.assertEquals(s, new FizzBuzzGenerator().generate(i));
    }
}
