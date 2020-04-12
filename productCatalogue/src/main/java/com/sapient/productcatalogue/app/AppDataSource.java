package com.sapient.productcatalogue.app;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

@Configuration
public class AppDataSource
{
	@Primary
	@Bean(name = "productCatalogueJdbcTemplate")
	public NamedParameterJdbcTemplate productCatalogueJdbcTemplate()
	{
		DataSource ds = productCatalogueDataSource1();
		return new NamedParameterJdbcTemplate(ds);
		// return new NamedParameterJdbcTemplate(productCatalogueDataSource1());
	}

	/*
	 * @Primary
	 * 
	 * @Bean
	 * 
	 * @ConfigurationProperties(prefix="ds.pc") public DataSource
	 * productCatalogueDataSource() { return DataSourceBuilder.create().build(); }
	 */
	@Primary
	@Bean
	public DataSource productCatalogueDataSource1()
	{
		/*
		 * DriverManagerDataSource dataSource = new DriverManagerDataSource();
		 * dataSource.setDriverClassName("org.h2.Driver");
		 * dataSource.setUrl("h2:mem:testdb"); dataSource.setUsername("sa");
		 * dataSource.setPassword("");
		 * 
		 * return dataSource;
		 */

		HikariConfig hikariConfig = new HikariConfig();
		hikariConfig.setDriverClassName("org.h2.Driver");
		hikariConfig.setUsername("sa");
		hikariConfig.setPassword("");
		hikariConfig.setJdbcUrl("jdbc:h2:mem:test;MODE=oracle;DB_CLOSE_DELAY=-1;DB_CLOSE_ON_EXIT=FALSE");
//	        dataSource.setJdbcUrl();
//	        dataSource.setUsername("sa");
//	        dataSource.setPassword("");
		return new HikariDataSource(hikariConfig);
	}
}
