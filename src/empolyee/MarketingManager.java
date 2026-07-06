package empolyee;

public class MarketingManager extends Employee {

    public MarketingManager(String name, int employeeId) {
        super(name, employeeId);
    }

    //creatingmarketStrategy()
    public void createMarketingStrategy() {
        System.out.println(name + " is creating marketing strategy.");
    }
}
