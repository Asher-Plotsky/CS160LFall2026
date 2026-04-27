package edu.sdsu.cs160l.calculator;

/**
 * TODO change MathOperation class so that it has a dependency on DoubleCalculator class and not SimpleCalculator
 *  what you also need to do is change the method signatures from int to double.
 *
 */
public class Lab8MathOperations {

    private Lab8Calculator<Double> lab8Calculator;

    public Lab8MathOperations() {
        // TODO change this to use DoubleCalculator
        this.lab8Calculator = new DoubleLab8Calculator();
    }

    public double factorial(int n){
        double factorial = 1;
        for(double i=2;i<=n;i++){
            factorial = lab8Calculator.mul(factorial, i);
        }
        return factorial;
    }

    public double average(double[] arr){
        double sum=0;
        for(double i : arr){
            sum = lab8Calculator.add(sum, i);
        }

        return lab8Calculator.div(sum, Double.valueOf(arr.length));
    }

    // Make sure the second variable is int only
    // the signature should look like double power(double a, int b)
    public double power(double a, int b){
        double res = 1;
        for(int i=1;i<=b;i++){
            res = lab8Calculator.mul(res, a);
        }
        return  res;
    }

    public double midValue(double a, double b){
        double add  = lab8Calculator.add(a, b);
        double midValue = lab8Calculator.div(add, 2.0);
        return midValue;
    }

    public double fahrenheitToCelsius(double fahrenheit){
        double baseSubtraction = lab8Calculator.sub(fahrenheit, 32.0);
        double baseMultiplication = lab8Calculator.mul(baseSubtraction, 5.0);
        double baseDivision = lab8Calculator.div(baseMultiplication, 9.0);
        return baseDivision;
    }
}