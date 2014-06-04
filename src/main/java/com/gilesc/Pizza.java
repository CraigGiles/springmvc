package com.gilesc;

import javax.persistence.*;

@Entity
@Table(name="pizza")
public class Pizza {
    @Id
    @GeneratedValue
    @Column(nullable=false)
    private long id;

    @Column(nullable=true)
    private String name;

    @Column(nullable=true)
    private double price;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
