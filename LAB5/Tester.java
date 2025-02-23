package LAB5;

public class Tester {
    public static void main(String[] args) {
        ScientificCalculator calc = new ScientificCalculator(5, 3);
        System.out.println(calc.add());
        System.out.println(calc.subtract());
        System.out.println(calc.multiply());
        System.out.println(calc.divide());
        System.out.println(calc.squareroot());
        System.out.println(calc.exponent());
    }
}
