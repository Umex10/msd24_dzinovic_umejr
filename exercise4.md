# Calculator Tests

This file lists the main test cases applied to the Calculator class. The test cases cover basic mathematical operations such as addition, subtraction, multiplication, and division.

## 1. Addition (`add()`)

**Test cases:**
- **Test 1:** Addition of two positive numbers  
  Input: `4.0 + 4.0`  
  Expected result: `8.0`
  
- **Test 2:** Addition of two negative numbers  
  Input: `-2.0 + -6.5`  
  Expected result: `-8.5`
  
- **Test 3:** Addition with zero  
  Input: `0.0 + 0.0`  
  Expected result: `0.0`

## 2. Subtraction (`minus()`)

**Test cases:**
- **Test 1:** Subtraction of two positive numbers  
  Input: `7.0 - 4.0`  
  Expected result: `3.0`
  
- **Test 2:** Subtraction of two negative numbers  
  Input: `-3.3 - -10.0`  
  Expected result: `6.7`
  
- **Test 3:** Subtraction with zero  
  Input: `0.0 - 0.0`  
  Expected result: `0.0`

## 3. Division (`divide()`)

**Test cases:**
- **Test 1:** Division of two positive numbers  
  Input: `4.0 / 4.0`  
  Expected result: `1.0`
  
- **Test 2:** Division with one negative number  
  Input: `-4.0 / 4.0`  
  Expected result: `-1.0`
  
- **Test 3:** Division by zero (should throw an `ArithmeticException`)  
  Input: `10.0 / 0.0`  
  Expected result: **`ArithmeticException`**

## 4. Multiplication (`multiply()`)

**Test cases:**
- **Test 1:** Multiplication of two positive numbers  
  Input: `4.0 * 4.0`  
  Expected result: `16.0`
  
- **Test 2:** Multiplication with one negative number  
  Input: `-4.0 * 4.0`  
  Expected result: `-16.0`
  
- **Test 3:** Multiplication with zero  
  Input: `-4.0 * 0.0`  
  Expected result: `0.0`

# Screenshot of Test Coverage Execution

![Screenshot](resources\\images\\ex4_1.png)

Since CalculatorTest has an percentage of 100%, everything is fine. We need a high percentage and that's good!