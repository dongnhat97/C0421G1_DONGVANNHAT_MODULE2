package _20_Casetudy.models;

public class Contract {
    int numberContract;
    int codeBooking;
    double beforMoney;
    double allMoney;
    int  codeCustomer;

    public Contract(int numberContract, int codeBooking, double beforMoney, double allMoney, int codeCustomer) {
        this.numberContract = numberContract;
        this.codeBooking = codeBooking;
        this.beforMoney = beforMoney;
        this.allMoney = allMoney;
        this.codeCustomer = codeCustomer;
    }
}
