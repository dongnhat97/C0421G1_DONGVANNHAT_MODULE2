package _0_BaitapAnhtrung;

import java.util.List;

public interface CRUDService<T> {
    List<T>  getAll();
    T getByID(int id);
    void deleteByID(int id);
    void save(T t);
}
