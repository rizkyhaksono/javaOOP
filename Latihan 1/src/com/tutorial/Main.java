package com.tutorial;

// Player
class Player{
  String name;
  double health;
  int level;

  // Object constructor member
  Weapon weapon;
  Armor armor;

  Player(String name, double health){
    this.name = name;
    this.health = health;
  }

  void attack(Player opponent){
    // Mengambil stats nama dan weapon dari player
    double attackPower = this.weapon.attackPower;
    System.out.println(this.name + " attacks " + opponent.name + " with " + attackPower);
    
    opponent.defense(attackPower);
  }

  void defense(double attackPower){
    // HP dikurangi dengan damage yang diterima
    double damage;
    if (this.armor.defensePower < attackPower) {
      damage = attackPower - this.armor.defensePower;
    } else {
      damage = 0;
    }
    
    this.health -= damage;
    System.out.println(this.name + " is defending " + attackPower + " damages");
  }

  void equipWeapon(Weapon weapon){
    this.weapon = weapon;
  }

  void equipArmor(Armor armor){
    this.armor = armor;
  }

  void display(){
    System.out.println("Name\t: " + this.name);
    System.out.println("Health\t: " + this.health);
    this.weapon.display();
    this.armor.display();
  }
}

// Senjata
class Weapon{
  double attackPower;
  String name;

  Weapon(String name, double attackPower){
    this.name = name;
    this.attackPower = attackPower;
  }

  void display(){
    System.out.println("Weapon  : " + this.name + " , Attack Power : " + this.attackPower);
  }
}

// Armor
class Armor{
  double defensePower;
  String name;

  Armor(String name, double defensePower){
    this.name = name;
    this.defensePower = defensePower;
  }

  void display(){
    System.out.println("Armor   : " + this.name + " , Defense Power : " + this.defensePower);
  }
}

public class Main{
  public static void main (String[] args) throws Exception {
    
    // Membuat object player
    Player player1 = new Player("Rizky Haksono", 100);
    Player player2 = new Player("Natee", 50);

    // Membuat object senjata
    Weapon weapon1 = new Weapon("Sword", 200);
    Weapon weapon2 = new Weapon("Catalyst", 150);

    // Membuat object armor
    Armor armor1 = new Armor("Diamond Armor", 1000);
    Armor armor2 = new Armor("Leather Armor", 100);

    // Equip senjata dan armor player 1
    player1.equipWeapon(weapon1);
    player1.equipArmor(armor1);
    player1.display();

    // Equip senjata dan armor player 2
    System.out.print("\n");
    player2.equipWeapon(weapon2);
    player2.equipArmor(armor2);
    player2.display();

    System.out.println("\nPertempurann!!");
    System.out.println("\nBattle - 1");
    player1.attack(player2);
    
    // Show data battle 1
    System.out.print("\n");
    player1.display();

    System.out.print("\n");
    player2.display();
    
    System.out.println("\nBattle - 2");
    player2.attack(player1);
    
    // Show data battle 2
    System.out.print("\n");
    player1.display();

    System.out.print("\n");
    player2.display();
  }
}
