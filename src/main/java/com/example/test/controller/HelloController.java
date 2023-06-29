package com.example.test.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.test.dto.LoginDto;
import com.example.test.dto.UserDto;
import com.example.test.service.LoginService;
import com.example.test.service.SignUpService;


@Controller
public class HelloController {
	@Autowired
	LoginService loginService;
	@Autowired
	SignUpService signUpService;
	
	@RequestMapping("/")
	public String test() {
		return "main";
	}
	
	@RequestMapping("/login")
	public String login() {
		return "login";
	}
	
	@RequestMapping("/signup")
	public String signup() {
		return "signup";
	}
	
	@RequestMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:/";
	}
	
	@RequestMapping("/board")
	public String board() {
		return "board";
	}
	
	@RequestMapping("/loginresult")
	public String loginResult(@ModelAttribute LoginDto loginDto, HttpSession session) {
		if(loginService.isOkPassword(loginDto)) {
			session.setAttribute("member", loginDto.getUserEmail());
			return "redirect:/";
		}
		
		return "redirect:/login";
	}
	
	@RequestMapping("/signupresult")
	public String signUpResult(@ModelAttribute UserDto userDto) {
		if(signUpService.isSignUpFormValid(userDto)) {
			signUpService.save(userDto);
			return "redirect:/";
		}
		
		return "redirect:/signup";
	}
}