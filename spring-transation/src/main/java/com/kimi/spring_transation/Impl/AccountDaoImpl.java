package com.kimi.spring_transation.Impl;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.kimi.spring_transation.Interfaces.AccountDao;

public class AccountDaoImpl extends JdbcDaoSupport implements AccountDao {

	public void outMoney(String out, Double money) {
		String sql = "update account set money = money - ? where name = ?";
		this.getJdbcTemplate().update(sql,money,out);
	}

	public void inMoney(String in, Double money) {
		String sql = "update account set money = money + ? where name = ?";
		this.getJdbcTemplate().update(sql,money,in);
	}

}
