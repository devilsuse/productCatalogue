package com.sapient.productcatalogue.exception;

import org.springframework.http.HttpStatus;

public class CatalogueException extends RuntimeException
{
	private static final long serialVersionUID = 1L;

	private final HttpStatus status;
	private final String code;
	private final String property;

	public CatalogueException(HttpStatus status, String code, String property, String message)
	{
		super(message);
		this.status = status;
		this.code = code;
		this.property = property;
	}

	public static long getSerialversionuid()
	{
		return serialVersionUID;
	}

	public HttpStatus getStatus()
	{
		return status;
	}

	public String getCode()
	{
		return code;
	}

	public String getProperty()
	{
		return property;
	}
}
