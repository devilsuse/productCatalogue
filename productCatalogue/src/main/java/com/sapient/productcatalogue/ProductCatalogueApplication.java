package com.sapient.productcatalogue;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@PropertySource("classpath:sql/query.sql")
@PropertySource("classpath:sql/schema.sql")
@PropertySource("classpath:sql/data.sql")
//@PropertySource("classpath:appConfig/application-local.properties") //renamed folder to 'config' from 'appConfig' and now its auto detected
@SpringBootApplication
public class ProductCatalogueApplication
{
	public static void main(String[] args)
	{
		SpringApplication.run(ProductCatalogueApplication.class, args);
	}
}
