package at.fhj.msd;

public class Main {

    public static void main(String[] args) {
        
        Calculator number = new Calculator();
        double resultAdd = number.add(2.5, 3.0);
        System.out.println("ADD: " + resultAdd);

        double resultMinus = number.minus(2.5, 3.0);
        System.out.println("MINUS: " + resultMinus);

        double resultDivide = number.divide(2.5, 3.0);
        System.out.println("DIVIDE: " + resultDivide);

        double resultMultiply = number.multiply(2.5, 3.0);
        System.out.println("MULTIPLY: " + resultMultiply);
    }
    
}
