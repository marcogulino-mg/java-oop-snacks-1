package org.lessons.java.snacks;

public class Studente {

    // * Attributes
    public String name;
    public String surname;
    public byte age;

    // * Methods

    // * Constructors
    public Studente() {
        this.name = "Missing name";
        this.surname = "Missing surname";
        this.age = 0;
    }

    public Studente(String name, String surname, byte age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    // * Others
    public String concatData() {
        return this.name + " " + this.surname + ", " + this.age;
    }
}
