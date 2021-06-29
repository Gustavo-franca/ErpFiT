package Domain.models.peaple;

import java.time.LocalDate;

public class Personal extends PhysicalPerson{
    private LocalDate entryDate;
    public Personal(String name, String cpf, LocalDate birthDate, LocalDate entryDate) {
        super(name, cpf, birthDate);
        this.setEntryDate(entryDate);
    }
    public LocalDate getEntryDate() {
        return entryDate;
    }
    public void setEntryDate(LocalDate entryDate) {
        this.entryDate = entryDate;
    }
  
}
