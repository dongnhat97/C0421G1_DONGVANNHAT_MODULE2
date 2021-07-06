package _20_Casetudy.controllers;

import _20_Casetudy.libs.Choice;
import _20_Casetudy.services.Custom.CustomerServiceImpl;

public class CustomerController {
    public static void Customer() {
        CustomerServiceImpl customerService = new CustomerServiceImpl();
        System.out.println("1. Display list customers\n" +
                "2. Add new customer\n" +
                "3. Edit customer\n" +
                "4. Return main menu");
        int choiceTwo = Choice.choiceMenu();
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
                FuramaController.displayMainMenu();
                break;
            default:
                System.out.println("khong co trong menu");
                break;
        }
    }
}
