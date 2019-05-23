package ru.dudin.calculator;

/**
 * Simple calculator for JUnit and Ui testing.
 *
 * @created 23.05.2019
 * @author Andrey Dudin <programmer1973@mail.ru>
 * @version 0.1.0.2019.05.23
 */

public class SimpleCalculator {

    public int getAdd(final int a, final int b) {
        return a + b;
    }

    public int getSub(final int a, final int b) {
        return a - b;
    }

    public int getMul(final int a, final int b) {
        return a * b;
    }

    public double getDiv(final int a, final int b) {
        return (double) a / b;
    }
}