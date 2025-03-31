package HW3;

class Advisor extends UABPerson {
    private String department;
    private String group;

    public Advisor(String firstName, String lastName, String blazerId, String department, String group) {
        super(firstName, lastName, blazerId);
        this.department = department;
        this.group = group;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String toString() {
        return super.toString() + " Department: " + department + " Group: " + group;
    }

    public String toFileString() {
        return "A " + getFirstName() + " " + getLastName() + " " + getBlazerId() + " " + department + " " + group;
    }
}