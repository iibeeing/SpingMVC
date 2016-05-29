package com.bee.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bee.base.dao.IBaseDao;
import com.bee.base.dao.impl.BaseDao;
import com.bee.domain.User;

@Service
public class UserService {
	@Autowired
	IBaseDao<User,String> baseDao;
	
	public void createUser(User user){
		baseDao.save(user);
		System.out.println("save user.");
	}

	public User getUserById(String userId) {
		User user = new User();
		user.setUserId(userId);
		user.setUserName("test");
		return user;
	}
	
}
