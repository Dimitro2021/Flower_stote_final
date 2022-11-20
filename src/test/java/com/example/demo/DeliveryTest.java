package com.example.demo;

import com.example.demo.decorator.PaperDecorator;
import com.example.demo.decorator.RibbonDecorator;
import com.example.demo.delivery.DHLDDeliveryStrategy;
import com.example.demo.delivery.Delivery;
import com.example.demo.order.Order;
import com.example.demo.store.Flower;
import com.example.demo.store.FlowerColor;
import com.example.demo.store.FlowerType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.Test;

public class DeliveryTest {
    private Order order;
    private DHLDDeliveryStrategy delivery;
    private Flower rose;
    private Flower tulip;
    @BeforeEach
    public void init(){
        rose = new Flower(2.0, FlowerColor.RED, 3.4, FlowerType.ROSE);
        tulip = new Flower(3.0, FlowerColor.BLUE, 4.9, FlowerType.TULIP);
        delivery = new DHLDDeliveryStrategy();
        order = new Order();
        order.addItem(rose);
        order.addItem(tulip);

    }

    @Test
    public void testOrder(){
        Assertions.assertEquals(rose.getPrice()+tulip.getPrice(), order.CalculateTotalPrice());
    }
    @Test
    public void testDelivery(){
        order.setDelivery(delivery);
        Assertions.assertEquals(delivery, order.getDelivery());
    }
}
