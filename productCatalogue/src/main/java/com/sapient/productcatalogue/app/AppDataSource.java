package com.sapient.productcatalogue.app;

import javax.sql.DataSource;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

@Configuration
public class AppDataSource
{
	@Bean(name="productCatalogueJdbcTemplate")
	public NamedParameterJdbcTemplate productCatalogueJdbcTemplate()
	{
		return new NamedParameterJdbcTemplate(productCatalogueDataSource());
	}
	
	@ConfigurationProperties(prefix="ds.pc")
	public DataSource productCatalogueDataSource()
	{
		return DataSourceBuilder.create().build();
	}
}
