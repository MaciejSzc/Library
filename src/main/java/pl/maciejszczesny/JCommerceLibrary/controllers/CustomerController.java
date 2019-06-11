package pl.maciejszczesny.JCommerceLibrary.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import pl.maciejszczesny.JCommerceLibrary.models.forms.CustomerForm;
import pl.maciejszczesny.JCommerceLibrary.models.services.CustomerService;

import javax.validation.Valid;

@Controller
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @GetMapping("/customer/add")
    public String getAddCustomer(Model model){
    model.addAttribute("customerForm", new CustomerForm());
        return "customer_add";
    }

    @PostMapping("/customer/add")
    public String postAddCustomer(@ModelAttribute @Valid CustomerForm customerForm, Model model, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            //At the moment we are not using validation todo
        }
        CustomerService.CustomerResponse customerResponse = customerService.addCustomer(customerForm);
        model.addAttribute("customer", customerResponse);
        return "customer_add";
    }

    @GetMapping("/customer/all")
    public String allCustomers(Model model){

        model.addAttribute("customers", customerService.getAll());

        return "customer_all";
    }

    @GetMapping("/delete/customer/{id}")
    public String deleteCustomer(@PathVariable("id") int id, Model model){
        customerService.deleteCustomer(id);

        return "redirect:/customer/all";
    }

}
