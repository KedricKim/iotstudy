package com.iot.kedric.user.dao;

import java.util.List;

import com.iot.kedric.user.dao.dto.UserInfo;

public interface UserDAO {

	public UserInfo selectUser(UserInfo user);

	public List<UserInfo> selectUserList(UserInfo user);
	
	public int insertUser(UserInfo user);
	
	public int deletetUser(UserInfo user);
	
	public int updateUser(UserInfo user);

}
