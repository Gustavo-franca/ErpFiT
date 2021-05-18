package infrastructure.repositories;

public interface IRepository<T> {
    public void register(T t);
    int findIdByDesc(String description);
    T findByDesc(String description);
}
