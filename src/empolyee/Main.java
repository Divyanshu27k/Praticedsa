package empolyee;

public class Main {
    public static void main(String[] args) {

        Employee emp = new Employee("Divyanshu", 101);
        emp.display();

        System.out.println("----------------------");

        SalesManager sm = new SalesManager("Amit", 102);
        sm.display();
        sm.boostSales();

        System.out.println("----------------------");

        MarketingManager mm = new MarketingManager("Rahul", 103);
        mm.display();
        mm.createMarketingStrategy();

        System.out.println("----------------------");

        Developer dev = new Developer("Karan", 104, "Java");
        dev.display();
        dev.show();

        System.out.println("----------------------");

        HRDirector hr = new HRDirector("Priya", 105);
        hr.display();
        hr.handleHRDuties();
        hr.manageHRDepartment();

        System.out.println("----------------------");

        CEO ceo = new CEO("Rohit", 1);
        ceo.display();
        ceo.makeExecutiveDecision();//    hr.handleHRDuties();
        ceo.leadCompany();

        System.out.println("----------------------");

        TeamLead tl = new TeamLead("Ankit", 106, 8);
        tl.displayInfo();// ceo.makeExecutiveDecision();//    hr.handleHRDuties();
        tl.leadTeam();

        System.out.println("----------------------");

        ProjectManager pm = new ProjectManager("Saurabh", 107, 4);
        pm.displayInfo();//tl.displayInfo();// ceo.makeExecutiveDecision();//    hr.handleHRDuties();
        pm.manageProject();
    }
}
