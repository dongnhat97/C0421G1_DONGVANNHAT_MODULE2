package _20_Casetudy.services.Custom;

import _20_Casetudy.models.Customer;
import _20_Casetudy.models.Employee;
import _20_Casetudy.services.Service;

import java.util.List;

public interface CustomerService extends Service<Customer> {
    void save(Customer t);
    void editCustomService();
    List<Customer> getAll();
}
