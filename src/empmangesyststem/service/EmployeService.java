package empmangesyststem.service;

import empmangesyststem.EmpData.EmployeData;

import java.util.ArrayList;
import java.util.List;

public class EmployeService {

    private final List<EmployeData>emp=new ArrayList<>();

    //1.Add Employeedata
    public void addEmployeData(EmployeData employee){

        if (employee==null){
            throw new IllegalArgumentException("Employe cannot be null");
        }
        if(employee.getSalary()<0){
            throw new IllegalArgumentException("Salary cannot negative ");
        }
        //Check duplicate ID
        boolean exists =emp.stream().anyMatch(employeData -> employeData.getId()==employee.getId());

        if (exists){
            throw new IllegalArgumentException("Employee ID already exists"+ employee.getId());
        }
        emp.add(employee);
        System.out.println("Employee added successfully.");
    }




}
