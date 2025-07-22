package com.Self;

public class UpiPaymentService implements PaymentService{
    @Override
    public void makePayment(double amount) {
        System.out.println(" Paid "+ amount+ " via UPI ");
    }
}
