package _0_BaitapAnhtrung;

import java.util.List;

public interface StudentTtf extends CRUDService<Student>  {
    List<Student> sortByName(String name);
}
