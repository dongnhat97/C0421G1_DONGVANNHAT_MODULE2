package _20_Casetudy.models;

public abstract class Facility {
    String service;
    double area;
    double cost;
    int numberPerson;
    String rentalType;
    public Facility() {

    }

    public Facility(String service, double area, double cost, int numberPerson, String rentalType) {
        this.service = service;
        this.area = area;
        this.cost = cost;
        this.numberPerson = numberPerson;
        this.rentalType = rentalType;
    }
}
