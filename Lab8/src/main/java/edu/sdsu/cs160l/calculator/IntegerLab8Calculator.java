package edu.sdsu.cs160l.calculator;

public class IntegerLab8Calculator implements Lab8Calculator<Integer> {

    @Override
    public Integer add(Integer a, Integer b) {
        return a + b;
    }

    @Override
    public Integer sub(Integer a, Integer b) {
        return a - b;
    }

    @Override
    public Integer div(Integer a, Integer b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return a / b;
    }

    @Override
    public Integer mul(Integer a, Integer b) {
        return a * b;
    }
}
