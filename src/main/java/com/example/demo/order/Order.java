package com.example.demo.order;

import com.example.demo.delivery.DHLDDeliveryStrategy;
import com.example.demo.delivery.Delivery;
import com.example.demo.item.Item;
import com.example.demo.payment.Payment;
import com.example.demo.store.Flower;
import com.example.demo.store.FlowerColor;
import com.example.demo.store.FlowerType;
import lombok.Getter;
import lombok.Setter;

import java.util.LinkedList;
@Getter@Setter
public class Order {
    LinkedList<Item> items = new LinkedList<Item>();
    Payment payment;
    Delivery delivery;

    public void SetPaymentStrategy(Payment pay){
        this.payment = pay;
    }

    public void SetDeliveryStrategy(Delivery del){
        this.delivery = del;
    }
    public double CalculateTotalPrice(){
        double price = 0;
        for (Item item: items) {
            System.out.println(item.getPrice());
            price += item.getPrice();
        }
        return price;
    }
    public void ProcessOrder(){
        System.out.println("Your order: {"+this.items.toString()+"}");
        System.out.println("Total price: "+this.CalculateTotalPrice());

    }

    public void addItem(Item item){
        this.items.add(item);
    }
    public void removeFlower(Item item){
        this.items.remove(item);
    }



}
