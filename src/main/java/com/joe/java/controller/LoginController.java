package com.joe.java.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.joe.java.entity.UserEntity;
import com.joe.java.repository.UserRepository;

import vo.MessageVo;

@Controller
public class LoginController {
	
	@Autowired
	private UserRepository userRepository;
	
	@GetMapping("/login")
	public String login(Model model) {
		UserEntity user = new UserEntity();
		model.addAttribute("user", user);
		return "login";
	}
	
	@PostMapping("/verify/account")
	public String varifyAccount(@ModelAttribute UserEntity userEntity, Model model) {
		UserEntity user = userRepository.findByUserIdAndPassword(userEntity.getUserId(), userEntity.getPassword());
		if (ObjectUtils.isEmpty(user)) {
			UserEntity user1 = new UserEntity();
			model.addAttribute("user", user1);
			return "login";
		} else {
			model.addAttribute("user", user);
			return "index";
		}
		
	}
	
	@GetMapping("/signup")
	public String signUp(Model model) {
		UserEntity user1 = new UserEntity();
		model.addAttribute("user", user1);
		MessageVo msg = new MessageVo();
		model.addAttribute("msg", msg);
		return "signup";
	} 
	
	@PostMapping("/check/signup")
	public String checkSignUp(@ModelAttribute UserEntity userEntity, Model model) {
		String errorMessage = "";
		
		if (ObjectUtils.isEmpty(userEntity.getUserId())) {
			errorMessage += "帳號欄位不可為空\n";
		}
		if (ObjectUtils.isEmpty(userEntity.getPassword())) {
			errorMessage += "密碼欄位不可為空\n";
		}
		if (ObjectUtils.isEmpty(userEntity.getUserName())) {
			errorMessage += "暱稱欄位不可為空\n";
		}
		if (ObjectUtils.isEmpty(userEntity.getEmail())) {
			errorMessage += "Email欄位不可為空\n";
		}
		if (errorMessage != "") {
			UserEntity userForSign = new UserEntity();
			model.addAttribute("user", userForSign);
			MessageVo msg = new MessageVo();
			msg.setMessage(errorMessage);
			model.addAttribute("msg", msg);
			return "signup";
		}
		UserEntity isExist = userRepository.findByUserId(userEntity.getUserId());
		if (ObjectUtils.isEmpty(isExist) == false) {
			UserEntity userForSign = new UserEntity();
			model.addAttribute("user", userForSign);
			MessageVo msg = new MessageVo();
			msg.setMessage("註冊失敗，帳號已存在");
			model.addAttribute("msg", msg);
			return "signup";
		}
		
		userRepository.save(userEntity);
		model.addAttribute("user", userEntity);
		return "index";
		
	} 

}
