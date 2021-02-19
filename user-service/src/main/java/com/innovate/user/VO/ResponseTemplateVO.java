package com.innovate.user.VO;

import com.innovate.user.entity.User;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class ResponseTemplateVO {

	private User user;
	private Department department;
}
