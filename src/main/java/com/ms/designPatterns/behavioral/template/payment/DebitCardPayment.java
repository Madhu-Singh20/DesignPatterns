package com.ms.designPatterns.behavioral.template.payment;

public class DebitCardPayment extends PaymentProcessor{

    @Override
    protected void debitAmount() {
        System.out.println("Debiting amount from Debit Card...");
    }

}
