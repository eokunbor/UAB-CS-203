package Lab7;

public class Student {
    private String name;
    private double exam1;
    private double exam2;
    private double finalExam;
    private double finalGrade;
    private char letterGrade;
    
    // Constructor
    public Student(String name, double exam1, double exam2, double finalExam) {
        this.name = name;
        this.exam1 = exam1;
        this.exam2 = exam2;
        this.finalExam = finalExam;
        setFinalGrade();
        setLetterGrade();
    }
    
    // Method to calculate and set final grade
    public void setFinalGrade() {
        this.finalGrade = 0.25 * exam1 + 0.25 * exam2 + 0.5 * finalExam;
    }
    
    // Method to calculate and set letter grade
    public void setLetterGrade() {
        if (finalGrade > 90) {
            letterGrade = 'A';
        } else if (finalGrade > 80) {
            letterGrade = 'B';
        } else if (finalGrade > 70) {
            letterGrade = 'C';
        } else {
            letterGrade = 'F';
        }
    }
    
    // Getters
    public String getName() {
        return name;
    }
    
    public double getFinalGrade() {
        return finalGrade;
    }
    
    public char getLetterGrade() {
        return letterGrade;
    }
}