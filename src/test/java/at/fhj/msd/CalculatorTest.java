package at.fhj.msd;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    private Calculator calc;

    @BeforeEach
    public void setUp() {

        calc = new Calculator();

    }

    //? -------------------------- ADDITION --------------------------
    @Test
    @DisplayName("Testing add() with Positive numbers")
    void testAddWithPositive() {
        //Expected 8.0, actual result from method
        assertEquals(8.0, calc.add(4.0, 4.0));
    }

    @Test
    @DisplayName("Testing add() with negative numbers")
    void testAddWithNegative() {
        //Expected -8.5
        assertEquals(-8.5, calc.add(-2.0, -6.5));
    }

    @Test
    @DisplayName("Testing add() with Zero")
    void testAddWithZero() {
        //Expected 0 .0
        assertEquals(0.0, calc.add(0.0, 0.0));
    }

    //? -------------------------- MINUS --------------------------
    @Test
    @DisplayName("Testing minus() method with Positive numbers")
    void testMinusWithPositive() {
        //Expected 3.0
        assertEquals(3.0, calc.minus(7.0, 4.0));
    }

    @Test
    @DisplayName("Testing minus() with negative numbers")
    void testMinusWithNegative() {
        //Expected 6.7
        assertEquals(6.7, calc.minus(-3.3, -10.0));
    }

    @Test
    @DisplayName("Testing minus() with Zero")
    void testMinusWithZero() {
        //Expected 0.0
        assertEquals(0.0, calc.minus(0.0, 0.0));
    }

    //? -------------------------- DIVIDE --------------------------
    @Test
    @DisplayName("Testing divide() method with Positive numbers")
    void testDivideWithPositive() {
        //Expected 1.0
        assertEquals(1.0, calc.divide(4.0, 4.0));
    }

    @Test
    @DisplayName("Testing divide() method with one negative number")
    void testDivideWithNegative() {
        //Expected -1.0
        assertEquals(-1.0, calc.divide(-4.0, 4.0));
    }

    @Test
    @DisplayName("Testing divide() method with Zero")
    void testDivideWithZero() {
        //Expected ArithemticException
        assertThrows(ArithmeticException.class, () -> calc.divide(10.0, 0.0));
    }

    //? -------------------------- MULTIPLY --------------------------
    @Test
    @DisplayName("Testing multiply() method with Positive numbers")
    void testMultiplyWithPositive() {
        //Expected 16.0
        assertEquals(16.0, calc.multiply(4.0, 4.0));
    }

    @Test
    @DisplayName("Testing multiply() method with one Negative number")
    void testMultiplyWithNegative() {
        //Expected -16.0
        assertEquals(-16.0, calc.multiply(-4.0, 4.0));
    }

    @Test
    @DisplayName("Testing multiply() method with one Zero")
    void testMultiplyWithZero() {
        //Expected 0.0
        assertEquals(-0.0, calc.multiply(-4.0, 0.0));
    }

     //? -------------------------- FACTORIAL --------------------------
     
     @Test
     @Tag("positive")
     @DisplayName("Testing factorial()") 
     void testFactorial() {
        assertEquals(120, calc.factorial(5));
     }

     @Test
     @Tag("negative")
     @DisplayName("Testing factorial() with negative number")
     void testFactorialWithNegative() {
        assertEquals(0, calc.factorial(-5));
     }

     @Test 
     @Tag("zero")
     @DisplayName("Testing factorial() with Zero")
     void testFactorialWithZero(){
        assertEquals(1, calc.factorial(0));
     }
}
