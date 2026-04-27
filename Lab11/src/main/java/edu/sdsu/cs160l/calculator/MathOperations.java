package edu.sdsu.cs160l.calculator;

public class MathOperations {

    private Calculator Calculator;

    public MathOperations() {
        this.Calculator = new SimpleCalculator();
    }

    public int factorial(int n){
        int factorial = 1;
        for(int i=2;i<=n;i++){
            factorial = Calculator.mul(factorial, i);
        }
        return factorial;
    }

    public int average(int[] arr){
        int sum=0;
        for(int i : arr){
            sum = Calculator.add(sum, i);
        }

        return Calculator.div(sum, arr.length);
    }

    public int power(int a, int b){
        int res = 1;
        for(int i=1;i<=b;i++){
            res = Calculator.mul(res, a);
        }
        return  res;
    }

    public int midValue(int a, int b){
        int add  = Calculator.add(a, b);
        int midValue = Calculator.div(add, 2);
        return midValue;
    }

    public int fahrenheitToCelsius(int fahrenheit){
        int baseSubtraction = Calculator.sub(fahrenheit, 32);
        int baseMultiplication = Calculator.mul(baseSubtraction, 5);
        int baseDivision = Calculator.div(baseMultiplication, 9);
        return baseDivision;
    }
}
