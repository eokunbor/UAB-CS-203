package Lab7;

public class Student {
    private String Name;
    private int exam1,exam2, finalExam;
    private double finalGrade;
    private char letterGrade;
    
    public Student(String name, int exam1, int exam2, int finalExam) {
        this.Name = name;
        this.exam1 = exam1;
        this.exam2 = exam2;
        this.finalExam = finalExam;
        setFinalGrade();
        setLetterGrade();
    }
    
    public void setFinalGrade() {
        this.finalGrade = 0.25 * exam1 + 0.25 * exam2 + 0.5 * finalExam;
    }
    
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
    
    public String getName() {
        return Name;
    }
    
    public double getFinalGrade() {
        return finalGrade;
    }
    
    public char getLetterGrade() {
        return letterGrade;
    }
}