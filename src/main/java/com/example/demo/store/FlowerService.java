package com.example.demo.store;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class FlowerService {
    public List<Flower> getFlowers(){
        return List.of(
                new Flower(1,
                        FlowerColor.RED,
                        5.0,
                        FlowerType.ROSE)
        );
    }
}
