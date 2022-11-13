package com.example.demo.decorator;

import com.example.demo.item.Item;

public class PaperDecorator implements ItemDecorator{
    @Override
    public double decorate(Item item) {
        return item.getPrice() + 13;
    }
}
