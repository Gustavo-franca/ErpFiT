package infrastructure.entity;

public class CountryData {

    public Integer id;
    public String campo1 = "campo1";
    public String campo2 = "campo1";
    public String campo3;
    public int numero = 1;
    public double numero2 = 0.1;
    public CityData city = new CityData();

    public String description;

    public CountryData(int id, String description) {
        this.id = id;
        this.description = description;
        this.city.id = 10;
    }

}
