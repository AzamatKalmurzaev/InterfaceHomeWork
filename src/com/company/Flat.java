package com.company;

import java.util.Arrays;

public class Flat implements Pay  {


    private String Adress;
    private Family [] family;

    public Flat(String adress, Family[] family) {
        this.Adress = adress;
        this.family = family;
    }

    @Override
    public void pay() {
        System.out.println("Kom usluga toloyt");
    }

    public String getAdress() {
        return Adress;
    }

    public void setAdress(String adress) {
        this.Adress = adress;
    }

    public Family[] getFamily() {
        return family;
    }

    public void setFamily(Family[] family) {
        this.family = family;
    }

    @Override
    public String toString() {
        return " adress " + Adress  ;
    }
}
