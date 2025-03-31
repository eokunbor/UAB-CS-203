package HW3;

class OfficeAssociate extends UABPerson {
    private String role;
    private String department;

    public OfficeAssociate(String firstName, String lastName, String blazerId, String role, String department) {
        super(firstName, lastName, blazerId);
        this.role = role;
        this.department = department;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String toString() {
        return super.toString() + " Role: " + role + " Department: " + department;
    }

    public String toFileString() {
        return "O " + getFirstName() + " " + getLastName() + " " + getBlazerId() + " " + role + " " + department;
    }
}
