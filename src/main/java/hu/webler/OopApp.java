package hu.webler;

import hu.webler.model.Car;

public class OopApp {

    /*
    Az osztály példányosítása az osztály egy konkrét objektumának létrehozását jelenti a programban. Az osztály egy sablon
    vagy útmutató az objektum létrehozásához, és az osztály példányosításával valójában egy új objektumot hozunk létre
    az adott osztály szerint.
    Az osztály példányosítása során a new kulcsszó segítségével hozunk létre egy új objektumot az adott osztály alapján.
    A konstruktor pedig az objektum inicializálásáért felelős, és a példányosítás során fut le.
    Konstruktor lehet üres, vagy paraméteres!
    Ha van paraméteres, akkor a default (alapértelmezett üres konstruktor nincs -> ha szükséges, létre kell hozni!)
    */

    public static void main(String[] args) {

        // Osztály példányositása!
        Car car = new Car();
        System.out.println(car); // amig nem volt toString -> hu.webler.model.Car@5b480cf9
        Car opel = new Car("Opel");
        System.out.println(opel); // amig nem volt toString -> hu.webler.model.Car@6f496d9f

        String brand = opel.getBrand();
        System.out.println(brand);
        String newBrand = "BMW";
        opel.setBrand(newBrand);
        System.out.println(opel);
        opel.setSpeed(160);
        System.out.println(opel);
        opel.setSpeed(0);
        System.out.println(opel);
        int increasedSpeed = opel.accelerate(123);
        System.out.println("Gyorsulás! A sebesség: " + increasedSpeed);
        System.out.println(opel);
        System.out.println("Elindultunk kirándulni, megtettünk x km-et. Benzin fogy!!!");
        double amount = 50;
        double decreaseFuel = opel.consumeFuel(amount);
        System.out.println("Elfogyott benzin mértéke: " + amount + "maradék benzin: " + decreaseFuel);
        System.out.println(opel);
        System.out.println(car);
        amount = 22.5;
        double increaseCarFuel = car.refillGasoline(amount);
        System.out.println("Töltöttünk benzint a car példányba ennyi litert: " + amount + " és a tank itt áll: " + increaseCarFuel);
        amount = 11.32;
        double increaseOpelFuel = opel.refillGasoline(amount);
        System.out.println("Töltöttünk benzint a BMW tipusu Opelünkbe :) mennyisége: " + amount + " és a tank itt áll: " + increaseOpelFuel);
        System.out.println(car);
        System.out.println(opel);
    }

    /*
    Az objektumorientált programozásban (OOP) az osztályok az objektumok sablonjai vagy formális leírásai. Az osztályok
    meghatározzák az objektumok tulajdonságait (állapotát) és viselkedését (metódusokat).

    Az osztályoknak két fő összetevőjük van:

    1. Állapot (State) vagy Tulajdonságok (Properties):
    Ez az osztály által tartalmazott adatokat vagy adattagokat jelenti. Ezek az adatok meghatározzák az objektum aktuális
    állapotát vagy tulajdonságait. Például egy autó osztály esetében az állapotot a márka, sebesség, üzemanyagszint stb.
    jelentik.

    2. Viselkedés (Behavior) vagy Metódusok (Methods):
    Ezek az osztályban definiált függvények vagy műveletek, amelyeket az osztályban létrehozott objektumok végrehajtanak.
    Ezek a metódusok az osztály adattagjain dolgoznak, és manipulálják azokat. Például egy autó osztályban a gyorsítás,
    fékezés, üzemanyag-fogyasztás stb. lehetnek metódusok.

    Az osztályok definíciói alapján a programozók létrehozhatnak objektumokat, amelyek az adott osztály sablonjai szerint
    működnek. Az objektumok az osztályok példányai, és az osztályokban meghatározott tulajdonságok és metódusok révén
    képesek tárolni az állapotukat és végrehajtani a viselkedésüket.

    Az osztályok tulajdonképpen az objektumorientált programozás alapvető építőkövei, és segítségükkel a programozók képesek
    absztrakt módon modellezni a valós világot és strukturálni a programjukat úgy, hogy az könnyen érthető és karbantartható
    legyen.
    */
}
