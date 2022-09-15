package com.laptop.exercise4.entity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table( name = "laptop")
public class LaptopEntity {

    @Id
    @GeneratedValue( strategy =  GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String brand;
    @Column(nullable = false)
    private Double price;
    private LocalDate dateSell;

    public LaptopEntity() {
    }

    public LaptopEntity(Long id, String name, String brand, Double price, LocalDate dateSell) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.dateSell = dateSell;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public LocalDate getDateSell() {
        return dateSell;
    }

    public void setDateSell(LocalDate dateSell) {
        this.dateSell = dateSell;
    }

    @Override
    public String toString() {
        return "LaptopEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                ", dateSell=" + dateSell +
                '}';
    }
}
