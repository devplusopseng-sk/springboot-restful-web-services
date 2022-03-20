package com.first.rest.webservices.restfulwebservices.helloworld;

public class HelloWroldBean {

	private String message;

	public HelloWroldBean(String message) {
		// TODO Auto-generated constructor stub
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "HelloWroldBean [message=" + message + "]";
	}

}
