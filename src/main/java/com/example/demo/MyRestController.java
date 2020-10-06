package com.example.demo;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/api/demo")
public class MyRestController {

	@RequestMapping(method=RequestMethod.GET)
	public String getMessage() {
		return "Hello from REST API";

}
}