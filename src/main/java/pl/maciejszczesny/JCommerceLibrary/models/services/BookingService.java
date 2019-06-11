package pl.maciejszczesny.JCommerceLibrary.models.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.maciejszczesny.JCommerceLibrary.models.repositories.BookRepository;

import java.util.Date;

@Service
public class BookingService {

    @Autowired
    BookRepository bookRepository;

    @Autowired
    CustomerService customerService;









}
