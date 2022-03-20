package com.first.rest.webservices.restfulwebservices.versioning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersioningController {

	// URI versioning

	@GetMapping("v1/person")
	public PersonV1 personV1() {
		return new PersonV1("Sachin Tendulkar");
	}

	@GetMapping("v2/person")
	public PersonV2 personV2() {
		return new PersonV2(new Name("Sachin", "Tendulkar"));
	}

	// Path variable param versioning

	@GetMapping(value = "/person/param", params = "version=1")
	public PersonV1 paramPersonV1() {
		return new PersonV1("Sachin Tendulkar");
	}

	@GetMapping(value = "/person/param", params = "version=2")
	public PersonV2 paramPersonV2() {
		return new PersonV2(new Name("Sachin", "Tendulkar"));
	}

	// Header versioning

	@GetMapping(value = "/person/header", headers = "X-API-VERSION=1")
	public PersonV1 headerPersonV1() {
		return new PersonV1("Sachin Tendulkar");
	}

	@GetMapping(value = "/person/header", headers = "X-API-VERSION=2")
	public PersonV2 headerPersonV2() {
		return new PersonV2(new Name("Sachin", "Tendulkar"));
	}

	// Produces or Accept header versioning: need to add in headers Accept = application/vnd.company.app-v*+json (* is 1 and 2)

	@GetMapping(value = "/person/produces", produces = "application/vnd.company.app-v1+json")
	public PersonV1 producesPersonV1() {
		return new PersonV1("Sachin Tendulkar");
	}

	@GetMapping(value = "/person/produces", produces = "application/vnd.company.app-v2+json")
	public PersonV2 producesPersonV2() {
		return new PersonV2(new Name("Sachin", "Tendulkar"));
	}

//	Factors needs to be consider while versionning
//  URI Pollution
//  Misuse of HTTP Headers
//  Caching
//  Can we execute the request on browser?
//  API Documentation
//  No Perfect Solution all depends on needs

}
