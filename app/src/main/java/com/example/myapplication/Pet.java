package com.example.myapplication;

public class Pet {

    //create properties
    public int mAge;
    public double mWeight;
    public boolean isCat;

    //a constructor to create the instance of the object
    public Pet(int age, double weight, boolean isCat) {
        this.mAge = age;
        this.mWeight = weight;
        this.isCat = isCat;
    }

    //a second contructor
    public Pet() {}
}
