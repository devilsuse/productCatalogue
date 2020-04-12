package com.sapient.productcatalogue.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Seller
{
	/**
	 * Don't expose internal Id in APIs
	 */
	@JsonIgnore
	private int sellerId;

	private String sellerName;
	
	/**
	 * It's registered Id with the authority permitting one to do business.
	 * In India it's GST, so using it.
	 */
	private String gstId;

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

	public String getGstId()
	{
		return gstId;
	}

	public void setGstId(String gstId)
	{
		this.gstId = gstId;
	}
}
