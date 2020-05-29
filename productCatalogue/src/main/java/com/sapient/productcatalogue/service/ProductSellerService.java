package com.sapient.productcatalogue.service;

import java.util.List;

import com.sapient.productcatalogue.model.ProductSeller;

public interface ProductSellerService
{
	List<ProductSeller> getAllProductSellers();
	List<ProductSeller> getAllSellersByProductId();
	List<ProductSeller> getAllProductsBySellerId();
}
