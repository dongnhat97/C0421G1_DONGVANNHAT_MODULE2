package _20_Casetudy.models;

public class Employee extends Person{

   private String position;
    private double salary;
    private String level;

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public Employee(int id, String birthDay, String gender, int cMND, String numberPhone, String eMail, String position, double salary, String level) {
        super(id, birthDay, gender, cMND, numberPhone, eMail);
        this.position = position;
        this.salary = salary;
        this.level = level;

    }

    @Override
    public String toString() {
        return "Employee{" +
                "position='" + position + '\'' +
                ", salary=" + salary +
                ", level='" + level + '\'' +
                ", id=" + id +
                ", birthDay='" + birthDay + '\'' +
                ", gender='" + gender + '\'' +
                ", cMND=" + cMND +
                ", numberPhone='" + numberPhone + '\'' +
                ", eMail='" + eMail + '\'' +
                '}';
    }
}
