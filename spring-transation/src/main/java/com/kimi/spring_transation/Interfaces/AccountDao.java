package com.kimi.spring_transation.Interfaces;

public interface AccountDao {
	public void outMoney(String out ,Double money);
	public void inMoney(String in ,Double money);
}
