package com.intro.storecoffe.coffee;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.intro.storecoffe.store.Store;
import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class Coffee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private float price;

    Coffee() {}

    @ManyToMany(mappedBy = "coffees")
    @JsonIgnoreProperties("coffees")
    private List<Store> stores = new ArrayList<>();
}
