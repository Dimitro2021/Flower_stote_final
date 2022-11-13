package com.example.demo.payment;



public interface Payment {
    double fee();
    int getType();


    boolean pay(double price);
}
