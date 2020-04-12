package com.sapient.productcatalogue.dto;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.sapient.productcatalogue.model.Seller;

public class ResponseAPI implements Serializable
{
	private static final long serialVersionUID = 1L;

	@JsonInclude(JsonInclude.Include.NON_NULL)
	private ErrorApi errorApi;

	private List<Seller> sellers;

	public ResponseAPI()
	{
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

}
