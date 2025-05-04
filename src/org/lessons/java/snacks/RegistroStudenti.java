package org.lessons.java.snacks;

public class RegistroStudenti {
    // * Attributes
    private Studente[] students;

    // * Methods

    // * Constructors
    public RegistroStudenti() {
        this.students = new Studente[40];
    }

    // * Setters
    public void setStudents(Studente studente) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                students[i] = studente;
                break;
            }
        }
    }

    // * Getters
    public Studente[] getStudents() {
        return students;
    }

}
