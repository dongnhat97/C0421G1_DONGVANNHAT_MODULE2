package _20_Casetudy.models;

public class Customer extends Person {
    String classify;
    String address;

    public Customer(int id, int birthDay, String gender, int cMND, int numberPhone, String eMail, String classify, String address) {
        super(id, birthDay, gender, cMND, numberPhone, eMail);
        this.classify = classify;
        this.address = address;
    }

}
