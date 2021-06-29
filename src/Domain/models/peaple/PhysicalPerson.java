package Domain.models.peaple;

import java.time.LocalDate;

public abstract class  PhysicalPerson extends Peaple{
    private String cpf;
    private LocalDate birthDate;

    public PhysicalPerson(String name, String cpf, LocalDate birthDate) {
        super(name);
        this.cpf = cpf;
        this.birthDate = birthDate;
    }
    public LocalDate getBirthDate() {
        return birthDate;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
}
