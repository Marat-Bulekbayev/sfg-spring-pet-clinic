package guru.springframework.sfgspringpetclinic.service;

import guru.springframework.sfgspringpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);
}
