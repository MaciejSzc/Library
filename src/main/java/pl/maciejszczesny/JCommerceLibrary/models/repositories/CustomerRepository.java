package pl.maciejszczesny.JCommerceLibrary.models.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.maciejszczesny.JCommerceLibrary.models.entities.CustomerEntity;
@Repository
public interface CustomerRepository extends CrudRepository<CustomerEntity, Integer> {

    @Query(nativeQuery = true, value = "SELECT * FROM `customer` WHERE surname = ?1")
    CustomerEntity findCustomerBySurname(String surname);



    @Query(nativeQuery = true, value = "SELECT * FROM `customer` WHERE mobile = ?1")
    CustomerEntity findCustomerByTelephone(int mobile);

    @Query(nativeQuery = true, value = "SELECT * FROM `customer` WHERE `id` = ?1")
    CustomerEntity findCustomerById(int id);

}
