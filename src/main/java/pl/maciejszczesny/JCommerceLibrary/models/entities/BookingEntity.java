package pl.maciejszczesny.JCommerceLibrary.models.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Data
@Table(name = "booking")
public class BookingEntity {
    private int customer_id;
    private int book_id;
    private Date startDate;

}
