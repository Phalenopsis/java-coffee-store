package com.intro.storecoffe.store;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.intro.storecoffe.coffee.Coffee;
import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class Store {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String location;
    private float rating;
    private String name;

    @ManyToMany(cascade = CascadeType.ALL)
    @JsonIgnoreProperties("stores")
    private List<Coffee> coffees = new ArrayList<>();

    public void addCoffee(Coffee coffee) {
        this.coffees.add(coffee);
    }
}
