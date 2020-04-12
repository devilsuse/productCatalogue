package com.sapient.productcatalogue.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sapient.productcatalogue.model.Seller;
import com.sapient.productcatalogue.service.SellerService;

@RestController
@RequestMapping("/catalogue/api/v1/")
public class SellerController
{
	@Autowired
	private SellerService sellerService;
	
	@GetMapping("/sellers")
	public List<Seller> getAll()
	{
		return sellerService.getAll();
	}
	
	/*
	 * @PostMapping("/seller/add") public List<Seller> add() { return
	 * sellerService.add(); }
	 */
	
}
