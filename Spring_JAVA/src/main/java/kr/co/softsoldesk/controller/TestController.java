package kr.co.softsoldesk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestController {

	@RequestMapping(value = "/test1", method=RequestMethod.GET)
	public String test1_get() {
		return "test1";
	}
	
	@RequestMapping(value = "/test1", method=RequestMethod.POST)
	public String test1_post() {
		return "test1";
	}
	
	@RequestMapping(value = "/test2", method=RequestMethod.GET)
	public String test2_get() {
		return "test2";
	}
	@RequestMapping(value = "/test2", method=RequestMethod.POST)
	public String test2_post() {
		return "test2";
	}
	@GetMapping("/test3")
	public String test3_get() {
		return "test3";
	}	
	@PostMapping("/test3")
	public String test3_post() {
		return "test3";
	}
	//Get방식과 Post방식의 return값이(응답이) 같을 경우
	@RequestMapping(value= "/test4", method= {RequestMethod.GET,RequestMethod.POST})	
	public String test4() {
		return "test4";
	}	
	//Get방식과 Post방식의 return값이(응답이) 다를 경우
	@GetMapping("/test5")
	public String test5_get() {
		return "test5_get";
	}	
	@PostMapping("/test5")
	public String test5_post() {
		return "test5_post";
	}
	
}
