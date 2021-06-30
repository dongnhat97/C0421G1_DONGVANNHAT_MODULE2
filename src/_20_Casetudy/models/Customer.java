package _20_Casetudy.models;

public class Customer extends Person {
    String classify;
    String address;

    public Customer(int id, String birthDay, String gender, int cMND, String numberPhone, String eMail, String classify, String address) {
        super(id, birthDay, gender, cMND, numberPhone, eMail);
        this.classify = classify;
        this.address = address;
    }

    public String getClassify() {
        return classify;
    }

    public void setClassify(String classify) {
        this.classify = classify;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "classify='" + classify + '\'' +
                ", address='" + address + '\'' +
                ", id=" + id +
                ", birthDay='" + birthDay + '\'' +
                ", gender='" + gender + '\'' +
                ", cMND=" + cMND +
                ", numberPhone=" + numberPhone +
                ", eMail='" + eMail + '\'' +
                '}';
    }
}
