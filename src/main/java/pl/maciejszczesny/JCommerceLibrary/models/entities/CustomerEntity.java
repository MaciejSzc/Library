package pl.maciejszczesny.JCommerceLibrary.models.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "customer")
public class CustomerEntity {
    private @Id @GeneratedValue int id;
    private String name;
    private String surname;
    private int mobile;

}
