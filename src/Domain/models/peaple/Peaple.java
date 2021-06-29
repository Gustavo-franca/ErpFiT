package Domain.models.peaple;

public abstract class Peaple {
    private Integer id;
    private String name;
    
    public Peaple(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public Peaple(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
