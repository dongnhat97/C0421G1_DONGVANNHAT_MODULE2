package _20_Casetudy.controllers;

import _20_Casetudy.models.Employee;
import _20_Casetudy.services.CustomerServiceImpl;
import _20_Casetudy.services.EmployeeServiceImpl;

import java.util.Scanner;

public class FuramaController {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        displayMainMenu();
    }

    public static void displayMainMenu() {
        System.out.println("Moi ban nhap menu");
        System.out.println("1: Employee Management");
        System.out.println("2: Customer Management");
        System.out.println("3: Customer Management");
        System.out.println("4: Facility Management");
        System.out.println("5: Promotion Management");
        System.out.println("6: Exit");
        int choice = scanner.nextInt();
        while (true) {
             switch (choice) {
                 case 1:
                     EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
                     System.out.println("1: Display list employees");
                     System.out.println("2: Add new employee");
                     System.out.println("3: Edit employee\n" +
                             "4: Return main menu");
                     int choiceOne = scanner.nextInt();
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
                             displayMainMenu();
                             break;
                         default:
                             System.out.println("khong co trong menu");
                             break;
                     }

                     break;
                 case 2:
                     CustomerServiceImpl customerService = new CustomerServiceImpl();
                     System.out.println("1. Display list customers\n" +
                             "2. Add new customer\n" +
                             "3. Edit customer\n" +
                             "4. Return main menu");
                     int choiceTwo = scanner.nextInt();
                     switch (choiceTwo) {
                         case 1:
                             customerService.showInfo();
                             break;
                         case 2:
                             customerService.addCustomService();
                             break;
                         case 3:
                             customerService.editCustomService();
                             break;
                         case 4:
                             displayMainMenu();
                             break;
                         default:
                             System.out.println("khong co trong menu");
                             break;
                     }
                     break;
                 case 3:
                     System.out.println("1 Display list facility\n" +
                             "2. Add new facility\n" +
                             "3. Display list facility maintenance\n" +
                             "4. Return main menu");
                     break;
                 case 4:
                     System.out.println("1. Add new booking\n" +
                             "2. Display list booking\n" +
                             "3. Create new constracts\n" +
                             "4. Display list contracts\n" +
                             "5. Edit contracts\n" +
                             "6. Return main menu");
                     break;
                 case 5:
                     System.out.println("1. Display list customers use service\n" +
                             "2. Display list customers get voucher\n" +
                             "3. Return main menu");
                     break;
                 case 6:
                     System.exit(6);
                     break;
                 default:
                     System.out.println("nhap sai roi moi ban nhap lai");
             }

        }
    }
}