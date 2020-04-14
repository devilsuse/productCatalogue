package com.sapient.productcatalogue.app;

import javax.sql.DataSource;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

@Configuration
public class AppDataSource
{
	@Primary
	@Bean(name = "productCatalogueJdbcTemplate")
	public NamedParameterJdbcTemplate productCatalogueJdbcTemplate()
	{
		DataSource ds = productCatalogueDataSource();
		return new NamedParameterJdbcTemplate(ds);
		// return new NamedParameterJdbcTemplate(productCatalogueDataSource1());
	}

	@Primary
	@Bean
	@ConfigurationProperties(prefix = "ds.pc")
	public DataSource productCatalogueDataSource()
	{
		return DataSourceBuilder.create().build();
	}


//	@Primary
//	@Bean 
//	public DataSource productCatalogueDataSource() 
//	{
//		HikariConfig hikariConfig = new HikariConfig();
//		hikariConfig.setDriverClassName("org.h2.Driver");
//		hikariConfig.setUsername("sa"); hikariConfig.setPassword("");
//		hikariConfig.setJdbcUrl(
//				"jdbc:h2:mem:test;MODE=oracle;DB_CLOSE_DELAY=-1;DB_CLOSE_ON_EXIT=FALSE");
//		return new HikariDataSource(hikariConfig); 
//	}

}
