package at.fhj.msd;

public class Calculator {

    public double add(double number1, double number2) {
        return number1 + number2;
    }

    public double minus(double number1, double number2) {
        return number1 - number2;
    }

    public double divide(double number1, double number2) throws ArithmeticException {
        if (number2 == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return number1 / number2;
    }

    public double multiply(double number1, double number2) {

        return number1 * number2;

    }

    public int factorial(int n) {
        return 0;
    }
}
