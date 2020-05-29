package com.sapient.productcatalogue.model;

public class ProductSeller
{
	private Integer productSellerId;
	private Integer productId;
	private Integer sellerId;
	
	public Integer getProductSellerId()
	{
		return productSellerId;
	}
	public void setProductSellerId(Integer productSellerId)
	{
		this.productSellerId = productSellerId;
	}
	public Integer getProductId()
	{
		return productId;
	}
	public void setProductId(Integer productId)
	{
		this.productId = productId;
	}
	public Integer getSellerId()
	{
		return sellerId;
	}
	public void setSellerId(Integer sellerId)
	{
		this.sellerId = sellerId;
	}
}
