package com.example.demo.decorator;

import com.example.demo.item.Item;

public class RibbonDecorator implements ItemDecorator{
    @Override
    public double decorate(Item item) {
        return 40 + item.getPrice();
    }
}
