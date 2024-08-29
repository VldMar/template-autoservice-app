package ru.vladimir.model;

import java.time.LocalDate;

public class Car implements BaseEntity<Long> {

    private Long id;
    private String brand;
    private String model;
    private String color;
    private LocalDate releaseDate;

    public Car(Long id, String brand, String model, String color, LocalDate releaseDate) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.releaseDate = releaseDate;
    }

    @Override
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", releaseDate=" + releaseDate +
                '}';
    }
}
