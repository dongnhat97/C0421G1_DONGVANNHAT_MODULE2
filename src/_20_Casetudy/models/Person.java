package _20_Casetudy.models;

import java.io.Serializable;

public abstract class Person implements Serializable {
    protected int id;
    protected String name;
    protected String birthDay;
    protected String gender;
    protected String cMND;
    protected String numberPhone;
    protected String eMail;

    public Person(int id, String name, String birthDay, String gender, String cMND, String numberPhone, String eMail) {
        this.id = id;
        this.name = name;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getcMND() {
        return cMND;
    }

    public void setcMND(String cMND) {
        this.cMND = cMND;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
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
                ", name='" + name + '\'' +
                ", birthDay='" + birthDay + '\'' +
                ", gender='" + gender + '\'' +
                ", cMND=" + cMND +
                ", numberPhone='" + numberPhone + '\'' +
                ", eMail='" + eMail + '\'' +
                '}';
    }
}
