package _20_Casetudy.services;

import _20_Casetudy.models.Customer;
import _20_Casetudy.models.Employee;

public interface CustomerService extends Service<Customer> {
    void save(Customer t);
    void editCustomService();
}
