public class hw1_eokunbor {
    private double weight;
    private double height;
    private int n2;
    private int maxNum;
    private int n;
    private String s;

    public void BMIperson (double weight, double height) {
        this.weight = weight;
        this.height = height;
    }
    public double getheight() {
        return height;
    }
    public void setheight(double height) {
		this.height = height;
	}
    public double getweight() {
        return weight;
    }
    public void setweight(double weight) {
		this.weight = weight;
	}

    public double calculateBMI() {
        return weight / (height * height);
    }

//* */
    public void bNumber (int n2) {
        this.n2 = n2;
    }
    public int getn2() {
        return n2;
    }
    public void setn2(int n2) {
        this.n2= n2;
    } 

    public boolean blazerNumber() {
        if (n2 % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
//* */
    public void examplePrime(int maxNum) {
        this.maxNum = maxNum;
    }
    public int getmaxNum() {
        return maxNum;
    }
    public void setmaxNum (int maxNum) {
        this.maxNum= maxNum;
    }   
    public int findLargestPrime() {
        int i;
        int num = 0;
        for (i = 1; i <= maxNum; i++) {
            if (maxNum % i == 0) {
                num = i;
            }
        }
        return num;
    }
//* */
    public void exampleSteps(int n) {
        this.n = n;
    }
    public int getn() {
        return n;
    }
    public void setn (int n) {
        this.n= n;
    }   
    public int numSteps() {
        int steps = 0;
        while (n != 1) {
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = n - 1;
            }
            steps++;
        }
        return steps;
    }

// */
    public void VowelsConsonants(String s) {
        this.s = s;
    }
    public String gets() {
        return s;
    }
    public void sets(String s) {
        this.s= s;
    } 
    public String countVowelsConsonants() {
        int vowels = 0;
        int consonants = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels++;
            } else {
                consonants++;
            }
        }
        return "Vowels: " + vowels + ", Consonants: " + consonants;
    }

    public static void main(String[] args) {
        
    
        double bmi1 = person1.calculateBMI();

        hw1_eokunbor person2 = new hw1_eokunbor();
        person2.BMIperson(85, 1.80);
        double bmi2 = person2.calculateBMI();
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