package _20_Casetudy.models;

public class Villa extends Facility {

    String roomStandardS;
    String poolArea;
    String floorsNumber;


    public Villa(String service, String area, String cost, String numberPerson, String rentalType, String roomStandardS, String poolArea, String floorsNumber) {
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

    public String getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(String poolArea) {
        this.poolArea = poolArea;
    }

    public String getFloorsNumber() {
        return floorsNumber;
    }

    public void setFloorsNumber(String floorsNumber) {
        this.floorsNumber = floorsNumber;
    }

    @Override
    public String toString() {
        return "Villa{" +
                "roomStandardS='" + roomStandardS + '\'' +
                ", poolArea='" + poolArea + '\'' +
                ", floorsNumber='" + floorsNumber + '\'' +
                '}';
    }
}
