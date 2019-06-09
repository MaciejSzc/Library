package pl.maciejszczesny.JCommerceLibrary.models.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.maciejszczesny.JCommerceLibrary.models.entities.CustomerEntity;
@Repository
public interface CustomerRepository extends CrudRepository<CustomerEntity, Integer> {
//ToDo: one method , out of three
    @Query(nativeQuery = true, value = "SELECT * FROM `customer` WHERE surname = ?1")
    boolean findCustomerBySurname(String surname);

    @Query(nativeQuery = true, value = "SELECT * FROM `customer` WHERE `name` = ?1")
    CustomerEntity findCustomerByName(String name);

    @Query(nativeQuery = true, value = "SELECT * FROM `customer` WHERE mobile = ?1")
    boolean findCustomerByTelephone(int mobile);

}
