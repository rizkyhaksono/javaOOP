package com.tutorial;

// this.name akan dieksekusi child class yang ada disini
// jika tidak ada, maka akan mencari ke parent class / super class

// super.name akan mengakses atribut parent class / super class

class HeroStrength extends Hero{
    Double defensePower;
    String name = "Class Hero Strength";

    // Overriding methods
    void display(){
        System.out.println("Ini adalah : " + this.name);
        // System.out.println("Nama Hero : " + this.name);
        // System.out.println("Defense Power : " + this.defensePower);
    }

    void displaySuper(){
        System.out.println("Ini adalah : " + super.name);
    }
}
