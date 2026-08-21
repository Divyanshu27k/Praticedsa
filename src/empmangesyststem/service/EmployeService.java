package empmangesyststem.service;

import empmangesyststem.EmpData.EmployeData;
import empmangesyststem.EmployeeNotFoundException;

import java.util.*;
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

    // 9. Find Employees Above Salary
    public List<EmployeData> findEmployeesAboveSalary(double salary) {

        return emp.stream()
                .filter(e -> e.getSalary() > salary)
                .collect(Collectors.toList());
    }


    // 10. Sort Employees By Salary
    public List<EmployeData> sortBySalary() {

        return emp.stream()
                .sorted(
                        Comparator.comparingDouble(EmployeData::getSalary)
                                .reversed()
                )
                .collect(Collectors.toList());
    }


    // 11. Sort Employees By Name
    public List<EmployeData> sortByName() {

        return emp.stream()
                .sorted(
                        Comparator.comparing(EmployeData::getName)
                )
                .collect(Collectors.toList());
    }

    // 12. Find Duplicate Names
    public Set<String> findDuplicateNames() {

        Set<String> uniqueNames = new HashSet<>();
        Set<String> duplicateNames = new HashSet<>();

        for (EmployeData employee : emp) {

            String name = employee.getName();

            if (!uniqueNames.add(name)) {
                duplicateNames.add(name);
            }
        }

        return duplicateNames;
    }


    // 13. Count Employees By Department
    public Map<String, Long> countByDepartment() {

        return emp.stream()
                .collect(
                        Collectors.groupingBy(
                                EmployeData::getDeparment,
                                Collectors.counting()
                        )
                );
    }

    // 14. Average Salary
    public double averageSalary() {

        return emp.stream()
                .mapToDouble(EmployeData::getSalary)
                .average()
                .orElse(0.0);
    }


    // 15. Highest Salary By Department
    public Map<String, Optional<EmployeData>> highestSalaryByDepartment() {

        return emp.stream()
                .collect(
                        Collectors.groupingBy(
                                EmployeData::getDeparment,
                                Collectors.maxBy(
                                        Comparator.comparingDouble(
                                                EmployeData::getSalary
                                        )
                                )
                        )
                );

    }



}
