package com.sapient.productcatalogue.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.support.DaoSupport;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.sapient.productcatalogue.dto.ProductDTO;
import com.sapient.productcatalogue.model.Product;

@Repository
public class ProductQueryDaoImpl
{
	@Autowired
	private NamedParameterJdbcTemplate pcJdbcTemplate;

	/*
	 * public List<Product> getAllProducts() { List<Product> products = null; return
	 * products; }
	 * 
	 * public boolean addProduct() { boolean success = false;; return success; }
	 * 
	 * public List<Product> getAllProducts() { List<Product> products = null; return
	 * products; }
	 * 
	 * public List<Product> getAllProducts() { List<Product> products = null; return
	 * products; }
	 * 
	 * public List<Product> getAllProducts() { List<Product> products = null; return
	 * products; }
	 */
}
