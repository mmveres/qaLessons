package ua.epam.qa.entity;

import java.io.Serializable;

public class Address implements Serializable {
    private String city;
    private int number;

    public Address(String city, int number) {
        this.city = city;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", number=" + number +
                '}';
    }
}
