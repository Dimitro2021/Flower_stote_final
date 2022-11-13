package com.example.demo.store;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//import javax.persistence.*;


@Setter @AllArgsConstructor @NoArgsConstructor
public class Flower {
//    @Id
//    @SequenceGenerator(
//            name = "flower_sequence",
//            sequenceName = "flower_sequnce",
//            allocationSize = 1)
//    @GeneratedValue(
//            strategy = GenerationType.SEQUENCE,
//            generator = "flower_sequnce"
//    )
    @Getter
    private double sepalLength;
    private FlowerColor color;
    @Getter
    private double price;
    @Getter
    private FlowerType flowerType;
    public String getColor() {
        return color.toString();
    }
}
