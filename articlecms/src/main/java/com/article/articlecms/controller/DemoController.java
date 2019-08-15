package com.article.articlecms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jayant
 *
 */
@RestController
public class DemoController {

	@Autowired
	private Environment environment;

	@RequestMapping(value = "/hallo/{name}", method = RequestMethod.GET)
	public String sayhi(@PathVariable String name) {
		return "Hallo <h2> " + name + "</h1>";
	}
}
