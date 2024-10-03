package com.example.productservice.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "project")
public class Product {

    @Id
    private String id;    // Optional if you are using MongoDB auto-generated IDs
    private String name;
    private double price;

    // Default constructor
    public Product() {}

    // Parameterized constructor
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Getters and Setters
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    // Optionally, add setters if you need to update the values
}
