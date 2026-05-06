package com.example.practice.resttemplate.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/inventory")
public class InventoryController {

	@GetMapping("/{productID}")
	public String checkInventory(@PathVariable(name = "productID") String productID) {
		System.out.println("Inventory Service Invoked And ProductID: "+productID);
		return "1".equals(productID) ? "InStock" : "Out Of Stock";
	}
}
