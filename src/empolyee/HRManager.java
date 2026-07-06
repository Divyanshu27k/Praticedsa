package empolyee;

public class HRManager extends Employee {
    public HRManager(String name, int employeeId) {
        super(name, employeeId);
    }

    public void handleHRDuties() {
        System.out.println(name + " is handling HR duties.");
    }
}
