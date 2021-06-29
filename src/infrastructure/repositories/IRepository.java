package infrastructure.repositories;

import Domain.models.address.Country;
import java.util.List;

public interface IRepository<T> {
     void register(T t);
    void save(T t);
    Integer findIdByDesc(String description);
    T findByDesc(String description);
    List<T> findAll();
    List<T> searchFor(String search);
    T findById(Integer id);
}
