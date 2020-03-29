package com.sapient.productcatalogue.dao;

import java.util.List;

import com.sapient.productcatalogue.model.Seller;

public interface SellerDao
{
	int add(Seller seller);
	Seller getById(int sellerId);
	List<Seller> getAll();
	int update(int sellerId, String sellerName);
	int remove(int sellerId);
}
