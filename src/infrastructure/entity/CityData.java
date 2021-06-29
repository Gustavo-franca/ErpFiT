package infrastructure.entity;

public class CityData {
    public Integer id;

    @Override
    public String toString(){
        return String.format("%d", id);
    }
}
