package _20_Casetudy.models;

import java.io.Serializable;

public abstract class Facility implements Serializable {
    protected String service;
    protected float area;
    protected String cost;
    protected int numberPerson;
    protected String rentalType;
    public Facility() {

    }

    public Facility(String service, float area, String cost, int numberPerson, String rentalType) {
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

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public int getNumberPerson() {
        return numberPerson;
    }

    public void setNumberPerson(int numberPerson) {
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
                ", area=" + area +
                ", cost='" + cost + '\'' +
                ", numberPerson='" + numberPerson + '\'' +
                ", rentalType='" + rentalType + '\'' +
                '}';
    }
}
