package com.sapient.productcatalogue.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import com.sapient.productcatalogue.model.Seller;

@Repository
public class SellerDaoImpl implements SellerDao
{
	@Autowired
	NamedParameterJdbcTemplate jdbcTemplate;

	@Value("${seller.add}")
	private String sellerAddSql;

	@Value("${seller.getById}")
	private String sellerGetByIdSql;

	@Value("${seller.getAll}")
	private String sellerGetAllSql;

	@Value("${seller.remove}")
	private String sellerRemoveSql;

	@Value("${seller.update}")
	private String sellerUpdateSql;

	@Override
	public int add(Seller seller)
	{
		SqlParameterSource beanSqlParameterSource = new BeanPropertySqlParameterSource(seller);
		return jdbcTemplate.update(sellerAddSql, beanSqlParameterSource);
	}

	@Override
	public Seller getById(int sellerId)
	{
		SqlParameterSource mapSqlParameterSource = new MapSqlParameterSource("sellerId", sellerId);
		return jdbcTemplate.queryForObject(sellerGetByIdSql, mapSqlParameterSource, new SellerRowMapper());
	}

	@Override
	public List<Seller> getAll()
	{
		return jdbcTemplate.query(sellerGetAllSql, new SellerRowMapper());
	}

	@Override
	public int update(int sellerId, String sellerName)
	{
		MapSqlParameterSource mapSqlParameterSource = new MapSqlParameterSource("sellerId", sellerId);
		mapSqlParameterSource.addValue("sellerName", sellerName);

		return jdbcTemplate.update(sellerUpdateSql, mapSqlParameterSource);
	}

	@Override
	public int remove(int sellerId)
	{
		SqlParameterSource mapSqlParameterSource = new MapSqlParameterSource("sellerId", sellerId);
		return jdbcTemplate.update(sellerRemoveSql, mapSqlParameterSource);
	}

	private static class SellerRowMapper implements RowMapper<Seller>
	{
		@Override
		public Seller mapRow(ResultSet rs, int rowNum) throws SQLException
		{
			Seller s = new Seller();
			s.setSellerId(rs.getInt("seller_id"));
			s.setSellerName(rs.getString("seller_name"));
			return s;
		}
	}
}
