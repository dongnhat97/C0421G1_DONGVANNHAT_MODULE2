package _18_Serializable.exercise;

import _12_Conllections.exercise.Product;

import java.io.Serializable;

public class Product1 implements Serializable {
    private int id;
    private String name;
    private int cost;
    private String brand;

    public Product1(int id, String name, int cost, String brand) {
        this.id = id;
        this.name = name;
        this.cost = cost;
        this.brand = brand;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Product1{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cost=" + cost +
                ", brand='" + brand + '\'' +
                '}';
    }
}
