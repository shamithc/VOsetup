package com.jocata.MPdemo.vo.investoronboarding.common;

import java.util.StringJoiner;

public class Address {
    private String country;
    private String city;
    private String street;
    private String postalCode;
    private String type;

    public Address() {
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Address.class.getSimpleName() + "[", "]")
                .add("country='" + country + "'")
                .add("city='" + city + "'")
                .add("street='" + street + "'")
                .add("postalCode='" + postalCode + "'")
                .add("type='" + type + "'")
                .toString();
    }
}