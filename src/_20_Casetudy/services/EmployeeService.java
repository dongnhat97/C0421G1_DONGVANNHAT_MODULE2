package _20_Casetudy.services;

import _20_Casetudy.models.Employee;

public interface EmployeeService extends Service<Employee>{
    void save(Employee t);
}
