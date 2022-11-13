package com.example.demo.delivery;

import com.example.demo.item.Item;

import java.util.List;

public class DHLDDeliveryStrategy implements Delivery {
    @Override
    public String deliver(List<Item> items) {
        return "Delivered used DHLD"+items;
    }
}

