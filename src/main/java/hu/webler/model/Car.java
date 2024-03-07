package hu.webler.model;

// // Car osztály, amely egy járművet reprezentál
public class Car {

    // Adattagok (Fields) - maguk a tulajdonságaik
    private String brand; // autó márkája
    private int speed; // autó sebessége
    private double fuel; // üzemanyagszint

    // ha van paraméteres konstruktor a default üres megszűnik létezni, nekünk kell manuálisan létrehozni!
    public Car() {

    }

    // Konstruktor
    public Car(String brand) {
        this.brand = brand;
        this.speed = 0;
        this.fuel = 100.0;
    }

    // Metódusok
    // Gyorsítás metódus
    public int accelerate(int amount) {
        this.speed += amount;
        return this.speed;
    }

    // Üzemanyag fogyasztás metódus
    public double consumeFuel(double amount) {
        this.fuel -= amount;
        return this.fuel;
    }

    public double refillGasoline(double amount) {
        this.fuel += amount;
        return this.fuel;
    }

    // Getter metódus az adattagok elérése
    public String getBrand() {
        return brand;
    }

    public int getSpeed() {
        return speed;
    }

    public double getFuel() {
        return fuel;
    }

    // Setter metódus az adattagok beálltása (érték hozzárendelése)
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand: " + this.brand +
                ", speed: " + this.speed +
                ", fuel: " + this.fuel + "}";
    }
}