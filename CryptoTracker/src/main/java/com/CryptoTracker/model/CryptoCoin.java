package com.CryptoTracker.model;

public class CryptoCoin {

    private String id;
    private String name;
    private double price;
    private double change24H;

    public CryptoCoin() {
    }

    public CryptoCoin(String id, String name, double price, double change24H) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.change24H = change24H;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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

    public double getChange24H() {
        return change24H;
    }

    public void setChange24H(double change24H) {
        this.change24H = change24H;
    }
}
