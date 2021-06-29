package Domain.models.peaple;

public class LegalPerson extends Peaple{
    private String cnpj;
    public LegalPerson(String name, String cnpj) {
        super(name);
        this.setCnpj(cnpj);
    }
    public String getCnpj() {
        return cnpj;
    }
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    
}
