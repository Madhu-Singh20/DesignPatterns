package com.ms.designPatterns.behavioral.template.payment;

class CreditCardPayment extends PaymentProcessor {

    @Override
    protected void debitAmount() {
        System.out.println("Debiting amount from Credit Card...");
    }

}

