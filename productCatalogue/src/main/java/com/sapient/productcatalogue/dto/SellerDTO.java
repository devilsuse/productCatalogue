package com.sapient.productcatalogue.dto;

import com.sapient.productcatalogue.model.Seller;

public class SellerDTO
{
	private String sellerName;

	public SellerDTO()
	{

	}

	public SellerDTO(Seller seller)
	{
		this.sellerName = seller.getSellerName();
	}

	public String getSellerName()
	{
		return sellerName;
	}

	public void setSellerName(String sellerName)
	{
		this.sellerName = sellerName;
	}
}
