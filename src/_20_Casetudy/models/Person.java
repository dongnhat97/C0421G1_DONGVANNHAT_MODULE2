package _20_Casetudy.models;

public abstract class Person {
    private int id;
    private String birthDay;
    private String gender;
    private int cMND;
    private int numberPhone;
    private String eMail;

    public Person(int id, String birthDay, String gender, int cMND, int numberPhone, String eMail) {
        this.id = id;
        this.birthDay = birthDay;
        this.gender = gender;
        this.cMND = cMND;
        this.numberPhone = numberPhone;
        this.eMail = eMail;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getcMND() {
        return cMND;
    }

    public void setcMND(int cMND) {
        this.cMND = cMND;
    }

    public int getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(int numberPhone) {
        this.numberPhone = numberPhone;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", birthDay='" + birthDay + '\'' +
                ", gender='" + gender + '\'' +
                ", cMND=" + cMND +
                ", numberPhone=" + numberPhone +
                ", eMail='" + eMail + '\'' +
                '}';
    }
}
