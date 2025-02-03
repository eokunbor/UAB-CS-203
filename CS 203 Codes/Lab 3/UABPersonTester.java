public class UABPersonTester {
    public static void main(String[] args) {
        UABPerson person1 = new UABPerson("Elizabeth", "female", 20, "okunbor");
        UABPerson person2 = new UABPerson("Willow", "female", 16, "willowp04");

        System.out.println("Testing check palindrome method: " + person1.checkPalindrome());

        System.out.println("Testing years to retirement method: " + person2.yearsToRetirement());

        System.out.println("Testing toString method: " + person1);
        System.out.println("Testing toString method: " + person2);
    }

}
