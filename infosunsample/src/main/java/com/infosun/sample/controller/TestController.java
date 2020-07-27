/**
 * 
 */
package com.infosun.sample.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jagadeeshb
 *
 */
@RestController
@RequestMapping(value = "/infosun/")
public class TestController {
	
	@RequestMapping(value = "/helloworld/", method = RequestMethod.POST, 
			consumes = {"application/XML"}, produces = {"application/JSON"},
			headers = {"content-type=text/plain", "content-type=text/html"})
	public String createAuthenticationToken() {

		return "Hello Infosun Technologies";
	}

}
