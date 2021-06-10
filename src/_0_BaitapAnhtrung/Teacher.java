package _0_BaitapAnhtrung;

public class Teacher extends PerSon {
    private String level;
    public Teacher() {

    }

    public Teacher(int id, String name, int age, String address, String school) {
        super(id, name, age, address);
        this.level = school;
    }

    public String getSchool() {
        return level;
    }

    public void setSchool(String school) {
        this.level = school;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "school='" + level + '\'' +" "+super.toString()+
                '}';
    }
}
