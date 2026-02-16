package com.ms.designPatterns.behavioral.template.payment;

abstract class PaymentProcessor {

    // Template method (final to prevent override)
    public final void processPayment() {
        validatePayment();
        debitAmount();
        sendReceipt();
    }

    private void validatePayment() {
        System.out.println("Validating payment details...");
    }

    protected abstract void debitAmount();

    private void sendReceipt() {
        System.out.println("Sending receipt...");
    }

}
