package com.example.test.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.example.test.dto.UserDto;

@Entity
public class usertbl {
	@Id
	private String userEmail;
	private String userPw;
	
	public usertbl() {
		
	}
	
	public usertbl(UserDto userDto) {
		userEmail = userDto.getUserEmail();
		userPw = userDto.getUserPw();
	}
}
