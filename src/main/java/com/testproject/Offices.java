package com.testproject;

public class Offices {
    private String officecode, city, hone, addressline1,addressline2, stae, country, postalcode, territory;

    public Offices(String officecode, String city, String hone, String addressline1, String addressline2, String stae,
                   String country, String postalcode, String territory) {
        this.officecode = officecode;
        this.city = city;
        this.hone = hone;
        this.addressline1 = addressline1;
        this.addressline2 = addressline2;
        this.stae = stae;
        this.country = country;
        this.postalcode = postalcode;
        this.territory = territory;
    }

    public String getOfficecode() {
        return officecode;
    }

    public String getCity() {
        return city;
    }

    public String getHone() {
        return hone;
    }

    public String getAddressline1() {
        return addressline1;
    }

    public String getAddressline2() {
        return addressline2;
    }

    public String getStae() {
        return stae;
    }

    public String getCountry() {
        return country;
    }

    public String getPostalcode() {
        return postalcode;
    }

    public String getTerritory() {
        return territory;
    }
}
