package idv.kuma.fizzbuzz;

import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzGeneratorTest {

    @Test
    public void Test_1_1() {
        FizzBuzzGenerator fizzBuzzGenerator = new FizzBuzzGenerator();

        String actual = fizzBuzzGenerator.generate(1);

        Assert.assertEquals("1", actual);
    }

    @Test
    public void Test_2_2() {
        FizzBuzzGenerator fizzBuzzGenerator = new FizzBuzzGenerator();

        String actual = fizzBuzzGenerator.generate(2);

        Assert.assertEquals("2", actual);
    }
}
