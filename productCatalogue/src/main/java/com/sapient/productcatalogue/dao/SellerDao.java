package com.sapient.productcatalogue.dao;

import java.util.List;

import com.sapient.productcatalogue.model.Seller;

public interface SellerDao
{
	Seller getByGstId(String gstId);

	List<Seller> getAll();

	int add(Seller seller);

	int update(String gstId, String sellerName);

	int remove(String gstId);
}
