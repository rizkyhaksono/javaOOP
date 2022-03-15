package com.tutorial;

// Inheritance adalah mekanisme untuk mengakses ke parent class melalui child class

public class Main {
    public static void main(String[] args) {
        // Create a new object of HeroStrength class
        // Hero hero1 = new Hero();
        // hero1.name = ("Naruto");
        // hero1.display();

        // HeroStrength hero2 = new HeroStrength();
        // hero2.name = ("Kakashi");
        // hero2.defensePower = 100.0;
        // hero2.display();

        // HeroMana hero3 = new HeroMana();
        // hero3.name = ("Saitama");
        // hero3.mana = 100.0;
        // hero3.display();

        Hero heroClass = new Hero();
        HeroStrength heroStrength = new HeroStrength();
        
        heroClass.display();
        heroStrength.display();
        heroStrength.displaySuper();
    }
}
