package ss16_IO_Binary_File.bai_tap.model;

import java.io.Serializable;

public class Product implements Serializable,Comparable<Product> {
    private int id;
    private String name;
    private String producer;
    private double price;
    private String other;

    public Product(int id, String name, String producer, double price, String other) {
        this.id = id;
        this.name = name;
        this.producer = producer;
        this.price = price;
        this.other = other;
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

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", producer='" + producer + '\'' +
                ", price=" + price +
                ", other='" + other + '\'' +
                '}';
    }

    @Override
    public int compareTo(Product o) {
        return this.getId()-o.getId();
    }
}
