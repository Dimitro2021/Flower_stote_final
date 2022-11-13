package com.example.demo.payment;

public class CreditCartPayment implements Payment{
    @Override
    public double fee() {
        return 0.2;
    }

    @Override
    public int getType() {
        return 0;
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
