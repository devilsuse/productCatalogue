package com.sapient.productcatalogue.service;

import java.util.List;

import com.sapient.productcatalogue.model.Seller;

public interface SellerService
{
	int add(Seller seller);
	Seller getById(int sellerId);
	List<Seller> getAll();
	int update(int sellerId, String sellerName);
	int remove(int sellerId);
}
