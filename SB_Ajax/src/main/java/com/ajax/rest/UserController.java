package com.ajax.rest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@GetMapping("/msg")
	@ResponseBody
	public String message(@RequestParam("name") String name) {
		
		String msg="Hello "+name;

		return msg;
	} 
	
	@GetMapping("/dropmsg")
	@ResponseBody
	public String messagedropdown(@RequestParam("cname") String cname) {
		
		String msg="Hello next I'm going to "+cname+" for Msaters ";

		return msg;
	} 
	
	
	
	
}
