package com.example.demo.controllers;


import com.example.demo.FlowerService;
import com.example.demo.store.Flower;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/flower")
public class FLowerController {

	private final FlowerService flowerService;

	@Autowired
	public FLowerController(FlowerService flowerService) {
		this.flowerService = flowerService;
	}


    @GetMapping
	public List<Flower> getFlowers(){
		return flowerService.getFlowers();
	}
}
