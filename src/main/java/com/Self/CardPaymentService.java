package com.Self;

public class CardPaymentService implements PaymentService{
    @Override
    public void makePayment(double amount) {
        System.out.println(" paid "+amount+" via Card ");
    }
    public void cash(int Rupees){
        System.out.println(" paid "+ Rupees + " via Cash ");
    }
}
