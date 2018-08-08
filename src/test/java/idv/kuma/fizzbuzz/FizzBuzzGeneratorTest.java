package idv.kuma.fizzbuzz;

import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzGeneratorTest {


    @Test
    public void Test_1_1() {

        FizzBuzzGenerator generator = new FizzBuzzGenerator();

        Assert.assertEquals("1", generator.generate(1));

    }

    @Test
    public void Test_2_2() {

        FizzBuzzGenerator generator = new FizzBuzzGenerator();

        Assert.assertEquals("2", generator.generate(2));

    }

    @Test
    public void Test_3_fizz() {

        FizzBuzzGenerator generator = new FizzBuzzGenerator();

        Assert.assertEquals("fizz", generator.generate(3));

    }


}
