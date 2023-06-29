package com.example.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.test.dto.LoginDto;
import com.example.test.repository.UserRepository;

@Service
public class LoginService {
	@Autowired
	private UserRepository userRepository;
	
	public boolean isOkPassword(LoginDto loginDto) {
		try {
			String userPw = userRepository.getPassword(loginDto.getUserEmail());
			if(loginDto.getUserPw().equals(userPw)) {
				return true;
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return false;
	}
}
