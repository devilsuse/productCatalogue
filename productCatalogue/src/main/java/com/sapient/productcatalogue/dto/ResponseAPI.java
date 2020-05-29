package com.sapient.productcatalogue.dto;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.sapient.productcatalogue.model.ProductSeller;
import com.sapient.productcatalogue.model.Seller;

public class ResponseAPI implements Serializable
{
	private static final long serialVersionUID = 1L;

	@JsonInclude(JsonInclude.Include.NON_NULL)
	@JsonProperty("error")
	private ErrorApi errorApi;
	private String message;

	private List<Seller> sellers;
	private List<ProductSeller> productSellers;
	
	public ResponseAPI()
	{
	}
	
	public List<ProductSeller> getProductSellers()
	{
		return productSellers;
	}

	public void setProductSellers(List<ProductSeller> productSellers)
	{
		this.productSellers = productSellers;
	}

	public ResponseAPI(ErrorApi errorApi)
	{
		this.errorApi = errorApi;
	}
	
	public ErrorApi getErrorApi()
	{
		return errorApi;
	}

	public void setErrorApi(ErrorApi errorApi)
	{
		this.errorApi = errorApi;
	}

	public List<Seller> getSellers()
	{
		return sellers;
	}

	public void setSellers(List<Seller> sellers)
	{
		this.sellers = sellers;
	}

	public static long getSerialversionuid()
	{
		return serialVersionUID;
	}
	
	public String getMessage()
	{
		return message;
	}

	public void setMessage(String message)
	{
		this.message = message;
	}

}
