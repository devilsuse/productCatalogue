package com.sapient.productcatalogue.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sapient.productcatalogue.dao.SellerDao;
import com.sapient.productcatalogue.model.Seller;

@Service
public class SellerServiceImpl implements SellerService
{
	@Autowired
	private SellerDao sellerDao;

	@Override
	public int add(Seller seller)
	{
		return sellerDao.add(seller);
	}

	@Override
	public int update(int sellerId, String sellerName)
	{
		return sellerDao.update(sellerId, sellerName);
	}

	@Override
	public int remove(int sellerId)
	{
		return sellerDao.remove(sellerId);
	}

	@Override
	public Seller getById(int sellerId)
	{
		return sellerDao.getById(sellerId);
	}

	@Override
	public List<Seller> getAll()
	{
		return sellerDao.getAll();
	}
}
