package empolyee;

public class BusinessDevelopmentManager extends Employee {

    public BusinessDevelopmentManager(String name, int employeeId) {
        super(name, employeeId);
    }

    public void coordinateBusinessDev() {
        System.out.println(name + " is coordinating business development.");
    }
}
