package pl.maciejszczesny.JCommerceLibrary.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import pl.maciejszczesny.JCommerceLibrary.models.entities.BookEntity;
import pl.maciejszczesny.JCommerceLibrary.models.forms.BookForm;
import pl.maciejszczesny.JCommerceLibrary.models.services.BookService;

@Controller
public class BookController {
    @Autowired
    BookService bookService;

    @GetMapping("/book/add")
    public String bookAdd(Model model){
        model.addAttribute("bookForm", new BookForm());
        return "book_add";
    }

    @PostMapping("/book/add")
    public String bookAddPost(@ModelAttribute BookForm bookForm, Model model){

    bookService.addBook(bookForm);

        return "book_add";
    }

    @GetMapping("/book/all")
    public String bookAll(Model model){
         model.addAttribute("books", bookService.getAll());
        return "book_all";
        }
    @GetMapping("/delete/book/{id}")
    public String deleteBook(@PathVariable("id") int id, Model model){
        bookService.deleteBook(id);
        return "redirect:/book/all";
    }
}
