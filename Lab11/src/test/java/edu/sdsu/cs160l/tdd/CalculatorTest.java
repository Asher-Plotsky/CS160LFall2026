package edu.sdsu.cs160l.tdd;

import edu.sdsu.cs160l.calculator.Calculator;
import edu.sdsu.cs160l.calculator.SimpleCalculator;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

//Todo write test cases for SimpleCalculator Class
// No need to implement the actual Calculator class just write Test cases as per TDD.
// you need to just write test cases no mocking
// test should cover all methods from calculator and all scenarios, so a minimum of 5 test
// 1 for add
// 1 for subtract
// 1 for multiply
// 2 for divide (1 for normal division, 1 for division by 0)
// make sure all these test cases fail

public class CalculatorTest {
    //Declare variable here
    private Calculator calculator;

    //Add before each here

    //write test cases here
    @Test
    public void testAdd(){
        Assert.fail("Fail");
    }
    @Test
    public void testSubtract(){
        Assert.fail("Fail");
    }
    @Test
    public void testMultiply(){
        Assert.fail("Fail");
    }
    @Test
    public void testDivide(){
        Assert.fail("Fail");
    }
    @Test
    public void testDivideByZero(){
        Assert.fail("Fail");
    }
}
