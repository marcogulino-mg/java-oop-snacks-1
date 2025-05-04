package org.lessons.java.snacks;

public class Main {
    public static void main(String[] args) {

        // ! SNACK 1

        // * Class Instances
        Studente EmptyStudente = new Studente();
        Studente Student01 = new Studente("Marco", "Gulino", (byte) 26);

        // * Methods
        System.out.println(EmptyStudente.concatData());
        System.out.println(Student01.concatData());

        // ! SNACK 2

    }
}
