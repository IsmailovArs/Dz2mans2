package com.company;

public class BankAccount {
    private double amount;

    public BankAccount(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public boolean deposit(double sum){
       if ( sum<=0)return false;
       amount += sum;
       return true;
    }
    public void withDraw(int sum) {
        if (sum<=amount && sum > 0)
        {amount -= sum;}
        else if (sum >= amount) {
            try {
                throw new LimitException("Сумма больше чем остаток", amount);
            } catch (LimitException e) {
                System.out.println("Вам не хватает" + e.getRemainingAmount(sum, amount) + "Ведите другую сумму");
            }

        }
    }
    public String printInfo() {
        return ("Остаток на счету" + getAmount());
    }
}

