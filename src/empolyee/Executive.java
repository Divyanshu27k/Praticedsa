package empolyee;

public class Executive extends Employee {

    public Executive(String name,int employeeId){
        super(name,employeeId);
    }
    //makeExeDecision()
    public void makeExecutiveDecision(){
        System.out.println(name + " is making executive decision.");
    }
}
