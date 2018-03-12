package com.kodilla.hibernate.invoice;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "PRODUCT")
public class Product {
    private String name;
    private int id;
    private List<Item> items = new ArrayList();

    public Product() {
    }

    public Product(String name) {
        this.name = name;
    }

    @Column(name = "NAME")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @GeneratedValue
    @NotNull
    @Id
    @Column(name = "PRODUCT_ID", unique = true)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @OneToMany(
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY
    )
    public List<Item> getItem() {
        return items;
    }

    public void setItem(List<Item> items) {
        this.items = items;
    }
}
