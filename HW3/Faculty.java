package HW3;

class Faculty extends UABPerson {
    private String department;
    private int courses;

    public Faculty(String firstName, String lastName, String blazerId, String department, int courses) {
        super(firstName, lastName, blazerId);
        this.department = department;
        this.courses = courses;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getCourses() {
        return courses;
    }

    public void setCourses(int courses) {
        this.courses = courses;
    }

    public String toString() {
        return super.toString() + " Department: " + department + " Courses: " + courses;
    }

    public String toFileString() {
        return "F " + getFirstName() + " " + getLastName() + " " + getBlazerId() + " " + department + " " + courses;
    }
}  
