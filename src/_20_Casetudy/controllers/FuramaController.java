package _20_Casetudy.controllers;

import _20_Casetudy.libs.Choice;
import _20_Casetudy.services.Custom.CustomerServiceImpl;
import _20_Casetudy.services.Employee.EmployeeServiceImpl;
import _20_Casetudy.services.Facility.FacilityServiceImpl;

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
        System.out.println("3: Facility Management");
        System.out.println("4: Booking Managerment");
        System.out.println("5: Promotion Management");
        System.out.println("6: Exit");
        int choice = Choice.choiceMenu();
        while (true) {

             switch (choice) {
                 case 1:
                     EmployeeController.Employee();
                     break;
                 case 2:
                     CustomerController.Customer();
                     break;
                 case 3:
                     FacilityController.Facility();
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