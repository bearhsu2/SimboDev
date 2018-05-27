package idv.kuma.fizzbuzz;

import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzGeneratorTest {

    private FizzBuzzGenerator fizzBuzzGenerator;

    @Test
    public void Test_1_1() {

        makeFizzBuzzGenerator();

        runAndCheck(1, "1");
    }


    @Test
    public void Test_2_2() {

        makeFizzBuzzGenerator();


        runAndCheck(2, "2");
    }

    @Test
    public void Test_3_fizz() {
        makeFizzBuzzGenerator();

        runAndCheck(3, "fizz");
    }

    @Test
    public void Test_5_buzz() {
        makeFizzBuzzGenerator();

        runAndCheck(5, "buzz");
    }

    @Test
    public void Test_6_fizz() {
        makeFizzBuzzGenerator();

        runAndCheck(6, "fizz");
    }

    @Test
    public void Test_10_buzz() {
        makeFizzBuzzGenerator();

        runAndCheck(10, "buzz");
    }



    private void makeFizzBuzzGenerator() {
        fizzBuzzGenerator =  new FizzBuzzGenerator();
    }

    private void runAndCheck(int number, String expect) {
        String actual = fizzBuzzGenerator.generate(number);

        Assert.assertEquals(expect, actual);
    }

}
