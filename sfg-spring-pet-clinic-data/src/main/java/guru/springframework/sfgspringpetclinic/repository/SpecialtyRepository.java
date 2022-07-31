package guru.springframework.sfgspringpetclinic.repository;

import guru.springframework.sfgspringpetclinic.model.Specialty;
import org.springframework.data.repository.CrudRepository;

public interface SpecialtyRepository extends CrudRepository<Specialty, Long> {
}
