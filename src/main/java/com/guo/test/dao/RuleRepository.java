package com.guo.test.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import com.guo.test.bean.Rule;
import com.guo.test.bean.User;

@Mapper
@Component
public interface RuleRepository {

	Long add(Rule rule);
	
	List<Rule> list();
	
	Rule findById(Long id);
	
	Rule findByName(String name);
}
