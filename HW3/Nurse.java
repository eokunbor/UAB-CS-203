package HW3;

class Nurse extends MedicalStaff {
    private boolean onCall;

    public Nurse(String firstName, String lastName, String blazerId, String role, String department, boolean onCall) {
        super(firstName, lastName, blazerId, role, department);
        this.onCall = onCall;
    }

    public boolean isOnCall() {
        return onCall;
    }

    public void setOnCall(boolean onCall) {
        this.onCall = onCall;
    }

    public String toString() {
        return super.toString() + " On Call: " + (onCall ? "Yes" : "No");
    }

    public String toFileString() {
        return "M " + getFirstName() + " " + getLastName() + " " + getBlazerId() + " " + getRole() + " " + getDepartment() + " " + (onCall ? "Yes" : "No");
    }
}