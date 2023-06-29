package com.example.test.service;

import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.test.dto.UserDto;
import com.example.test.entity.usertbl;
import com.example.test.repository.UserRepository;

@Service
public class SignUpService {
	@Autowired
	private UserRepository userRepository;
	
	public boolean isSignUpFormValid(UserDto userDto) {
		boolean isValidEmail = isEmailValid(userDto.getUserEmail());
		boolean isValidPassword = isPasswordValid(userDto.getUserPw());
		
		if(isValidEmail && isValidPassword)
			return true;
		
		return false;
	}
	
	public boolean isEmailValid(String userEmail) {
		String emailRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        return Pattern.matches(emailRegex, userEmail);
	}
	
	public boolean isPasswordValid(String userPw) {
		String passwordRegex = "^(?=.*[0-9])(?=.*[a-zA-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$";
		return Pattern.matches(passwordRegex, userPw);
	}
	
	public void save(UserDto userDto) {
		userRepository.save(new usertbl(userDto));
	}
}
