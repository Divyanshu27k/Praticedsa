package empolyee;

public class SalesManager extends Employee {

    public SalesManager(String name,int employeeId){
        super(name, employeeId);
    }
    //boostsales()
    public void boostSales(){
        System.out.println(name + " is boosting sales.");
    }
}
