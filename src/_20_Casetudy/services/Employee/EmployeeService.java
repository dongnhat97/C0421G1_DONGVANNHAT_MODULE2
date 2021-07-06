package _20_Casetudy.services.Employee;

import _20_Casetudy.models.Employee;
import _20_Casetudy.services.Service;

import java.util.List;

public interface EmployeeService extends Service<Employee> {
    void save(Employee t);
    void editEmployeeService();
    List getAll();
}
