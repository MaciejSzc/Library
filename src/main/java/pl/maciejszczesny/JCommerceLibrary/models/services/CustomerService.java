package pl.maciejszczesny.JCommerceLibrary.models.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.maciejszczesny.JCommerceLibrary.models.entities.CustomerEntity;
import pl.maciejszczesny.JCommerceLibrary.models.forms.CustomerForm;
import pl.maciejszczesny.JCommerceLibrary.models.repositories.CustomerRepository;

@Service
public class CustomerService {
    public enum CustomerResponse {
        CREATED, CUSTOMER_ALREADY_EXIST;
    }
    @Autowired
    CustomerRepository customerRepository;

    public Iterable<CustomerEntity> getAll(){
        return customerRepository.findAll();
    }

    public CustomerResponse addCustomer(CustomerForm customerForm){
        CustomerEntity customerEntity = new CustomerEntity();

        if(customerRepository.findCustomerBySurname(customerForm.getSurname()) && customerRepository.findCustomerByTelephone(customerForm.getMobile())){
            return CustomerResponse.CUSTOMER_ALREADY_EXIST;
        }

        customerEntity.setName(customerForm.getName());
        customerEntity.setSurname(customerEntity.getSurname());
        customerEntity.setMobile(customerEntity.getMobile());

        customerRepository.save(customerEntity);

        return  CustomerResponse.CREATED;

    }

    
}
