package com.shxt.controller;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
//相当于<bean id="indexController" class="com.shxt.controller.IndexController"/>
@Controller
@Scope(value="prototype")
public class IndexController {
	
	@RequestMapping(value="shxt",params="shxt1=value1")
	public ModelAndView index02(){
		
		ModelAndView modelAndView = new ModelAndView("hello");
		
		return modelAndView;
	}
	
	@RequestMapping(value="/user/{user_id}/{account}")
	public ModelAndView index(@PathVariable()String user_id,@PathVariable("account")String a){
		System.out.println(user_id+"|"+a);
		ModelAndView modelAndView = new ModelAndView("hello");
		
		return modelAndView;
	}
	@RequestMapping(value="/send01")
	public ModelAndView index1(@RequestParam(value="account")String account,@RequestParam(value="password")String password){
		System.out.println(account+"|"+password);
		ModelAndView modelAndView = new ModelAndView("hello");
		
		return modelAndView;
	}
	@RequestMapping(value="/send02")
	public ModelAndView index2(@RequestParam(value="account")String account, String password,@RequestParam(defaultValue="100" ,required=false)Integer age){
		System.out.println(account+"|"+password+"|"+age);
		ModelAndView modelAndView = new ModelAndView("hello");
		
		return modelAndView;
	}
	

	

}
