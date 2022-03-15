package com.tutorial;

class HeroMana extends Hero{
    Double mana;

    // Overriding methods
    void display() {
        System.out.println("==============");
        System.out.println("Nama Hero : " + this.name);
        System.out.println("Hero Mana : " + this.mana);
    }
}
