package org.lessons.java.snacks;

import java.math.BigDecimal;
import java.math.RoundingMode;

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

        // * Class Instances
        ContoBancario BankAccount01 = new ContoBancario();
        BigDecimal deposit = new BigDecimal("200.20").setScale(2, RoundingMode.HALF_UP);
        BigDecimal withdrawal = new BigDecimal("75.10").setScale(2, RoundingMode.HALF_UP);

        // * Methods
        System.out.println(BankAccount01.getAccountNumber() + " | " + BankAccount01.getBalance());
        BankAccount01.setDeposit(deposit);
        System.out.println(BankAccount01.getAccountNumber() + " | " + BankAccount01.getBalance());
        BankAccount01.setWithdrawal(withdrawal);
        System.out.println(BankAccount01.getAccountNumber() + " | " + BankAccount01.getBalance());

        // ! SNACK 3
    }
}
