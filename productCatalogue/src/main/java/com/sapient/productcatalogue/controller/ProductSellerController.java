package com.sapient.productcatalogue.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sapient.productcatalogue.constant.AppConstant;
import com.sapient.productcatalogue.dto.ResponseAPI;
import com.sapient.productcatalogue.model.ProductSeller;
import com.sapient.productcatalogue.model.Seller;
import com.sapient.productcatalogue.service.AppUtils;
import com.sapient.productcatalogue.service.ProductSellerService;
import com.sapient.productcatalogue.service.SellerService;

@RestController
@RequestMapping("/catalogue/api/v1/")
public class ProductSellerController
{
	@Autowired
	private ProductSellerService productSellerService;
	
	private final static Logger APP_LOGGER = LoggerFactory.getLogger(ProductSellerController.class);

	@GetMapping("/product_sellers")
	public ResponseEntity<?> getAll()
	{
		ResponseAPI responseAPI = new ResponseAPI();
		List<ProductSeller> productSellers = null;
		try
		{
			productSellers =  productSellerService.getAllProductSellers();
		}
		catch(Throwable throwable)
		{
			APP_LOGGER.error(AppConstant.EXC_GET_ALL_SELLERS, throwable);
			return AppUtils.toResponseEntity(throwable);
		}
		responseAPI.setProductSellers(productSellers);
		return AppUtils.toResponseEntity(responseAPI);
	}

	@PostMapping("/seller/add")
	public ResponseEntity<?> add(@RequestBody Seller seller)
	{
		ResponseAPI responseAPI = new ResponseAPI();
		try
		{
			sellerService.add(seller);
		}
		catch(Throwable throwable)
		{
			APP_LOGGER.error("Exception while adding seller: " + seller, throwable);
			return AppUtils.toResponseEntity(throwable);
		}
		responseAPI.setMessage(AppConstant.ADD_SELLERS_SUCCESS);
		return AppUtils.toResponseEntity(responseAPI);
	}

	// Seller getById(int sellerId);
	@PutMapping
	@PostMapping
	public ResponseEntity<?> update(String gstId, String sellerName)
	{
		ResponseAPI responseAPI = new ResponseAPI();
		try
		{
			sellerService.update(gstId, sellerName);
		}
		catch(Throwable throwable)
		{
			APP_LOGGER.error("Exception while updating seller with gstId: " + gstId + " and sellerName:" 
									+ sellerName, throwable);
			return AppUtils.toResponseEntity(throwable);
		}
		responseAPI.setMessage(AppConstant.UPDATE_SELLER_SUCCESS);
		return AppUtils.toResponseEntity(responseAPI);
	}

	@DeleteMapping("/seller/{gstId}")
	public ResponseEntity<?> remove(@PathVariable String gstId)
	{
		ResponseAPI responseAPI = new ResponseAPI();
		try
		{
			sellerService.remove(gstId);
		}
		catch(Throwable throwable)
		{
			APP_LOGGER.error("Exception while deleting seller with gstId: " + gstId, throwable);
			return AppUtils.toResponseEntity(throwable);
		}
		responseAPI.setMessage(AppConstant.DELETE_SELLER_SUCCESS);
		return AppUtils.toResponseEntity(responseAPI);
	}

}
