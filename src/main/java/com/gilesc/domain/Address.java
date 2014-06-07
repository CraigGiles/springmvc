package com.gilesc.domain;

import ch.qos.logback.classic.db.names.ColumnName;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="addresses")
public class Address {
    @Id
    @GeneratedValue
    private Long id;
    private Date created_at;
    private Date updated_at;
    private String street;
    private String city;
    private String state;
    private String zipcode;

    protected Address() {
    }

    public Address(String street, String city, String state, String zipcode) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getZipcode() {
        return zipcode;
    }

    public Long getId() {
        return id;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public Date getUpdated_at() {
        return updated_at;
    }

    @PrePersist
    protected void onCreate() {
        created_at = new Date();
    }

    @PreUpdate
    protected void onUpdate() {
        updated_at = new Date();
    }
}
