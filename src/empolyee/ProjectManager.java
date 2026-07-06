package empolyee;

public class ProjectManager extends TechLead  {
    private int projectsManaged;

    public ProjectManager(String name, int employeeId, int projectsManaged) {
        super(name, employeeId);
        this.projectsManaged = projectsManaged;
    }

    public void manageProject() {
        System.out.println(name + " manages " + projectsManaged + " project(s).");
    }
}
