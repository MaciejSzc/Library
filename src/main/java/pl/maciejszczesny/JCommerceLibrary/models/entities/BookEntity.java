package pl.maciejszczesny.JCommerceLibrary.models.entities;

import lombok.Data;
import org.springframework.context.annotation.EnableMBeanExport;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Data
@Table(name = "book")
public class BookEntity {
    private @Id @GeneratedValue int id;
    private String title;
    private String author;
   // private @GeneratedValue boolean is_borrowed;


}
