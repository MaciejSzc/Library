package pl.maciejszczesny.JCommerceLibrary.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import pl.maciejszczesny.JCommerceLibrary.models.services.BookService;
import pl.maciejszczesny.JCommerceLibrary.models.services.BookingService;

@Controller
public class BookingController {
    @Autowired
    BookingService bookingService;

   /* @GetMapping("/rent/book/{id}")
    public String rentBook(@PathVariable("id") int id, Model model){

        return
    }*/
}
