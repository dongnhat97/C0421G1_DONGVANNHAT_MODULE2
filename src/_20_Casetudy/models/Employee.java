package _20_Casetudy.models;

public class Employee extends Person{
   private String level;
   private String position;
    private double salary;

    public Employee(int id, String birthDay, String gender, int cMND, int numberPhone, String eMail, String level, String position, double salary) {
        super(id, birthDay, gender, cMND, numberPhone, eMail);
        this.level = level;
        this.position = position;
        this.salary = salary;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

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

    @Override
    public String toString() {
        return "Employee{" +
                "level='" + level + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +super.toString()+
                '}';
    }
}
