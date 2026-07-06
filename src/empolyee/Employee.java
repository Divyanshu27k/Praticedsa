package empolyee;

public class Employee {
    //name
    //employed
    public String name;
    public int employeeId;

    public Employee(String name,int employeeId){
        this.name=name;
        this.employeeId=employeeId;
    }
    //display()
    public  void display() {
        System.out.println("Employe Name : " + name);
        System.out.println("Employe Id : " + employeeId);
    }

}
