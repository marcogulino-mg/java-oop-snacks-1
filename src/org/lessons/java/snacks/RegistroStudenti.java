package org.lessons.java.snacks;

public class RegistroStudenti {
    // * Attributes
    private Studente[] students;

    // * Methods

    // * Constructors
    public RegistroStudenti() {
        this.students = new Studente[0];
    }

    // * Setters
    public void setStudents(Studente studente) {
        // New Students list with one extra space
        Studente[] studentsUpdated = new Studente[this.students.length + 1];

        // Clone students list elements in students list updated
        for (int i = 0; i < students.length; i++) {
            studentsUpdated[i] = this.students[i];
        }

        // Add new student in the last index of studentsUpdated
        studentsUpdated[studentsUpdated.length - 1] = studente;

        // Overwrite the old student list with the new one
        this.students = studentsUpdated;
    }

    // * Getters
    public Studente[] getStudents() {
        return this.students;
    }

}
