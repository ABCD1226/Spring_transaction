package com.eec.tx.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.eec.tx.service.AccountService;

public class TestTwo {

	@Test
	public void test() {
		ApplicationContext ac = new ClassPathXmlApplicationContext(
				"applicationContext2.xml");
		AccountService service = (AccountService) ac.getBean("accountService");
		service.accountMoney();
	}

}
