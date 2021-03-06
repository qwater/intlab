package com.zju.catcher.dao.local;

import java.util.List;

import com.zju.catcher.entity.local.Distribute;
import com.zju.catcher.entity.User;

public interface UserDao {

	public List<String> exsitUserList();
	
	public void insertUser(User user);
	
	public List<User> getAllUser();
	
	public List<Distribute> getDistribute(String testId);
	
	public void updateDistribute(final List<Distribute> list);
	
	public void saveDistribute(List<Distribute> list);
}
