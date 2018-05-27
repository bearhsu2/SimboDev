package idv.kuma.fizzbuzz;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzConverterTest {
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void OneElement_1() throws Exception {

        FizzBuzzConverter converter = new FizzBuzzConverter();


        String acutal = converter.convert(1);


        Assert.assertEquals("1",acutal);
    }
}