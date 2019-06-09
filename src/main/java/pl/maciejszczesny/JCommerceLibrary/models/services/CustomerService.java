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


    public CustomerResponse addCustomer(CustomerForm customerForm){
        CustomerEntity customerEntity = new CustomerEntity();




    }
}
