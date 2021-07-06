package _20_Casetudy.controllers;

import _20_Casetudy.libs.Choice;
import _20_Casetudy.services.Employee.EmployeeServiceImpl;

public class EmployeeController {
    public  static  EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
    public static void Employee() {
        System.out.println("1: Display list employees");
        System.out.println("2: Add new employee");
        System.out.println("3: Edit employee\n" +
                "4: Return main menu");
        int choiceOne = Choice.choiceMenu();
        switch (choiceOne) {
            case 1:
                employeeService.showInfo();
                break;
            case 2:
                employeeService.addEmployee();
                break;
            case 3:
                employeeService.editEmployeeService();
                break;
            case 4:
                FuramaController.displayMainMenu();
                break;
            default:
                System.out.println("khong co trong menu");
                break;
        }
    }
}
