package guru.springframework.sfgspringpetclinic.repository;

import guru.springframework.sfgspringpetclinic.model.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
