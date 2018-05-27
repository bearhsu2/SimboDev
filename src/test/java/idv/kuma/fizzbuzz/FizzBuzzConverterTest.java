package idv.kuma.fizzbuzz;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzConverterTest {

    private FizzBuzzConverter converter;

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {
    }



    @Test
    public void OneElement_1_1() throws Exception {

        makeConverter();


        runAndCheck("1", 1);
    }


    @Test
    public void OneElement_3_fizz() throws Exception {
        makeConverter();


        runAndCheck("fizz", 3);
    }

    private void runAndCheck(String expected, int number) {


        Assert.assertEquals(expected, converter.convert(number));
    }

    private void makeConverter() {
        converter = new FizzBuzzConverter();
    }
}