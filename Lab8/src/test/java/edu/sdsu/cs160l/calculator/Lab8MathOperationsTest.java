package edu.sdsu.cs160l.calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Lab8MathOperationsTest {

    private Lab8MathOperations lab8MathOperations;

    @BeforeEach
    public void init(){
        lab8MathOperations = new Lab8MathOperations();
    }

    @Test
    public void testFactorial() {
        assertEquals(6, lab8MathOperations.factorial(3));
    }

    @Test
    public void testAverage() {
        assertEquals(2.0, lab8MathOperations.average(new double[]{1.0, 2.0, 3.0}));
    }

    @Test
    public void testPower() {
        assertEquals(8.0, lab8MathOperations.power(2.0, 3));
    }

    @Test
    public void testMidValue() {
        assertEquals(10.2, lab8MathOperations.midValue(5.2, 15.2));
    }

    @Test
    public void testFToC() {
        assertEquals(0.0, lab8MathOperations.fahrenheitToCelsius(32.0));
    }


}