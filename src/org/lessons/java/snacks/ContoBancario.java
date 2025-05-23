package org.lessons.java.snacks;

import java.math.BigDecimal;
import java.util.Random;

public class ContoBancario {

    // * Attributes
    private String accountNumber;
    private BigDecimal balance;

    // * Methods

    // * Constructors
    public ContoBancario() {
        accountNumber = generateAccNum();
        balance = new BigDecimal(0);
    }

    // * Others
    private String randomNumbers() {
        Random r = new Random();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 22; i++) {
            int numbers = r.nextInt(10); // genera cifra tra 0 e 9
            sb.append(numbers);
        }

        return sb.toString();

    }

    private String generateAccNum() {
        return "IT" + 60 + "A" + randomNumbers();
    }

    // * Getters
    public String getAccountNumber() {
        return accountNumber;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    // * Setters
    public void setDeposit(BigDecimal deposit) {
        if (deposit.compareTo(new BigDecimal(0)) == 1) {
            this.balance = this.balance.add(deposit);
        }
    }

    public void setWithdrawal(BigDecimal withdrawal) {
        if (withdrawal.compareTo(new BigDecimal(0)) == 1 && this.balance.compareTo(withdrawal) == 1) {
            this.balance = this.balance.subtract(withdrawal);
        }
    }

}
