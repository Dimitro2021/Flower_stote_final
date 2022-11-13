package com.example.demo.payment;

public class PayPalPayment implements Payment{
    @Override
    public double fee() {
        return 0.1;
    }

    @Override
    public int getType() {
        return 1;
    }

    @Override
    public boolean pay(double price) {
        double balance = price*2;
        price *= this.fee();
        if (price<=balance){
            balance = balance-price;
            return true;
        }
        return false;
    }
}
