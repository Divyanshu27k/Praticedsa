package empolyee;

public class TeamLead extends TechLead  {
    private int teamSize;

    public TeamLead(String name, int employeeId, int teamSize) {
        super(name, employeeId);
        this.teamSize = teamSize;
    }

    public void leadTeam() {
        System.out.println(name + " leads a team of " + teamSize + " members.");
    }
}
