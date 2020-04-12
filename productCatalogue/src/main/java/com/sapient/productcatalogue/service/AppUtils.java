package com.sapient.productcatalogue.service;

import static org.springframework.http.HttpStatus.OK;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.sapient.productcatalogue.dto.ErrorApi;
import com.sapient.productcatalogue.dto.ResponseAPI;
import com.sapient.productcatalogue.exception.CatalogueException;
import com.sapient.productcatalogue.exception.CatalogueExceptionFactory;

public class AppUtils
{
	private AppUtils()
	{
	}

	public static ResponseEntity<?> toResponseEntity(ResponseAPI responseAPI)
	{
		return toResponseEntity(responseAPI, OK);
	}
	
	public static ResponseEntity<?> toResponseEntity(ResponseAPI responseAPI, HttpStatus status)
	{
		return new ResponseEntity<ResponseAPI>(responseAPI, status);
	}
	
	public static ResponseEntity<?> toResponseEntity(Throwable throwable)
	{
		ResponseAPI responseAPI = toResponseApi(throwable);
		return new ResponseEntity<ResponseAPI>(responseAPI, responseAPI.getErrorApi().getStatus());
	}
	
	public static ResponseAPI toResponseApi(Throwable throwable)
	{
		CatalogueException cException = null;
		if (throwable instanceof CatalogueException)
			cException = (CatalogueException)throwable;
		else if(throwable != null && throwable.getCause() != null && throwable.getCause() instanceof CatalogueException)
			cException = (CatalogueException)throwable.getCause();
		else
			cException = CatalogueExceptionFactory.internalErrorOccured();
		
		return new ResponseAPI(toErrorApi(cException));
	}

	private static ErrorApi toErrorApi(CatalogueException cException)
	{
		return new ErrorApi(cException);
	}
	
}
