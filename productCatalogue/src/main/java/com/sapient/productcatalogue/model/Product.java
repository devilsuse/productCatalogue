package com.sapient.productcatalogue.model;

public class Product 
{
	private int productId;
	private String productName;
	private int colorId;
	private int size;
	private int measurementUnitId;
	private int[] supplierIds;
	private int[] sellerIds;
	
	public int getProductId()
	{
		return productId;
	}
	public void setProductId(int productId)
	{
		this.productId = productId;
	}
	public String getProductName()
	{
		return productName;
	}
	public void setProductName(String productName)
	{
		this.productName = productName;
	}
	public int getColorId()
	{
		return colorId;
	}
	public void setColorId(int colorId)
	{
		this.colorId = colorId;
	}
	public int getSize()
	{
		return size;
	}
	public void setSize(int size)
	{
		this.size = size;
	}
	public int getMeasurementUnitId()
	{
		return measurementUnitId;
	}
	public void setMeasurementUnitId(int measurementUnitId)
	{
		this.measurementUnitId = measurementUnitId;
	}
	public int[] getSupplierIds()
	{
		return supplierIds;
	}
	public void setSupplierIds(int[] supplierIds)
	{
		this.supplierIds = supplierIds;
	}
	public int[] getSellerIds()
	{
		return sellerIds;
	}
	public void setSellerIds(int[] sellerIds)
	{
		this.sellerIds = sellerIds;
	}
}
