package com.example.obspringdatajpa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Coche {
    // atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String manufacturer;
    private String model;
    private Integer anio;

    // constructores

    public Coche() {
    }

    public Coche(Long id, String manufacturer, String model, Integer anio) {
        this.id = id;
        this.manufacturer = manufacturer;
        this.model = model;
        this.anio = anio;
    }

    // getter y setter

    public Long getId() {
        return id;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getAnio() { return anio; }

    public void setAnio(Integer anio) { this.anio = anio; }

    @Override
    public String toString() {
        return "Coche{" +
                "id=" + id +
                ", manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", anio=" + anio +
                '}';
    }
}
