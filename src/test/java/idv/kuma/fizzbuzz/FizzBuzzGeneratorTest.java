package idv.kuma.fizzbuzz;

import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzGeneratorTest {


    @Test
    public void Test_1_1() {

        FizzBuzzGenerator generator = new FizzBuzzGenerator();

        Assert.assertEquals("1", generator.generate(1));

    }



}
