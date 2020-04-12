package com.sapient.productcatalogue.constant;

public final class AppConstant
{
	private AppConstant()
	{
	}
	public final static String GET = "get";
	public final static String ADD = "add";
	public final static String UPDATE = "update";
	public final static String DELETE = "delete";
	
	public final static String EXC_GET_ALL_SELLERS = "Exception while fetching all sellers";
	public final static String ADD_SELLERS_SUCCESS = "Seller added successfully.";
	public static final String ADD_SELLER_FAILED = "Seller add failed.";
	public static final String ADD_SELLER_FAILED_CODE = "002";
	
	public final static String DELETE_SELLER_SUCCESS = "Seller deleted successfully.";
	public final static String DELETE_SELLER_FAILED = "Seller delete failed.";
	public final static String DELETE_SELLER_FAILED_CODE = "003";
	
	public final static String UPDATE_SELLER_SUCCESS = "Seller update successfully.";
	public final static String UPDATE_SELLER_FAILED = "Seller update failed.";
	public final static String UPDATE_SELLER_FAILED_CODE = "004";
	
	public final static String GET_SELLER_FAILED = "Couldn't fetch seller details.";
	public final static String GET_SELLER_FAILED_CODE = "005";
}
