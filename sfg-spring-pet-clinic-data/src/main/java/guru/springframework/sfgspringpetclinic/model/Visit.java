package guru.springframework.sfgspringpetclinic.model;

import java.time.LocalDate;

public class Visit extends BaseEntity {

    private LocalDate localDate;
    private String description;
    private Pet pet;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }
}