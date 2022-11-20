package com.example.demo;

import com.example.demo.decorator.PaperDecorator;
import com.example.demo.decorator.RibbonDecorator;
import com.example.demo.store.Flower;
import com.example.demo.store.FlowerColor;
import com.example.demo.store.FlowerType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DecoratorTest {
    private Flower rose;
    private PaperDecorator paper;
    private RibbonDecorator ribbon;
    @BeforeEach
    public void init(){
        rose = new Flower(2.0, FlowerColor.RED, 3.4, FlowerType.ROSE);
        paper = new PaperDecorator();
        ribbon = new RibbonDecorator();
    }

    @Test
    public void testRibbonDecorator(){
        double orderPrice = ribbon.decorate(rose);
        Assertions.assertEquals(orderPrice, ribbon.decorate(rose));
    }
    @Test
    public void testPaperDecorator(){
        double orderPrice = paper.decorate(rose);
        Assertions.assertEquals(orderPrice, paper.decorate(rose));
    }
}
