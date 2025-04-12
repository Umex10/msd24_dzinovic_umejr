package at.fhj.msd;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * The Calculator class provides basic arithmetic functions.
 * <p>
 * It includes functions like Addition, Substraction, Multiplication and
 * Division.
 *
 * @author Umejr Dzinovic
 */
public class Calculator {

    /**
     * This is a initialization of Logger to write error or info messages to a
     * log file.
     * <p>
     * Example:
     * <ul>
     * <li>logger.debug("Addition with" + number1 + "and" + number2 +
     * "started")</li>
     * <li>logger.error("Divison by 0!")</li>
     * </ul>
     */
    private static final Logger logger = LogManager.getLogger(Calculator.class);

    /**
     * This method takes two doubles and adds them together.
     * <p>
     * It also logs the input values.
     * <p>
     * Example:
     * <ul>
     * <li>add(7.0, 8.0) --> 15.0</li>
     * <li>add(-3.0, 4.0) --> 1.0</li>
     * </ul>
     * @param number1 The first number
     * @param number2 The second number
     * @return The sum of <code>number1</code> and <code>number2</code>.
     */
    public double add(double number1, double number2) {
        logger.debug("number1: " + number1 + " | " + "number2: " + number2);
        return number1 + number2;
    }

    /**
     * This method takes two doubles and subtracts the second number from the
     * first number.
     * <p>
     * It also logs the input values.
     * <p>
     * Example:
     * <ul>
     * <li>minus(4.0, 4.0) --> 0.0</li>
     * <li>minus(8.0, 3.0) --> 5.0</li>
     * </ul>
     * @param number1 the number from which <code>number2</code> will be
     * substracted
     * @param number2 the number to substract from <code>number1</code>
     * @return The difference between <code>number1</code> and
     * <code>number2</code>.
     */
    public double minus(double number1, double number2) {
        logger.debug("number1: " + number1 + " | " + "number2: " + number2);
        return number1 - number2;
    }

    /**
     * This method takes two doubles and divides the first number by the second
     * number.
     * <p>
     * It logs the input values on the debug-Level as well as on the info-Level.
     * If a division by 0 is given, it logs the error on error-Level.
     * <p>
     * Example:
     * <ul>
     * <li>divide(4.0, 2.0) --> 2.0</li>
     * <li>divide(-16.0, 4.0) --> -4.0</li>
     * </ul>
     * @param number1 The number to be divided
     * @param number2 The number by which the first number is divided
     * @return The result of dividing <code>number1</code> by
     * <code>number2</code>
     * @throws ArithmeticException when <code>number2</code> is 0.0, because
     * division by 0 is not allowed!
     */
    public double divide(double number1, double number2) throws ArithmeticException {

        logger.info("divide called with: number1=" + number1 + ", number2=" + number2);
        logger.debug("number1: " + number1 + " | " + "number2: " + number2);

        if (number2 == 0) {
            logger.error("Divison by 0!");
            throw new ArithmeticException("Division can't be by zero");
        }

        return number1 / number2;
    }

    /**
     * This method takes two doubles and multiplys them together.
     * <p>
     * It also logs the input values.
     * <p>
     * Example:
     * <ul>
     * <li>multiply(4.0, 4.0) --> 16.0</li>
     * <li>multiply(0.0, 4.0) --> 0.0</li>
     * </ul>
     * @param number1 The first number
     * @param number2 The second number
     * @return The result of the multiplication of <code>number1</code> and
     * <code>number2</code>
     */
    public double multiply(double number1, double number2) {
        logger.debug("number1: " + number1 + " | " + "number2: " + number2);
        return number1 * number2;

    }

    /**
     * This method calculates the factorial.
     * <p>
     * Example:
     * <ul>
     * <li>factorial(5) --> (5 * 4 * 3 * 2 * 1) --> 120</li>
     * <li>factorial(0) --> (definition of 0!) --> 1</li>
     * </ul>
     * @param n The number to calculate the factorial for! n must be >= 0
     * @return the factorial of <code>n</code>.
     */
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
