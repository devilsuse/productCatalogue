package com.sapient.productcatalogue.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sapient.productcatalogue.dto.ResponseAPI;
import com.sapient.productcatalogue.model.Seller;
import com.sapient.productcatalogue.service.AppUtils;
import com.sapient.productcatalogue.service.SellerService;

@RestController
@RequestMapping("/catalogue/api/v1/")
public class SellerController
{
	@Autowired
	private SellerService sellerService;

	@GetMapping("/sellers")
	public ResponseEntity<?> getAll()
	{
		ResponseAPI responseAPI = new ResponseAPI();
		List<Seller> sellers = null;
		try
		{
			sellers =  sellerService.getAll();
		}
		catch(Throwable throwable)
		{
			return AppUtils.toResponseEntity(throwable);
		}
		responseAPI.setSellers(sellers);
		return AppUtils.toResponseEntity(responseAPI);
	}

	@PostMapping("/seller/add")
	public List<Seller> add()
	{
		return null;// sellerService.add();
	}

	// Seller getById(int sellerId);
	@PutMapping
	@PostMapping
	public String update(int sellerId, String sellerName)
	{
		return null;
	}

	//@DeleteMapping
	/*public String remove(int sellerId)
	{
		
	}*/
}
