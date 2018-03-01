package com.eec.tx.dao;

import org.springframework.jdbc.core.JdbcTemplate;

public class AccountDao {
	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	// 以下是转账操作
	/**
	 * 减钱
	 */
	public void lessMoney() {
		String sql = " update account set salary=salary-? where user_name=? ";
		jdbcTemplate.update(sql, 1000, "tom");
	}

	/**
	 * 加钱,如果在加钱的方法里面出现异常，就会出现，一方已经减钱，而另一方没有加钱。故应该使用事务进行
	 */
	public void moreMoney() {
		String sql = " update account set salary=salary+? where user_name=? ";
		/*int i=9;
		int j=0;
		int z=i/j;
		System.out.println(z);*/
		jdbcTemplate.update(sql, 1000, "jerry");
	}

}
