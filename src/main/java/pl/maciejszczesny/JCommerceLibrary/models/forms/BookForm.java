package pl.maciejszczesny.JCommerceLibrary.models.forms;

import lombok.Data;

import java.util.Date;

@Data
public class BookForm {
    private int customer_id;
    private int book_id;
    private Date startDate;
}
