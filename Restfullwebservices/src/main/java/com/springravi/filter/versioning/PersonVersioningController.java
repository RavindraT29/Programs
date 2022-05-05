package com.springravi.filter.versioning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonVersioningController {
	
	
	@GetMapping("v1/person")
	public PersonV1 personV1() {
		
		return new PersonV1("Bob Charlie");
		
	}
	@GetMapping("v2/person")
     public Name personV2() {
		
		return new Name("Bob", "Charlie");
		
	}

}
