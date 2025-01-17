package assignment.lab4.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Product {

    @Id
    private int id;
    private String name;
    private float price;

}
