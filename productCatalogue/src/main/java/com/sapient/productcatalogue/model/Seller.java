package com.sapient.productcatalogue.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Seller
{
	private int sellerId;

	@JsonProperty
	private String sellerName;

	public int getSellerId()
	{
		return sellerId;
	}

	public void setSellerId(int sellerId)
	{
		this.sellerId = sellerId;
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
