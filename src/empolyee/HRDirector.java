package empolyee;

public class HRDirector extends HRManager  {
    public HRDirector(String name, int employeeId) {
        super(name, employeeId);
    }

    public void manageHRDepartment() {
        System.out.println(name + " manages HR department.");
    }
}
