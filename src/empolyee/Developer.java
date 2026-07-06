package empolyee;

public class Developer extends Employee {
    private String programmingLanguage;

    public Developer(String name, int employeeId, String programmingLanguage) {
        super(name, employeeId);
        this.programmingLanguage = programmingLanguage;
    }

    public void show() {
        System.out.println(name + " develops in " + programmingLanguage);
    }
}
