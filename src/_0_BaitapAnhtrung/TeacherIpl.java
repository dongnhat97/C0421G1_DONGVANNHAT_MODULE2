package _0_BaitapAnhtrung;

import java.util.*;

public class TeacherIpl implements TeacherItf {
    private static Scanner scanner = new Scanner(System.in);
    private static Map<Integer,Teacher> teacherMap = new HashMap<>();
    static {
        teacherMap.put(1,new Teacher(1,"Nhat",23,"Da Nang","codgym"));
        teacherMap.put(2,new Teacher(2,"Diep",33,"Quang Binh","codgym"));
        teacherMap.put(3,new Teacher(3,"Phuc",27,"Thanh Hoa","codgym"));
        teacherMap.put(4,new Teacher(4,"Tai",29,"Da Nang","codgym"));
    }



    @Override
    public List<Teacher> getAll() {
        return new ArrayList<>(teacherMap.values());
    }

    @Override
    public Teacher getByID(int id) {
        return teacherMap.get(id);
    }

    @Override
    public void deleteByID(int id) {
     teacherMap.remove(id);
    }

    @Override
    public void save(Teacher teacher) {
      teacherMap.put(teacher.getId(),teacher);
    }
    public void creatTeacher() {
//        System.out.println(getAll());
        System.out.println(teacherMap);
    }
    public void deleteTeacher() {
        System.out.println("nhap id teacher ban muon xoa");
        int id = Integer.parseInt(scanner.nextLine());
        deleteByID(id);
    }

}
