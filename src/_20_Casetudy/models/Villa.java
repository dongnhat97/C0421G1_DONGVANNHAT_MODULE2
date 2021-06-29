package _20_Casetudy.models;

public class Villa extends Facility {

    String roomStandardS;
    double poolArea;
    int floorsNumber;

    public Villa(String service, double area, double cost, int numberPerson, String rentalType, String roomStandardS, double poolArea, int floorsNumber) {
        super(service, area, cost, numberPerson, rentalType);
        this.roomStandardS = roomStandardS;
        this.poolArea = poolArea;
        this.floorsNumber = floorsNumber;
    }

    public String getRoomStandardS() {
        return roomStandardS;
    }

    public void setRoomStandardS(String roomStandardS) {
        this.roomStandardS = roomStandardS;
    }

    public double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(double poolArea) {
        this.poolArea = poolArea;
    }

    public int getFloorsNumber() {
        return floorsNumber;
    }

    public void setFloorsNumber(int floorsNumber) {
        this.floorsNumber = floorsNumber;
    }


    @Override
    public String toString() {
        return "Villa{" +
                "roomStandardS='" + roomStandardS + '\'' +
                ", poolArea=" + poolArea +
                ", floorsNumber=" + floorsNumber +
                ", service='" + service + '\'' +
                ", area=" + area +
                ", cost=" + cost +
                ", numberPerson=" + numberPerson +
                ", rentalType='" + rentalType + '\'' +
                '}';
    }
}
