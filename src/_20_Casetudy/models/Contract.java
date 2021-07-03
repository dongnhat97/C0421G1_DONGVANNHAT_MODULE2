package _20_Casetudy.models;

public class Contract {
    private String numberContract;
    private String codeBooking;
    private String beforMoney;
    private String allMoney;
    private String  codeCustomer;

    public Contract(String numberContract, String codeBooking, String beforMoney, String allMoney, String codeCustomer) {
        this.numberContract = numberContract;
        this.codeBooking = codeBooking;
        this.beforMoney = beforMoney;
        this.allMoney = allMoney;
        this.codeCustomer = codeCustomer;
    }

    public String getNumberContract() {
        return numberContract;
    }

    public void setNumberContract(String numberContract) {
        this.numberContract = numberContract;
    }

    public String getCodeBooking() {
        return codeBooking;
    }

    public void setCodeBooking(String codeBooking) {
        this.codeBooking = codeBooking;
    }

    public String getBeforMoney() {
        return beforMoney;
    }

    public void setBeforMoney(String beforMoney) {
        this.beforMoney = beforMoney;
    }

    public String getAllMoney() {
        return allMoney;
    }

    public void setAllMoney(String allMoney) {
        this.allMoney = allMoney;
    }

    public String getCodeCustomer() {
        return codeCustomer;
    }

    public void setCodeCustomer(String codeCustomer) {
        this.codeCustomer = codeCustomer;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "numberContract='" + numberContract + '\'' +
                ", codeBooking='" + codeBooking + '\'' +
                ", beforMoney='" + beforMoney + '\'' +
                ", allMoney='" + allMoney + '\'' +
                ", codeCustomer='" + codeCustomer + '\'' +
                '}';
    }
}
