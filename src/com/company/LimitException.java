package com.company;

public class LimitException extends Exception {

    public LimitException(String message, double remainingAccount) {
        super(message + remainingAccount);
    }

    public double getRemainingAmount(int sum, double amount) {
        return sum - amount;
    }


}

