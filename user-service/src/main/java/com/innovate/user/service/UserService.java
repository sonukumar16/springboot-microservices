package com.innovate.user.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.innovate.user.VO.Department;
import com.innovate.user.VO.ResponseTemplateVO;
import com.innovate.user.entity.User;
import com.innovate.user.respository.UserRespository;

@Service
public class UserService implements UserSeriveInterface{

	@Autowired
	private UserRespository userRespository;
	
	@Autowired
	private RestTemplate restTemplate;

	@Override
	public User saveUser(User user) {
		// TODO Auto-generated method stub
		return  userRespository.save(user);
	}

	
	@Override
	public ResponseTemplateVO getUserWithDepartment(Long userId) {
		ResponseTemplateVO vo = new ResponseTemplateVO();
		Optional<User> optionUser = userRespository.findByUserId(userId);
		if(optionUser.isPresent()) {
		User user = optionUser.get();
			Department department = restTemplate.getForObject("http://DEPARTMENT-SERVICE/departments/" + user.getDepartmentId(),
					Department.class);
			vo.setUser(user);
			vo.setDepartment(department); 
		}
		return vo;
	}
	
	
}
