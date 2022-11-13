package com.example.demo.decorator;

import com.example.demo.item.Item;

public class BucketDecorator implements ItemDecorator{

    @Override
    public double decorate(Item item) {
        return 4+item.getPrice();
    }
}
