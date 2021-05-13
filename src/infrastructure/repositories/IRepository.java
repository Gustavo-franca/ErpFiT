package infrastructure.repositories;

public interface IRepository<T> {
    public void register(T t);
}
