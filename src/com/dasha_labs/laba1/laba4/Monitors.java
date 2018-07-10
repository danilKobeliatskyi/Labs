package com.dasha_labs.laba1.laba4;

public class Monitors {
    private String type;
    private String name;
    private String quality;
    private int size;
    private Country country;
    private Price price;

    public Monitors(String type, String name, String quality, int size, Price price, Country country){
        this.type = type;
        this.name = name;
        this.quality = quality;
        this.size = size;
        this.price = price;
        this.country = country;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int  size) {
        this.size = size;
    }

    public int getPrice() {
        return price.getPrice();
    }

    public void setPrice(Price price) {
        this.price = price;
    }

    public String getCountry() {
        return country.getCountry();
    }

    public void setCountry(Country country) {
        this.country = country;
    }
}
