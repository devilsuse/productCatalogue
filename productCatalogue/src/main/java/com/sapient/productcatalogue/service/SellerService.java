package com.sapient.productcatalogue.service;

import java.util.List;

import com.sapient.productcatalogue.model.Seller;

public interface SellerService
{
	Seller getById(int sellerId);

	List<Seller> getAll();

	int add(Seller seller);

	int update(int sellerId, String sellerName);

	int remove(int sellerId);
}
