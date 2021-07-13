package _20_Casetudy.models;

public class Customer extends Person {
    private String classify;
    private String address;

    public Customer(int id, String name, String birthDay, String gender, String cMND, String numberPhone, String eMail, String classify, String address) {
        super(id, name, birthDay, gender, cMND, numberPhone, eMail);
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
                ", name='" + name + '\'' +
                ", birthDay='" + birthday + '\'' +
                ", gender='" + gender + '\'' +
                ", cMND='" + identityCard + '\'' +
                ", numberPhone='" + numberPhone + '\'' +
                ", eMail='" + email + '\'' +
                '}';
    }
}
