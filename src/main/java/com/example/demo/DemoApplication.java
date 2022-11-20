//package com.example.demo;
//
//import com.example.demo.store.Flower;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.List;
//
//
//@SpringBootApplication
//public class DemoApplication {
//
//	public static void main(String[] args) {
//		SpringApplication.run(DemoApplication.class, args);
//	}
//
////	@GetMapping
////	public List<Flower> hello(){
////		return List.of(
////				new Rose(1,  FlowerColor.RED, 5.0)
////		);
////	}
//
//	@RestController
//	@RequestMapping(path = "api/v1/new")
//	public static class NewController {
//
//		private final FlowerService flowerService;
//
//		@Autowired
//		public NewController(FlowerService flowerService) {
//			this.flowerService = flowerService;
//		}
//
//
//		@GetMapping
//		public List<Flower> getNew(){return flowerService.getFlowers();}
//	}
//}
