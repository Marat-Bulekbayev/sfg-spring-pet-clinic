package guru.springframework.sfgspringpetclinic.model;

import java.time.LocalDate;

public class Pet extends BaseEntity {

    private PetType type;
    private Owner owner;
    private LocalDate birthDate;
    private String name;

    public PetType getType() {
        return type;
    }

    public void setPetType(PetType type) {
        this.type = type;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthday) {
        this.birthDate = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
