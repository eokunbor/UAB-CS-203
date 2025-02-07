public class hw1_eokunbor {
    private double weight;
    private double height;
    private int n2;
    private int maxNum;
    private int n;
    private String s;

    public static double calculateBMI(double weight, double height) {
        return weight / (height * height);
    }

    public static boolean blazerNumber(int n2) {
        if (n2 < 0) {
            return false;
        }
        int sum = 0;

        for (int i = 1; i < n2; i++) {
            if (n2 % i == 0) {
                sum += i;
            }
        }
        return sum != n2;
    }

    public static int findLargestPrime(int maxNum) {
        int largestPrime = 0;
        for (int i = 2; i <= maxNum; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                largestPrime = i;
            }
        }
        return largestPrime;
    }

    public static int numSteps(int n) {
        int steps = 0;

        while (n > 0) {
            if (n % 2 == 0) { 
                n /= 2;
            } else { 
                n -= 1;
            }
            steps++;
        }

        return steps;
    }
    
    public static void countVowelsConsonants(String s) {
        int vowels = 0;
        int consonants = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vowels++;
            }

            else if ((c >= 'a' && c <= 'z')) {
                consonants++;
            }
        }
        System.out.println(vowels + "," + consonants);
    }

    public static void main(String[] args) {
        double bmi1 = calculateBMI(70, 1.75);
        double bmi2 = calculateBMI(85, 1.80);
        System.out.println("BMI 1: " + bmi1);
        System.out.println("BMI 1: " + bmi2);

        boolean result1 = blazerNumber(28);
        boolean result2 = blazerNumber(7);
        System.out.println("Blazer Number 1: " + result1);
        System.out.println("Blazer Number 2: " + result2);

        int prime1 = findLargestPrime(20);
        int prime2 = findLargestPrime(50);
        System.out.println("Largest Prime 1: " + prime1);
        System.out.println("Largest Prime 2: " + prime2);

        int steps = numSteps(14);
        System.out.println("Num Steps: " + steps);

        countVowelsConsonants("Hello");
        countVowelsConsonants("programming");
    }

}
