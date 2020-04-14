package com.sapient.productcatalogue.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.support.TransactionTemplate;

import com.sapient.productcatalogue.constant.AppConstant;
import com.sapient.productcatalogue.dao.SellerDao;
import com.sapient.productcatalogue.exception.CatalogueExceptionFactory;
import com.sapient.productcatalogue.model.Seller;

@Service
public class SellerServiceImpl implements SellerService
{
	@Autowired
	private SellerDao sellerDao;

	//private final TransactionTemplate transactionTemplate;
	@Override
	public int add(Seller seller)
	{
		try
		{
			return sellerDao.add(seller);
		}
		catch(Exception e)
		{
			throw CatalogueExceptionFactory.sellerOperationFailed(AppConstant.ADD_SELLER_FAILED_CODE, 
					AppConstant.ADD, AppConstant.ADD_SELLER_FAILED);
		}
	}

	@Override
	public int update(String gstId, String sellerName)
	{
		try
		{
			return sellerDao.update(gstId, sellerName);
		}
		catch(Exception e)
		{
			throw CatalogueExceptionFactory.sellerOperationFailed(AppConstant.UPDATE_SELLER_FAILED_CODE, 
					AppConstant.UPDATE, AppConstant.UPDATE_SELLER_FAILED);
		}
	}

	@Override
	public int remove(String gstId)
	{
		try
		{
			return sellerDao.remove(gstId);
		}
		catch(Exception e)
		{
			throw CatalogueExceptionFactory.sellerOperationFailed(AppConstant.DELETE_SELLER_FAILED_CODE, 
					AppConstant.DELETE, AppConstant.DELETE_SELLER_FAILED);
		}
	}

	@Override
	public Seller getByGstId(String gstId)
	{
		try
		{
			return sellerDao.getByGstId(gstId);
		}
		catch(Exception e)
		{
			throw CatalogueExceptionFactory.sellerOperationFailed(AppConstant.GET_SELLER_FAILED_CODE, 
					AppConstant.GET, AppConstant.GET_SELLER_FAILED);
		}
	}

	@Override
	public List<Seller> getAll()
	{
		return sellerDao.getAll();
	}
}
