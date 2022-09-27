package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(0);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Пополнить счет");
        double summa = scanner.nextDouble();
        bankAccount.deposit(summa);

        while (true) {
            System.out.println(bankAccount.printInfo());
            System.out.println("Хотите снять наличные");
            int summa1 = scanner.nextInt();
            if (bankAccount.getAmount() > 0) {
                bankAccount.withDraw(summa1);
            }
            if (bankAccount.getAmount() <= 0.0) {
                System.out.println(bankAccount.printInfo());
                System.out.println("На счету нет средств прощайте");
                break;
            }

        }
    }


    }


