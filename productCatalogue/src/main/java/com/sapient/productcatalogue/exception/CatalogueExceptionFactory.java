package com.sapient.productcatalogue.exception;

import org.springframework.http.HttpStatus;
import static org.springframework.http.HttpStatus.INTERNAL_SERVER_ERROR;
import static org.springframework.http.HttpStatus.BAD_REQUEST;

public class CatalogueExceptionFactory
{
	public static CatalogueException from(HttpStatus status, String code, String property, String message)
	{
		if (status == null)
			return new CatalogueException(INTERNAL_SERVER_ERROR, code, property, message);
		return new CatalogueException(status, code, property, message);
	}
	
	public static CatalogueException internalErrorOccured()
	{
		return from(INTERNAL_SERVER_ERROR, "000", null, "An internal server error has occured. "
				+ "Please try again later or contact support if issue persists.");
	}
	
	public static CatalogueException invalidPropertyValue(String property, String message)
	{
		return from(BAD_REQUEST, "001", property, message);
	}
}
