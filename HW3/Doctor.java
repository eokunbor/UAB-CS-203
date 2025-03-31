package HW3;

class Doctor extends MedicalStaff {
    public Doctor(String firstName, String lastName, String blazerId, String role, String department) {
        super(firstName, lastName, blazerId, role, department);
    }

    public String toFileString() {
        return "M " + getFirstName() + " " + getLastName() + " " + getBlazerId() + " " + getRole() + " " + getDepartment();
    }
}