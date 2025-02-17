package LAB5;

public class ScientificCalculator extends Calculator {

    public ScientificCalculator(double num1, double num2) {
        super(num1, num2);
    }

    @Override
    public double add() {
        return super.add();
    }

    @Override
    public double subtract() {
        return super.subtract();
    }

    @Override
    public double multiply() {
        return super.multiply();
    }

    @Override
    public double divide() {
        return super.divide();
    }

    public double squareroot() {
        return Math.sqrt(getNum1());
    }

    public double exponent() {
        return Math.pow(getNum1(), getNum2());
    }
}
