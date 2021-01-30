package com.pinodev.oop.bank;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(123,1000,"Smith","email",34334);

        bankAccount.printInfo();
        bankAccount.depositFunds(100);
        bankAccount.printInfo();
        bankAccount.withdrawFunds(20);
        bankAccount.printInfo();
    }
}
