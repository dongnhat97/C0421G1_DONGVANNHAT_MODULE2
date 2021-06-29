package _20_Casetudy.models;

public class Booking {
    int codeBook;
    int startDay;
    int CodeCustomer;
    int endDay;
    String service;
    String serviceLevel;

    public Booking(int codeBook, int startDay, int codeCustomer, int endDay, String service, String serviceLevel) {
        this.codeBook = codeBook;
        this.startDay = startDay;
        CodeCustomer = codeCustomer;
        this.endDay = endDay;
        this.service = service;
        this.serviceLevel = serviceLevel;
    }
}
