package empmangesyststem.EmpData;

public class EmployeData {

    public EmployeData(int id, String name, String deparment, double salary) {
        this.id = id;
        this.name = name;
     //   this.addresh=addresh;
     //   this.mobilenumber=mobilenumber;
        this.deparment = deparment;
        this.salary = salary;
    }

    private int id;
    private String name;
   // private String addresh;
   // private int mobilenumber;
    private String deparment;
    private double salary;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public String getAddresh() {
//        return addresh;
//    }
//
//    public void setAddresh(String addresh) {
//        this.addresh = addresh;
//    }
//
//    public int getMobilenumber() {
//        return mobilenumber;
//    }
//
//    public void setMobilenumber(int mobilenumber) {
//        this.mobilenumber = mobilenumber;
//    }

    public String getDeparment() {
        return deparment;
    }

    public void setDeparment(String deparment) {
        this.deparment = deparment;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "EmployeData{" +
                "id=" + id +
                ", name='" + name + '\'' +
               // ",addresh='"+addresh+'\''+
               // ",mobilenumber='"+mobilenumber+'\''+
                ", deparment='" + deparment + '\'' +
                ", salary=" + salary +
                '}';
    }

}
