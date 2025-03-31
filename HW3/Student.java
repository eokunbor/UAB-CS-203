package HW3;

class Student extends UABPerson {
    private String level;
    private String major;
    private double gpa;

    public Student(String firstName, String lastName, String blazerId, String level, String major, double gpa) {
        super(firstName, lastName, blazerId);
        this.level = level;
        this.major = major;
        this.gpa = gpa;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String toString() {
        return super.toString() + " Level: " + level + " Major: " + major + " GPA: " + gpa;
    }

    public String toFileString() {
        return "S " + getFirstName() + " " + getLastName() + " " + getBlazerId() + " " + level + " " + major + " " + gpa;
    }
}
