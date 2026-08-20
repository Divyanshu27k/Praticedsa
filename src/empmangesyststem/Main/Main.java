package empmangesyststem.Main;

import empmangesyststem.EmpData.EmployeData;
import empmangesyststem.service.EmployeService;

public class Main {
    public static void main(String[] args) {
        EmployeService service=new EmployeService();
        //Add employees
        service.addEmployeData(new EmployeData(1,"dk","IT",45000));
        service.addEmployeData(new EmployeData(2,"kk","Sales",55000));
        service.addEmployeData(new EmployeData(3,"kl","Technical",35000));
        service.addEmployeData(new EmployeData(4,"op","Finance",30000));
        service.addEmployeData(new EmployeData(5,"mn","Finance",30000));
        service.addEmployeData(new EmployeData(6,"df","IT",55000));
        service.addEmployeData(new EmployeData(7,"qw","IT",45000));
        service.addEmployeData(new EmployeData(8,"cv","Sales",55000));
        service.addEmployeData(new EmployeData(9,"bn","Sales",55000));
        service.addEmployeData(new EmployeData(10,"as","Technical",35000));

        //get all emp
        System.out.println("\nAll Employees:");
        service.getAllEmp().forEach(System.out::println);

        //Find employee
        System.out.println("\nEmployee with ID 3:");
        System.out.println(service.getEmpbyId(3));

        //Find Highest
        System.out.println("\nEmployee with salary:");
        //System.out.println(service.);
    }
}
