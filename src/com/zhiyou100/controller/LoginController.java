package com.zhiyou100.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zhiyou100.model.User;
import com.zhiyou100.service.LoginService;

@Controller
public class LoginController {

	@Autowired
	private LoginService loginService;
	
	@RequestMapping("login.do")
	public String login(String username,String password,Model model) {
		
		// 调用业务层方法,查询
		User user = loginService.findUserByLogin(username,password);
		System.out.println(user);
		// 判断
		if(user != null) {
			model.addAttribute("user", user);
			return "success";
		}
		return "redirect:index.jsp";
	}
	
	
}
