package _20_Casetudy.services;

import _20_Casetudy.models.Employee;

import java.util.List;

public interface EmployeeService extends Service<Employee>{
    void save(Employee t);
    void editEmployeeService();
    List getAll();
}
