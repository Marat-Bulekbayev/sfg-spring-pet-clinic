package guru.springframework.sfgspringpetclinic.repository;

import guru.springframework.sfgspringpetclinic.model.Vet;
import org.springframework.data.repository.CrudRepository;

public interface VetRepository extends CrudRepository<Vet, Long> {
}
