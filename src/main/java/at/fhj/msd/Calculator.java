package at.fhj.msd;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculator {

    private static final Logger logger = LogManager.getLogger(Calculator.class);

    public double add(double number1, double number2) {
        logger.debug("number1: " + number1 + " | " + "number2: " + number2);
        return number1 + number2;
    }

    public double minus(double number1, double number2) {
        logger.debug("number1: " + number1 + " | " + "number2: " + number2);
        return number1 - number2;
    }

    public double divide(double number1, double number2) throws ArithmeticException {

        logger.info("divide called with: number1=" + number1 + ", number2=" + number2);
        logger.debug("number1: " + number1 + " | " + "number2: " + number2);

        if (number2 == 0) {
            logger.error("Divison by 0!");
            throw new ArithmeticException("Division can't be by zero");
        }

        return number1 / number2;
    }

    public double multiply(double number1, double number2) {
        logger.debug("number1: " + number1 + " | " + "number2: " + number2);
        return number1 * number2;

    }

    public int factorial(int n) {
        if (n < 0) {
            return 0;
        } else if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}
