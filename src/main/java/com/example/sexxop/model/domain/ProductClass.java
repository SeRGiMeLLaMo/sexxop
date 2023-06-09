package com.example.sexxop.model.domain;

import java.util.Objects;

public class ProductClass {
    private int id;
    private String name;
    private double price;
    private String more;

    public ProductClass(int id, String name, double price, String more) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.more = more;
    }
    public ProductClass() {

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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getMore() {
        return more;
    }

    public void setMore(String more) {
        this.more = more;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductClass that = (ProductClass) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "ProductClass{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", more='" + more + '\'' +
                '}';
    }
}
