package _0_BaitapAnhtrung;

public class Student1 extends PerSon {
   private String _class = "C04";
   public Student1(){

   }

    public Student1(int id, String name, int age, String address, String _class) {
        super(id, name, age, address);
        this._class = _class;
    }

    public String get_class() {
        return _class;
    }

    public void set_class(String _class) {
        this._class = _class;
    }
    public void study() {
        System.out.println("hoc tieng anh");
    }


    @Override
    public String toString() {
        return "Student1{" +
                "_class='" + _class + '\'' +"  "+super.toString()+
                '}';
    }
}
