package _20_Casetudy.models;

public class Employee extends Person{

   private String position;
    private String salary;
    private String level;

    public Employee(int id, String name, String birthDay, String gender, String cMND, String numberPhone, String eMail, String position, String salary, String level) {
        super(id, name, birthDay, gender, cMND, numberPhone, eMail);
        this.position = position;
        this.salary = salary;
        this.level = level;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "position='" + position + '\'' +
                ", salary='" + salary + '\'' +
                ", level='" + level + '\'' +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", birthDay='" + birthDay + '\'' +
                ", gender='" + gender + '\'' +
                ", cMND='" + cMND + '\'' +
                ", numberPhone='" + numberPhone + '\'' +
                ", eMail='" + eMail + '\'' +
                '}';
    }
}
