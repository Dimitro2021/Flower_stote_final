package com.example.demo.item;

import lombok.Getter;
import lombok.Setter;

@Getter@Setter
public abstract class Item {
    private String description;
    private double price = 0;


}
