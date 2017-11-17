package com.qingshixun.project.controller;

import java.util.List;

import javax.jws.WebParam.Mode;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.qingshixun.project.model.DefaultUser;
import com.qingshixun.project.model.SimpleUser;

@Controller
@RequestMapping(value="user")
public class UserController {

	@RequestMapping(value="{userType}/register")
	public String registerPage(Model model, @PathVariable String userType) {
		System.out.println("进入:" + userType + " 用户注册界面");
		return userType + "Register";
	}

	@RequestMapping(value = "simple/register/save",method=RequestMethod.POST)
	public ModelAndView simpleUserRegister(@Valid SimpleUser simpleUser,BindingResult bindingResult) {
		ModelAndView modelAndView = new ModelAndView();
		if(bindingResult.hasErrors()){
			// 获取所有错误信息
			List<ObjectError> allErrors = bindingResult.getAllErrors();
			
			// 循环输出并添加错误到sb中
			StringBuffer sb = new StringBuffer();
			for (ObjectError objectError : allErrors) {
				sb.append(objectError.getDefaultMessage()+";");
			}
			sb.substring(0, sb.length()-1);
			
			//modelandview 中存放信息
			modelAndView.addObject("message", sb);
			modelAndView.setViewName("simpleRegister");
			return modelAndView;
		}else
			modelAndView.setViewName("registerSuccess");
		return modelAndView;
	}

	@RequestMapping(value = "default/register/save",method=RequestMethod.POST)
	public ModelAndView defaultUserRegister(@Valid DefaultUser defaultUser,BindingResult bindingResult) {
		ModelAndView modelAndView = new ModelAndView();
		if(bindingResult.hasErrors()){
			// 获取所有错误信息
			List<ObjectError> allErrors = bindingResult.getAllErrors();
			
			// 循环输出并添加错误到sb中
			StringBuffer sb = new StringBuffer();
			for (ObjectError objectError : allErrors) {
				sb.append(objectError.getDefaultMessage()+";");
			}
			sb.substring(0, sb.length()-1);
			
			//modelandview 中存放信息
			modelAndView.addObject("message", sb);
			modelAndView.setViewName("defaultRegister");
			return modelAndView;
		}else
			modelAndView.setViewName("registerSuccess");
		return modelAndView;
	}
}
