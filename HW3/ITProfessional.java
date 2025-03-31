package HW3;

class ITProfessional extends UABPerson {
    private String team;

    public ITProfessional(String firstName, String lastName, String blazerId, String team) {
        super(firstName, lastName, blazerId);
        this.team = team;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String toString() {
        return super.toString() + " Team: " + team;
    }

    public String toFileString() {
        return "I " + getFirstName() + " " + getLastName() + " " + getBlazerId() + " " + team;
    }
}
