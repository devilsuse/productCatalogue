package com.sapient.productcatalogue;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@PropertySource("classpath:sql/query.sql")
@PropertySource("classpath:sql/schema.sql")
@PropertySource("classpath:sql/data.sql")
@SpringBootApplication
public class ProductCatalogueApplication
{
	public static void main(String[] args)
	{
		SpringApplication.run(ProductCatalogueApplication.class, args);
	}
}
