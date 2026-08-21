package empmangesyststem.Main;

import empmangesyststem.EmpData.EmployeData;
import empmangesyststem.service.EmployeService;

public class Main {
    public static void main(String[] args) {
        EmployeService service = new EmployeService();
        //Add employees
        service.addEmployeData(new EmployeData(1, "dk", "IT", 45000));
        service.addEmployeData(new EmployeData(2, "kk", "Sales", 55000));
        service.addEmployeData(new EmployeData(3, "kl", "Technical", 35000));
        service.addEmployeData(new EmployeData(4, "op", "Finance", 30000));
        service.addEmployeData(new EmployeData(5, "mn", "Finance", 30000));
        service.addEmployeData(new EmployeData(6, "df", "IT", 55000));
        service.addEmployeData(new EmployeData(7, "qw", "IT", 45000));
        service.addEmployeData(new EmployeData(8, "cv", "Sales", 55000));
        service.addEmployeData(new EmployeData(9, "bn", "Sales", 55000));
        service.addEmployeData(new EmployeData(10, "as", "Technical", 35000));

        //get all emp
        System.out.println("\nAll Employees:");
        service.getAllEmp().forEach(System.out::println);

        //Find employee
        System.out.println("\nEmployee with ID 3:");
        System.out.println(service.getEmpbyId(3));

        //Find Highest
        System.out.println("\nEmployee with salary:");
        System.out.println(service.findHighestSalary());

        //Find second-highest salary
        System.out.println("\nEmployee with second-highest salary");
        System.out.println(service.findSecondHighestSalary());

        // Employees from IT
        System.out.println("\nIT Employees:");

        service.findByDeparment("IT")
                .forEach(System.out::println);


        // Employees earning > 60000
        System.out.println("\nEmployees earning > 60000:");

        service.findEmployeesAboveSalary(60000)
                .forEach(System.out::println);


        // Sort by salary
        System.out.println("\nSorted By Salary:");

        service.sortBySalary()
                .forEach(System.out::println);


        // Sort by name
        System.out.println("\nSorted By Name:");

        service.sortByName()
                .forEach(System.out::println);


        // Duplicate names
        System.out.println("\nDuplicate Names:");
        System.out.println(
                service.findDuplicateNames()
        );


        // Department count
        System.out.println("\nEmployees By Department:");

        System.out.println(
                service.countByDepartment()
        );


        // Average salary
        System.out.println("\nAverage Salary:");

        System.out.println(
                service.averageSalary()
        );

        // Update salary
        System.out.println("\nUpdating Rahul salary:");

        service.updateSalary(1, 90000);

        System.out.println(
                service.getEmpbyId(1)
        );


        // Delete employee
        System.out.println("\nDeleting employee 2:");

        service.deleteEmp(2);

        service.getAllEmp()
                .forEach(System.out::println);
    }
}
