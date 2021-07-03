package _20_Casetudy.models;

public abstract class Facility {
    private String service;
    private String area;
    private String cost;
    private String numberPerson;
    private String rentalType;
    public Facility() {

    }

    public Facility(String service, String area, String cost, String numberPerson, String rentalType) {
        this.service = service;
        this.area = area;
        this.cost = cost;
        this.numberPerson = numberPerson;
        this.rentalType = rentalType;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public String getNumberPerson() {
        return numberPerson;
    }

    public void setNumberPerson(String numberPerson) {
        this.numberPerson = numberPerson;
    }

    public String getRentalType() {
        return rentalType;
    }

    public void setRentalType(String rentalType) {
        this.rentalType = rentalType;
    }

    @Override
    public String toString() {
        return "Facility{" +
                "service='" + service + '\'' +
                ", area='" + area + '\'' +
                ", cost='" + cost + '\'' +
                ", numberPerson='" + numberPerson + '\'' +
                ", rentalType='" + rentalType + '\'' +
                '}';
    }
}
