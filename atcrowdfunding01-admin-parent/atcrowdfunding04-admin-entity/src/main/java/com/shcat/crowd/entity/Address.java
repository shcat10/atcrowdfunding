package com.shcat.crowd.entity;

/**
 * @author shcat
 * @description
 * @create 2022.11.3 11:01:57
 */
public class Address {

    private String province;
    private String city;
    private String street;

    public Address() {
    }
    public Address(String province, String city, String street) {
        this.province = province;
        this.city = city;
        this.street = street;
    }
    public String getProvince() { return province; }

    public String getCity() { return city; }

    public String getStreet() { return street; }

    public void setProvince(String province) { this.province = province; }

    public void setCity(String city) { this.city = city; }

    public void setStreet(String street) { this.street = street; }

    @Override
    public String toString() {
        return "Address{" +
                "province='" + province + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                '}';
    }
}
