package ru.dudin.calculator;

/**
 * Simple calculator JUnit testing.
 *
 * @created 23.05.2019
 * @author Andrey Dudin <programmer1973@mail.ru>
 * @version 0.1.0.2019.05.23
 */

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SimpleCalculatorTest {

    private SimpleCalculator mSimpleCalculator;

    @Before
    public void init() {
        mSimpleCalculator = new SimpleCalculator();
    }

    @Test
    public void testAddition() {
        Assert.assertEquals("Addition failed", 2, mSimpleCalculator.getAdd(1, 1));
    }

    @Test
    public void testSubtraction() {
        Assert.assertEquals("Subtraction failed", 4, mSimpleCalculator.getSub(5, 1));
    }

    @Test
    public void testMultiplication() {
        Assert.assertEquals("Multiplication failed", 20, mSimpleCalculator.getMul(5, 4));
    }

    @Test
    public void testDivision() {
        Assert.assertEquals("Divide failed", 3.0, mSimpleCalculator.getDiv(15, 5), 0.0);
    }

    @Test
    public void testDivisionByZero() {
        Assert.assertEquals(Double.POSITIVE_INFINITY, mSimpleCalculator.getDiv(1, 0), 0.0);
        Assert.assertEquals(Double.NEGATIVE_INFINITY, mSimpleCalculator.getDiv(-1, 0), 0.0);
        Assert.assertEquals(Double.NaN, mSimpleCalculator.getDiv(0, 0), 0.0);
    }
}