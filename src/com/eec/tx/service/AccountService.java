package com.eec.tx.service;

import org.springframework.transaction.annotation.Transactional;

import com.eec.tx.dao.AccountDao;

@Transactional   // TestTwo方法，applicationContext2中事务管理器作用于这个类中所有方法
public class AccountService {

	private AccountDao accountDao;

	public void setAccountDao(AccountDao accountDao) {
		this.accountDao = accountDao;
	}

	public void accountMoney() {
		/*
		 * tom少1000
		 */
		accountDao.lessMoney();
		/*
		 * jerry多1000
		 */
		accountDao.moreMoney();
	}

}
