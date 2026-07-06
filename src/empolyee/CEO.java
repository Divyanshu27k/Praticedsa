package empolyee;

public class CEO extends Executive {
    public CEO(String name, int employeeId) {
        super(name, employeeId);
    }

    public void leadCompany() {
        System.out.println(name + " is leading the company.");
    }
}
