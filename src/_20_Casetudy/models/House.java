package _20_Casetudy.models;

public class House extends Facility {
    String roomStandardS;
    int floorsNumber;

    public House(String service, double area, double cost, int numberPerson, String rentalType, String roomStandardS, int floorsNumber) {
        super(service, area, cost, numberPerson, rentalType);
        this.roomStandardS = roomStandardS;
        this.floorsNumber = floorsNumber;
    }

    public String getRoomStandardS() {
        return roomStandardS;
    }

    public void setRoomStandardS(String roomStandardS) {
        this.roomStandardS = roomStandardS;
    }

    public int getFloorsNumber() {
        return floorsNumber;
    }

    public void setFloorsNumber(int floorsNumber) {
        this.floorsNumber = floorsNumber;
    }

    @Override
    public String toString() {
        return "House{" +
                "roomStandardS='" + roomStandardS + '\'' +
                ", floorsNumber=" + floorsNumber +
                ", service='" + service + '\'' +
                ", area=" + area +
                ", cost=" + cost +
                ", numberPerson=" + numberPerson +
                ", rentalType='" + rentalType + '\'' +
                '}';
    }
}
