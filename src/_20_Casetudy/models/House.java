package _20_Casetudy.models;

public class House extends Facility {
    String roomStandardS;
    String floorsNumber;


    public House(String service, String area, String cost, String numberPerson, String rentalType, String roomStandardS, String floorsNumber) {
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

    public String getFloorsNumber() {
        return floorsNumber;
    }

    public void setFloorsNumber(String floorsNumber) {
        this.floorsNumber = floorsNumber;
    }

    @Override
    public String toString() {
        return "House{" +
                "roomStandardS='" + roomStandardS + '\'' +
                ", floorsNumber='" + floorsNumber + '\'' +
                '}';
    }
}
