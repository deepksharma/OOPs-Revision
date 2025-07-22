package com.Self;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        UpiPaymentService upiPaymentService = new UpiPaymentService();
//        upiPaymentService.makePayment(500);

        PaymentService ps = new CardPaymentService();
        ps.makePayment(1000);

        CardPaymentService cardPaymentService = new CardPaymentService();
        cardPaymentService.cash(1000);
    }
}