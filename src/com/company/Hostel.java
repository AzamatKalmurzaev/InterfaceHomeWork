package com.company;

import java.util.Arrays;

public class Hostel implements Pay {

    private String adress;
    private Family [] family;



    @Override
    public void pay() {
        System.out.println("Arenda toloyt");
    }

    public Hostel(String adress, Family[] family) {
        this.adress = adress;
        this.family = family;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public Family[] getFamily() {
        return family;
    }

    public void setFamily(Family[] family) {
        this.family = family;
    }

    @Override
    public String toString() {
        return "Hostel" +
                "adress" + adress+
                " family" + Arrays.toString(family);
    }
}
