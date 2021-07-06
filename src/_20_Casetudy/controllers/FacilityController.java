package _20_Casetudy.controllers;

import _20_Casetudy.libs.Choice;
import _20_Casetudy.services.Facility.FacilityServiceImpl;

public class FacilityController {
    public static void Facility() {
        FacilityServiceImpl facilityService = new FacilityServiceImpl();
        System.out.println("1 Display list facility\n" +
                "2. Add new facility\n" +
                "3. Display list facility maintenance\n" +
                "4. Return main menu");

        int choiceThree = Choice.choiceMenu();
        switch (choiceThree) {
            case 1:
                facilityService.showInfo();
                break;
            case 2:
                facilityService.addFacility();
                break;
            case 3:
                facilityService.displayListMaintenance();
                break;
            case 4:
                FuramaController.displayMainMenu();
                break;
            default:
                System.out.println("Khong co trong menu");
                break;
        }
    }
}
