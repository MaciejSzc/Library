package pl.maciejszczesny.JCommerceLibrary.models.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.maciejszczesny.JCommerceLibrary.models.entities.BookEntity;
import pl.maciejszczesny.JCommerceLibrary.models.entities.CustomerEntity;
import pl.maciejszczesny.JCommerceLibrary.models.forms.BookForm;
import pl.maciejszczesny.JCommerceLibrary.models.repositories.BookRepository;

@Service
public class BookService {

    @Autowired
    BookRepository bookRepository;

    public Iterable<BookEntity> getAll(){
        return bookRepository.findAll();
    }

    public void addBook(BookForm bookForm){
        BookEntity bookEntity = new BookEntity();

        bookEntity.setTitle(bookForm.getTitle());
        bookEntity.setAuthor(bookForm.getAuthor());

        bookRepository.save(bookEntity);
    }

    public void deleteBook(int id){
        bookRepository.delete(bookRepository.findBookEntitiesByIdById(id));
    }
}
