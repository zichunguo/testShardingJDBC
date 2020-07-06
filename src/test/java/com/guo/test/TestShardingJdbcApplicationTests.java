package com.guo.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.guo.test.bean.Rule;
import com.guo.test.bean.User;
import com.guo.test.dao.RuleRepository;
import com.guo.test.dao.UserRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestShardingJdbcApplicationTests {

	@Autowired
	private UserRepository userDao;
	
	@Autowired
	private RuleRepository ruleDao;
	
	@Test
	public void test() {
		User user = userDao.findById(2l);
		System.out.println(user.getId() + " - " + user.getName());
	}
	
	@Test
	public void test0() {
		for (int i = 0; i < 10; i++) {
			User user = new User();
			user.setName("hello");
			user.setCity("北京");
			user.setUid(2);
			userDao.addUser(user);
			System.out.println("*** 添加成功 ***");
		}
	}
	
	@Test
	public void test2() {
		Rule rule = ruleDao.findById(1l);
		System.out.println(rule.getId() + " - " + rule.getName());
	}
	
	@Test
	public void test3() {
		Rule rule = new Rule();
//		rule.setId(1);
		rule.setName("rule");
		ruleDao.add(rule);
		System.out.println("添加成功");
	}

}
