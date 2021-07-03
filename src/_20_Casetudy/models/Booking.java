package _20_Casetudy.models;

public class Booking implements Comparable<Booking> {
    private String codeBook;
    private int startDay;
    private String CodeCustomer;
    private int endDay;
    private String service;
    private String serviceLevel;

    public Booking(String codeBook, int startDay, String codeCustomer, int endDay, String service, String serviceLevel) {
        this.codeBook = codeBook;
        this.startDay = startDay;
        CodeCustomer = codeCustomer;
        this.endDay = endDay;
        this.service = service;
        this.serviceLevel = serviceLevel;
    }

    public String getCodeBook() {
        return codeBook;
    }

    public void setCodeBook(String codeBook) {
        this.codeBook = codeBook;
    }

    public int getStartDay() {
        return startDay;
    }

    public void setStartDay(int startDay) {
        this.startDay = startDay;
    }

    public String getCodeCustomer() {
        return CodeCustomer;
    }

    public void setCodeCustomer(String codeCustomer) {
        CodeCustomer = codeCustomer;
    }

    public int getEndDay() {
        return endDay;
    }

    public void setEndDay(int endDay) {
        this.endDay = endDay;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public String getServiceLevel() {
        return serviceLevel;
    }

    public void setServiceLevel(String serviceLevel) {
        this.serviceLevel = serviceLevel;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "codeBook='" + codeBook + '\'' +
                ", startDay=" + startDay +
                ", CodeCustomer='" + CodeCustomer + '\'' +
                ", endDay=" + endDay +
                ", service='" + service + '\'' +
                ", serviceLevel='" + serviceLevel + '\'' +
                '}';
    }

    @Override
    public int compareTo(Booking o) {
        if (o.getStartDay() > this.getStartDay()) {
            return 1;
        } else if (o.getStartDay() < this.getStartDay()) {
            return -1;
        } else {
            return 0;
        }
    }
}