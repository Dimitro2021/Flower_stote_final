package com.example.demo.delivery;

import com.example.demo.item.Item;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
public class DHLDDeliveryStrategy implements Delivery {
    @Override
    public String deliver(List<Item> items) {
        return "Delivered used DHLD"+items;
    }
}

