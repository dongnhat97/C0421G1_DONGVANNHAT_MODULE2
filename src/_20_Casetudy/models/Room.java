package _20_Casetudy.models;

public class Room extends Facility {
    String freeService;

    public Room(String service, String area, String cost, String numberPerson, String rentalType, String freeService) {
        super(service, area, cost, numberPerson, rentalType);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

//    @Override
//    public String toString() {
//        return "Room{" +
//                "freeService='" + freeService + '\'' +
//                ", service='" + service + '\'' +
//                ", area=" + area +
//                ", cost=" + cost +
//                ", numberPerson=" + numberPerson +
//                ", rentalType='" + rentalType + '\'' +
//                '}';
//    }
}
