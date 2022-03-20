package com.first.rest.webservices.restfulwebservices.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@RequestMapping(path = "hello-world-rm", method = RequestMethod.GET)
	public String helloWorldReqMap() {
		return "Hello World";
	}

	@GetMapping(path = "/hello-world")
	public String helloWorld() {
		return "Hello World";
	}
	
	@GetMapping(path = "/hello-world-bean")
	public HelloWroldBean helloWorldBean() {
		return new HelloWroldBean("Hello World");
	}
	
	@GetMapping(path = "/hello-world/path-variable/{name}")
	public HelloWroldBean helloWorldPathVariable(@PathVariable String name) {
		return new HelloWroldBean(String.format("Hello World, %s", name));
	}

}
