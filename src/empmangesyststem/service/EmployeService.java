package empmangesyststem.service;

import empmangesyststem.EmpData.EmployeData;
import empmangesyststem.EmployeeNotFoundException;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeService {

    private final List<EmployeData> emp = new ArrayList<>();

    //1.Add Employeedata
    public void addEmployeData(EmployeData employee) {
        if (employee == null) {
            throw new IllegalArgumentException("Employe cannot be null");
        }
        if (employee.getSalary() < 0) {
            throw new IllegalArgumentException("Salary cannot negative ");
        }
        //Check duplicate ID
        boolean exists = emp.stream().anyMatch(employeData -> employeData.getId() == employee.getId());
        if (exists) {
            throw new IllegalArgumentException("Employee ID already exists" + employee.getId());
        }
        emp.add(employee);
        System.out.println("Employee added successfully.");
    }

    //2. get Emp By id
    public EmployeData getEmpbyId(int id) {
        return emp.stream()
                .filter(employeData -> employeData.getId() == id)
                .findFirst()
                .orElseThrow(() ->
                        new EmployeeNotFoundException(
                                "Employee not found with Id: " + id
                        )
                );
    }

    // 3. Get All Employees
    public List<EmployeData> getAllEmp() {
        return new ArrayList<>(emp);
    }

    //4.update salary
    public void updateSalary(int id, double newSalary) {
        if (newSalary < 0) {
            throw new IllegalArgumentException(
                    "Salary cannot be negative"
            );
        }
        EmployeData employee = getEmpbyId(id);
        employee.setSalary(newSalary);
        System.out.println("Salary updated successfully.");
    }

    //5.Delete employee
    public void deleteEmp(int id) {
        EmployeData employee = getEmpbyId(id);
        emp.remove(employee);
        System.out.println("Employee deleted successfully.");
    }

    //6.Find the highest salary
    public EmployeData findHighestSalary() {
        return emp.stream()
                .max(Comparator.comparingDouble(EmployeData::getSalary))
                .orElseThrow(() ->
                        new EmployeeNotFoundException(
                                "No employees available"
                        )
                );
    }

    // 7. Find Second-Highest Salary
    public EmployeData findSecondHighestSalary() {

        return emp.stream()
                .sorted(
                        Comparator.comparingDouble(EmployeData::getSalary)
                                .reversed()
                )
                .distinct()
                .skip(1)
                .findFirst()
                .orElseThrow(() ->
                        new EmployeeNotFoundException(
                                "Second highest salary not available"
                        )
                );
    }

    //8. Find Employees By Department
    public List<EmployeData>findByDeparment(String department){
        return emp.stream()
                .filter(employeData -> employeData.getDeparment().equalsIgnoreCase(department))
                .collect(Collectors.toList());
    }




}
