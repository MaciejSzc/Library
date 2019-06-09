package pl.maciejszczesny.JCommerceLibrary.models.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.maciejszczesny.JCommerceLibrary.models.entities.CustomerEntity;
@Repository
public interface CustomerRepository extends CrudRepository<CustomerEntity, Integer> {



}
