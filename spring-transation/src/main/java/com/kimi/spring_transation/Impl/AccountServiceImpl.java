package com.kimi.spring_transation.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.kimi.spring_transation.Interfaces.AccountService;

@Transactional(propagation=Propagation.REQUIRED)
public class AccountServiceImpl implements AccountService {
	@Autowired
	private AccountDaoImpl accountDaoImpl;
	
//	//事务模板
//	@Autowired
//	private TransactionTemplate transactionTemplate;
//	
//	public void transfer(final String out, final String in, final Double money) {
//		transactionTemplate.execute(new TransactionCallbackWithoutResult() {
//			@Override
//			protected void doInTransactionWithoutResult(TransactionStatus arg0) {
//				//具体的事务操作
//				accountDaoImpl.outMoney(out, money);
//				int i = 1 / 0;
//				accountDaoImpl.inMoney(in, money);
//			}
//		});
//	}
	
	public void transfer( String out,  String in,  Double money) {
		accountDaoImpl.outMoney(out, money);
//		int i = 1 / 0;
		accountDaoImpl.inMoney(in, money);
	}
	
}
