public class hw1_eokunborTESTER {
    public static void main(String[] args) {
        double bmi1 = calculateBMI(70, 1.75);
        double bmi2 = calculateBMI(85, 1.80);
        System.out.println("BMI 1: " + bmi1);
        System.out.println("BMI 1: " + bmi2);

        boolean result1 = blazerNumber(28);
        boolean result2 = blazerNumber(12);
        System.out.println("Blazer Number 1: " + result1);
        System.out.println("Blazer Number 2: " + result2);

        int prime1 = findLargestPrime(20);
        int prime2 = findLargestPrime(50);
        System.out.println("Largest Prime 1: " + prime1);
        System.out.println("Largest Prime 2: " + prime2);

        int steps = numSteps(14);
        System.out.println("Num Steps: " + prime1);

        countVowelsConsonants("Hello");
        countVowelsConsonants("programming");

    }
}
