package _20_Casetudy.models;

public class Booking implements Comparable<Booking> {
    private String bookingID;
    private int startDay;
    private String codeCustomer;
    private int endDay;
    private String service;
    private String serviceLevel;

    public Booking(String bookingID, int startDay, String codeCustomer, int endDay, String service, String serviceLevel) {
        this.bookingID = bookingID;
        this.startDay = startDay;
        this.codeCustomer = codeCustomer;
        this.endDay = endDay;
        this.service = service;
        this.serviceLevel = serviceLevel;
    }

    public String getBookingID() {
        return bookingID;
    }

    public void setBookingID(String bookingID) {
        this.bookingID = bookingID;
    }

    public int getStartDay() {
        return startDay;
    }

    public void setStartDay(int startDay) {
        this.startDay = startDay;
    }

    public String getCodeCustomer() {
        return codeCustomer;
    }

    public void setCodeCustomer(String codeCustomer) {
        this.codeCustomer = codeCustomer;
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
                "bookingID='" + bookingID + '\'' +
                ", startDay=" + startDay +
                ", CodeCustomer='" + codeCustomer + '\'' +
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