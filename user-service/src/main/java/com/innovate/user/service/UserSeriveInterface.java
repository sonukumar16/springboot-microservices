package com.innovate.user.service;

import com.innovate.user.VO.ResponseTemplateVO;
import com.innovate.user.entity.User;

public interface UserSeriveInterface {

	ResponseTemplateVO getUserWithDepartment(Long userId);

	User saveUser(User user);
 
}
